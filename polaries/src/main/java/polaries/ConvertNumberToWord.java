package polaries;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertNumberToWord {
	
	static String one[] = {"","one","two","Three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen",
			                "seventeen","eighteen","nineteen"};
	static String ten[] = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	
	public static void main(String args[]) throws Exception {
		
		System.out.println("Convert Numbers to Words");		
		int num;
		try {
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println(NumberFormat.getInstance().format(num) + "='" + convertToWords(num) +"'");
		}
		catch(InputMismatchException exp) {
			exp.printStackTrace();
		}
		
	}

	public static String convertToWords(int num) {
		
		String out="";
		out += numToWords((num / 10000000)," crore ");
		out +=numToWords(((num / 100000) % 100)," lakh ");
		out += numToWords(((num / 1000) % 100)," thousand "); 
		out += numToWords(((num / 100) % 10), " hundred ");
		
		if (num > 100 && num % 100 > 0) { 
            out += " and "; 
        } 
		out += numToWords((num % 100)," ");
		return out;
	}

	public static String numToWords(int num, String str) {

		  String  word = "";
		  
		  if(num > 19) {
			  word += ten[ num / 10 ] + one[ num % 10 ];			  
		  } else {
			  word += one[num];
		  }		  
		  if(num != 0) {
			  word += str;
		  }

		return word;
	}

}
