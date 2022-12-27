package com.jspirds.MusicplayerJDBC;

import java.util.Scanner;

public class Multiplayer {
	static SongOperation songOperation = new SongOperation();
	static boolean loop = true;
public static void main(String[] args) {
	System.out.println("Welcome to the Music Player");
	songOperation.openConnection();
	songOperation.createAndDropTable();
	System.out.println(" ADD some Songs to enjoy the Music Player");
	
	while (loop) {
		System.out.println("select a option from the menu given below."
				+ "\n1.Play Songs \n2.Add/Remove Songs \n3.Edit Song \n4.Exit ");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("select from the given option \n1.Choose Song to Play \n2.Play All Songs"
					+ "\n3.Play Randon Song");
			int choice1 = sc.nextInt();

			switch (choice1) {
			case 1:
				try {
					songOperation.chooseSongToPlay();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				break;
			case 2:
				songOperation.playAllSongs();

				break;
			case 3:
				songOperation.playRandomSong();
				break;
			default:
				System.out.println("Invalid Input. \nEnter a Valid Input");
				break;
			}
			break;

		case 2:
			System.out.println(" select from the given option \n1.Add Songs \n2.Remove Song");
			int choice2 = sc.nextInt();

			switch (choice2) {
			case 1:
				try {
					songOperation.addSongs();
				} catch (Exception e) {
					e.printStackTrace();
				}

				break;
			case 2:
				songOperation.removeSong();
				break;
			default:
				System.out.println("Invalid Input. \n provide a Valid Input");
				break;
			}
			break;

		case 3:
			System.out.println("select from the given option \n1.Update Song");
			int choice3 = sc.nextInt();

			switch (choice3) {
			case 1:
				songOperation.updateSong();
				break;

			default:
				System.out.println("Invalid Input. \n provide a Valid Input");
				break;
			}
			break;

		case 4:
			songOperation.closeConnection();
			
			break;

		default:
			System.out.println("Invalid Input. \n provide a Valid Input");
			loop=false;
			break;
		}
	}

	
}
}
