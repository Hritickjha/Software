package Java_practices;

import java.util.Scanner;

public class Totalcalculator {
		public static void main(String args[]) {
			Scanner input=new Scanner(System.in);
			int num;
			int total = 0;
			for (int i=1; i<=5; i++) {
				System.out.print("Enter no"+i+":");
				num=input.nextInt();//Get user input
				total+=num;
			}
			System.out.println("Total: "+total);
		}
}
