package Java_practices;

import java.util.Scanner;

public class SpyNumberExample1 {
	public static void main(String args[]) {
		int num,product=1,sum=0,lastDigit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		num=sc.nextInt();
		while(num>0) {
			lastDigit=num%10;
			sum=sum+lastDigit;
			product=product*lastDigit;
			num=num/10;
		}
		if (sum==product)
			System.out.println("spy number.");
		else
			System.out.println("not a spy number.");
	}
}

