package Java_practices;

import java.util.Scanner;

public class LeftPascalTrianglePattern {
	public static void main(String[] args) {
		int i,j,k,rows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		rows = sc.nextInt();
		for( i=1; i<=rows; i++) {
			for(j=i; j < rows; j++) {
				System.out.print(" ");
			}
			for(k=1; k<=i; k++) {
				System.out.println("*");
			}
			System.out.println("");
		}
		for (i = rows; i>=1; i--) {
			for(j= i; j<=rows; j++) {
				System.out.print("");
			}
			for(k =1; k<1; k++) {
				System.out.println("*");			}
			}
			System.out.println("");
		}
	
	
	}
