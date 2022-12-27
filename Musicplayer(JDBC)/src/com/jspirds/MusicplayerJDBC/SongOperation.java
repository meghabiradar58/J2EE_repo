package com.jspirds.MusicplayerJDBC;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;


public class SongOperation {
	static Song song = new Song();
	static Connection connection;
	static ResultSet resultSet;
	static FileReader fileReader;
	static Properties properties = new Properties();
	static PreparedStatement preparedStatement;
	static String filePath = "D:\\JWEJE2\\Musicplayer(JDBC)\\resource\\db_info.properties";
	static String query;
	static int resultInt;
	Scanner sc = new Scanner(System.in);

	public void chooseSongToPlay() {
		System.out
				.println("-------------------------------------------------------------------------------------------");
		query = "select * from musicPlayer";
		try {
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " | " + resultSet.getString(2) + " | " + resultSet.getString(3)
						+ " | " + resultSet.getString(4) + " | " + resultSet.getString(5) + " | "
						+ resultSet.getString(6) + " | " + resultSet.getDouble(7));
			}
			System.out.println(
					"-------------------------------------------------------------------------------------------");
			query = "select songName from musicPlayer where id = ?";
			preparedStatement = connection.prepareStatement(query);
			System.out.println("Enter the id of song that you want to play.");
			preparedStatement.setInt(1, sc.nextInt());
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + " is now playing");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void playAllSongs() {
		try {
			query = "select songName from musicPlayer";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + " is now playing");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void playRandomSong() {
		try {
			query = "select songName from musicPlayer order by rand() limit 1";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + " is now playing");
			}
			System.out.println(
					"-------------------------------------------------------------------------------------------");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void addSongs() {
		System.out.println("Please enter the number of songs you want to ADD");
		int addSongCount = sc.nextInt();
		for (int i = 0; i < addSongCount; i++) {
			query = "insert into musicPlayer values (?,?,?,?,?,?,?)";
			try {
				preparedStatement = connection.prepareStatement(query);
				System.out.println("Enter Song ID");
				preparedStatement.setInt(1, sc.nextInt());
				System.out.println("Enter Song Name");
				sc.nextLine();
				preparedStatement.setString(2, sc.nextLine());
				System.out.println("Enter Singer");
				preparedStatement.setString(3, sc.nextLine());
				System.out.println("Enter Movie Name");
				preparedStatement.setString(4, sc.nextLine());
				System.out.println("Enter Composer");
				preparedStatement.setString(5, sc.nextLine());
				System.out.println("Enter Lyricist");
				preparedStatement.setString(6, sc.nextLine());
				System.out.println("Enter Song Length");
				preparedStatement.setDouble(7, sc.nextDouble());

				resultInt = preparedStatement.executeUpdate();
				System.out.println("Query OK " + resultInt + " song details added to the row");
				System.out.println(
						"-------------------------------------------------------------------------------------------");

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		query = "select * from musicPlayer";
		try {
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " | " + resultSet.getString(2) + " | " + resultSet.getString(3)
						+ " | " + resultSet.getString(4) + " | " + resultSet.getString(5) + " | "
						+ resultSet.getString(6) + " | " + resultSet.getDouble(7));
			}
			System.out.println(
					"-------------------------------------------------------------------------------------------");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void removeSong() {
		try {
			System.out.println(
					"-------------------------------------------------------------------------------------------");
			query = "select * from musicPlayer";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " | " + resultSet.getString(2) + " | " + resultSet.getString(3)
						+ " | " + resultSet.getString(4) + " | " + resultSet.getString(5) + " | "
						+ resultSet.getString(6) + " | " + resultSet.getDouble(7));
			}
			System.out.println(
					"-------------------------------------------------------------------------------------------");
			query = "delete from musicPlayer where id = ?";
			preparedStatement = connection.prepareStatement(query);
			System.out.println("Enter the ID of song which you to remove");
			preparedStatement.setInt(1, sc.nextInt());
			resultInt = preparedStatement.executeUpdate();
			System.out.println(resultInt + " song removed");
			System.out.println(
					"-------------------------------------------------------------------------------------------");
			System.out.println("Updated Table \n");
			query = "select * from musicPlayer";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " | " + resultSet.getString(2) + " | " + resultSet.getString(3)
						+ " | " + resultSet.getString(4) + " | " + resultSet.getString(5) + " | "
						+ resultSet.getString(6) + " | " + resultSet.getDouble(7));
			}
			System.out.println(
					"-------------------------------------------------------------------------------------------");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateSong() {
		try {
			System.out.println(
					"-------------------------------------------------------------------------------------------");
			query = "select * from musicPlayer";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " | " + resultSet.getString(2) + " | " + resultSet.getString(3)
						+ " | " + resultSet.getString(4) + " | " + resultSet.getString(5) + " | "
						+ resultSet.getString(6) + " | " + resultSet.getDouble(7));
			}
			System.out.println(
					"-------------------------------------------------------------------------------------------");
			System.out.println("Please select what do you want to update. \n1.Id \n2.SongName \n3.SingerName"
					+ "\n4.MovieName \n5.Composer \n6.Lyricist \n7.Length");
			int updateChoice = sc.nextInt();
			switch (updateChoice) {
			case 1:
				query = "update musicPlayer set id = ? where songName = ?";
				preparedStatement = connection.prepareStatement(query);
				System.out.println("Enter new id name");
				preparedStatement.setInt(1, sc.nextInt());
				sc.nextLine();
				System.out.println("Enter ID where you want to update the id name");
				preparedStatement.setString(2, sc.nextLine());
				resultInt = preparedStatement.executeUpdate();
				System.out.println(resultInt + " song details updated");
				break;
			case 2:
				query = "update musicPlayer set songName = ? where id = ?";
				preparedStatement = connection.prepareStatement(query);
				System.out.println("Enter new songName name");
				preparedStatement.setString(1, sc.next());
				System.out.println("Enter ID where you want to update the songName name");
				preparedStatement.setInt(2, sc.nextInt());
				resultInt = preparedStatement.executeUpdate();
				System.out.println(resultInt + " song details updated");
				break;
			case 3:
				query = "update musicPlayer set singer = ? where id = ?";
				preparedStatement = connection.prepareStatement(query);
				System.out.println("Enter new singer name");
				preparedStatement.setString(1, sc.next());
				System.out.println("Enter ID where you want to update the singer name");
				preparedStatement.setInt(2, sc.nextInt());
				resultInt = preparedStatement.executeUpdate();
				System.out.println(resultInt + " song details updated");
				break;
			case 4:
				query = "update musicPlayer set movieName = ? where id = ?";
				preparedStatement = connection.prepareStatement(query);
				System.out.println("Enter new movieName name");
				preparedStatement.setString(1, sc.next());
				System.out.println("Enter ID where you want to update the movieName name");
				preparedStatement.setInt(2, sc.nextInt());
				resultInt = preparedStatement.executeUpdate();
				System.out.println(resultInt + " song details updated");
				break;
			case 5:
				query = "update musicPlayer set composer = ? where id = ?";
				preparedStatement = connection.prepareStatement(query);
				System.out.println("Enter new composer name");
				preparedStatement.setString(1, sc.next());
				System.out.println("Enter ID where you want to update the composer name");
				preparedStatement.setInt(2, sc.nextInt());
				resultInt = preparedStatement.executeUpdate();
				System.out.println(resultInt + " song details updated");
				break;
			case 6:
				query = "update musicPlayer set lycricist = ? where id = ?";
				preparedStatement = connection.prepareStatement(query);
				System.out.println("Enter new lycricist name");
				preparedStatement.setString(1, sc.next());
				System.out.println("Enter ID where you want to update the lycricist name");
				preparedStatement.setInt(2, sc.nextInt());
				resultInt = preparedStatement.executeUpdate();
				System.out.println(resultInt + " song details updated");
				break;
			case 7:
				query = "update musicPlayer set length = ? where id = ?";
				preparedStatement = connection.prepareStatement(query);
				System.out.println("Enter new length");
				preparedStatement.setDouble(1, sc.nextDouble());
				System.out.println("Enter ID where you want to update the length");
				preparedStatement.setInt(2, sc.nextInt());
				resultInt = preparedStatement.executeUpdate();
				System.out.println(resultInt + " song details updated");
				break;
			default:
				System.out.println("Invalid Inupt...Please provide a valid Input");
				break;
			}
			
			System.out.println(
					"-------------------------------------------------------------------------------------------");
			System.out.println("Updated Table \n");
			query = "select * from musicPlayer";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " | " + resultSet.getString(2) + " | " + resultSet.getString(3)
						+ " | " + resultSet.getString(4) + " | " + resultSet.getString(5) + " | "
						+ resultSet.getString(6) + " | " + resultSet.getDouble(7));
			}
			System.out.println(
					"-------------------------------------------------------------------------------------------");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void openConnection() {
		try {
			fileReader = new FileReader(filePath);
			properties.load(fileReader);
			Class.forName(properties.getProperty("driverPath"));
			connection = DriverManager.getConnection(properties.getProperty("dbPath"), properties);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void createAndDropTable() {
		query = "Drop table musicPlayer";
		try {
			preparedStatement = connection.prepareStatement(query);
			resultInt = preparedStatement.executeUpdate();
			System.out.println("Query OK " + resultInt + " row(s) affected");
			System.out.println("Previous Table Droped");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		query = "create table musicPlayer (id int(4) primary key, songName varchar(45) ,singer varchar(45) ,"
				+ "movieName varchar(45),composer varchar(45),lycricist varchar(45), length  double)";
		try {
			preparedStatement = connection.prepareStatement(query);
			resultInt = preparedStatement.executeUpdate();
			System.out.println("Query OK " + resultInt + " row(s) affected");
			System.out.println("Table Created");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

}
