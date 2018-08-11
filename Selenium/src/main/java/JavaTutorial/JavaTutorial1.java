package JavaTutorial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaTutorial1 {

	public static void main(String[] args) throws IOException {

		System.out.print("Learning Java from SoftwareTestingMaterial");
		System.out.print("Learning Java from SoftwareTestingMaterial");
		System.out.print("Learning Java from SoftwareTestingMaterial");
		System.out.println("Learning Java from SoftwareTestingMaterial");
		System.out.println("Learning Java from SoftwareTestingMaterial");
		System.out.println("Learning Java from SoftwareTestingMaterial");

		Scanner object = new Scanner(System.in);
		System.out.println("Learning Java from?");
		String input = object.nextLine();
		// Close the scanner object using close() method to prevent memory leak
		object.close();
		System.out.println("I am learning Java from "+ input);

		FileReader reader = new FileReader("D:\\mytest.txt");
		BufferedReader bufferwrap = new BufferedReader(reader);
		String textfromfile=null;
		while ((textfromfile=bufferwrap.readLine())!=null) {
			System.out.println(textfromfile);

		}
		String texttofile ="my test goes here";
		FileWriter writer = new FileWriter("D:\\mytest1.txt");
		BufferedWriter bufferwriter = new BufferedWriter(writer);
		bufferwriter.write(texttofile);
		System.out.println(texttofile);
		bufferwriter.close();

		reader.close();
		bufferwrap.close();

	}

}
