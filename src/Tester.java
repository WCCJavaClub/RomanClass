import java.util.Scanner;
import java.io.*;



public class Tester {

	public static void main(String[] args) {
		Scanner keyboard = null;
		Roman r1 = null, r2 = null, r3 = null;
		char operator = ' ';
		int answer = 0;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("data");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(0);
		}
		keyboard = new Scanner(fis);
		r1 = new Roman();
		r2 = new Roman();
		r3 = new Roman();
		
		
		r1.getData(keyboard);
		r1.convertRomanToArabic();
		r1.display();
		
		r2.getData(keyboard);
		r2.convertRomanToArabic();
		r2.display();
		
		//System.out.println("Enter +, -, /, *");
		operator = keyboard.next().charAt(0);
		
		answer = r1.calculate(r2, operator);
		r3.setArabic(answer);
		r3.convertArabicToRoman();
		r3.display();
		System.out.println(answer);



	}

}
