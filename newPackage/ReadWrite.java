package newPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//create file on system
		
		String testFile = "C:\\Users\\User\\Documents\\Inspired Testing\\test1.txt";
		
		//create an object java file class
		File FC = new File(testFile);
		
		//create the file
		FC.createNewFile();
		
		//write to file
		FileWriter FW = new FileWriter(testFile);
		BufferedWriter BW = new BufferedWriter(FW);
		BW.write("my test line 1");
		BW.newLine();
		BW.write("my test line 2");
		BW.close();
		
		//Read from file
		FileReader FR = new FileReader(testFile);
		BufferedReader BR = new BufferedReader(FR);
		String Content = "";
		
		//Loop through to real all lines
		while((Content = BR.readLine())!= null){
			System.out.println(Content);
		}
		
	}

}
