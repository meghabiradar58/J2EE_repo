package com.spirds.filehandling.files;

import java.io.File;
import java.io.IOException;

public class filedemo {
public static void main(String[] args) {
	  File file = new File("myfile.txt"); 
	  try {
		  file.createNewFile(); 
		  System.out.println("File Created!");
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
      
}
}
