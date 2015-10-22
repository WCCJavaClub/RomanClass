
import java.util.Scanner;

public class Roman {

	private String romanNumeral = "";
	private int arabicNumeral;

	public void setArabic(int n){
		arabicNumeral = n;
	}

	public void setRoman (String s){
		romanNumeral = s;
	}

	public void convertRomanToArabic(){
		arabicNumeral = 0;
		for (int index = 0; index < romanNumeral.length(); index++)
		{
			switch(romanNumeral.toUpperCase().charAt(index))
			{
			case 'M': arabicNumeral += 1000; break;
			case 'D': arabicNumeral += 500; break;
			case 'C': arabicNumeral += 100; break;
			case 'L': arabicNumeral += 50; break;
			case 'X': arabicNumeral += 10; break;
			case 'V': arabicNumeral += 5; break;
			case 'I': arabicNumeral += 1; break;

			}
		}
	}

	public void convertArabicToRoman(){
		int temp = arabicNumeral;
		int repeat = 0;
		repeat = temp / 1000;
		for (int i = 1; i <= repeat; i++)
		{
			romanNumeral += "M";
		}
		temp %= 1000;
		repeat = temp / 500;
		for (int i = 1; i <= repeat; i++)
		{
			romanNumeral += "D";
		}
		temp %= 500;
		repeat = temp / 100;
		for (int i = 1; i <= repeat; i++)
		{
			romanNumeral += "C";
		}
		temp %= 100;
		repeat = temp / 50;
		for (int i = 1; i <= repeat; i++)
		{
			romanNumeral += "L";
		}
		temp %= 50;
		repeat = temp / 10;
		for (int i = 1; i <= repeat; i++)
		{
			romanNumeral += "X";
		}
		temp %= 10;
		repeat = temp / 5;
		for (int i = 1; i <= repeat; i++)
		{
			romanNumeral += "V";
		}
		temp %= 5;
		repeat = temp / 1;
		for (int i = 1; i <= repeat; i++)
		{
			romanNumeral += "I";
		}
		

	}

	public void getData(Scanner keyb){
		//System.out.println("Enter roman number");
		romanNumeral = keyb.next();
	}

	public int calculate(Roman temp, char oper){

		switch(oper)
		{
		case '+': return arabicNumeral + temp.arabicNumeral;
		case '-': return arabicNumeral - temp.arabicNumeral;
		case '/': return arabicNumeral / temp.arabicNumeral;
		case '*': return arabicNumeral * temp.arabicNumeral; 
		}
		return 0;

		//		Roman r3 = new Roman();
		//		switch(oper)
		//		{
		//		case '+': r3.arabicNumeral = arabicNumeral + temp.arabicNumeral;
		//		case '-': r3.arabicNumeral = arabicNumeral - temp.arabicNumeral;
		//		case '/': r3.arabicNumeral = arabicNumeral / temp.arabicNumeral;
		//		case '*': r3.arabicNumeral = arabicNumeral * temp.arabicNumeral; 
		//		}
		//		return r3;


	}

	public void display(){
		System.out.println(arabicNumeral);
		System.out.println(romanNumeral);
	}

}
