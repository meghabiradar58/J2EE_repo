package com.jspirds.Musicplayers;

import java.util.ArrayList;
import java.util.Scanner;



public class songOperation {
	
	
	static song song = new song();
	Scanner sc = new Scanner(System.in);
	ArrayList<song> songsList = new ArrayList();

	public void chooseSongToPlay() {

		System.out.println(" enter the id of song you want to Play.");
		
		for (song song : songsList) {
			System.out.println(song);
		}
		
		int choice = sc.nextInt();
		System.out.println(songsList.get(choice - 1).getSongName() + " is playing");

	}

	public void playAllSongs() {
		for (int i = 0; i < songsList.size(); i++) {
			System.out.println(songsList.get(i).getSongName() + " is playing");
		}

	}

	public void playRandomSong() {

		int randomSong = (int) Math.random() * 10;
		System.out.println(songsList.get(randomSong).getSongName() + " is now playing...");
		}

	public void addSongs() {

		System.out.println(" enter how many songs you want to ADD.");
		int choice = sc.nextInt();
		System.out.println(" enter the details of songs ");
		for (int i = 0; i < choice; i++) {
			song song = new song();

			System.out.println("Enter the song id: ");
			int id = sc.nextInt();
			song.setId(id);

			System.out.println("Enter the song name: ");
			String songName = sc.next();
			song.setSongName(songName);
			sc.nextLine();

			System.out.println("Enter the song singer name: ");
			String singer = sc.nextLine();
			song.setSingerName(singer);

			System.out.println("Enter the song movie name: ");
			String movie = sc.nextLine();
			song.setMovieName(movie);

			System.out.println("Enter the song composer: ");
			String musicComposer = sc.nextLine();
			song.setComposer(musicComposer);

			System.out.println("Enter the song lycricist: ");
			String writer = sc.nextLine();
			song.setLyricist(writer);

			System.out.println("Enter the song length: ");
			double duration = sc.nextDouble();
			song.setLength(duration);

			songsList.add(song);

			System.out.println("Songs added \n" + songsList.get(i));
		}
		
		for (song song : songsList) {
			System.out.println(song);
		}
		
	}

	public void removeSong() {

		System.out.println(" enter the id of songs you want to Remove.");

		int removedSong = sc.nextInt();
		System.out.println(songsList.remove(removedSong - 1).getSongName() + " is removed.");

	}

	public void updateSong() {
		System.out.println("Please select the id of song you want to update");
		
		for (song song : songsList) {
			System.out.println(song);
		}
	
		int updateId = sc.nextInt();

		System.out.println(" select what do you want to update. \n1.Id \n2.SongName \n3.SingerName"
				+ "\n4.MovieName \n5.Composer \n6.Lyricist \n7.Length");
		int choice1 = sc.nextInt();
		switch (choice1) {
		case 1:
			System.out.println("Enter the updated ID");
			int updatedId = sc.nextInt();
			songsList.get(updateId - 1).setId(updatedId);
			System.out.println("Details Updated");
			break;
		case 2:
			System.out.println("Enter the updated Song Name");
			sc.nextLine();
			songsList.get(updateId - 1).setSongName(sc.nextLine());
			System.out.println("Details Updated");
			break;
		case 3:
			System.out.println("Enter the updated Singer Name");
			sc.nextLine();
			String updatedSinger = sc.nextLine();
			songsList.get(updateId - 1).setSingerName(updatedSinger);
			System.out.println("Details Updated");
			break;
		case 4:
			System.out.println("Enter the updated Movie Name");
			sc.nextLine();
			songsList.get(updateId - 1).setMovieName(sc.nextLine());
			System.out.println("Details Updated");
			break;
		case 5:
			System.out.println("Enter the updated Composer Name");
			sc.nextLine();
			songsList.get(updateId - 1).setComposer(sc.nextLine());
			System.out.println("Details Updated");
			break;
		case 6:
			System.out.println("Enter the updated Lyricist");
			sc.nextLine();
			songsList.get(updateId - 1).setLyricist(sc.nextLine());
			System.out.println("Details Updated");
			break;
		case 7:
			System.out.println("Enter the updated Length");
			songsList.get(updateId - 1).setLength(sc.nextDouble());
			System.out.println("Details Updated");
			break;
		default:
			System.out.println("Invalid Input. \nPlease provide a Valid Input");
			break;
		}
	}

}