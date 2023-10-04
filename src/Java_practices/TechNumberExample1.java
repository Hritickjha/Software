package Java_practices;
import java.util.Scanner;

public class TechNumberExample1 {
	public static void main(String args[]) {
		int n,num,firstHalf,SecondHalf,digits=0,squareofSum=0;
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter a number to check:");
		n = Sc.nextInt();
		num = n;
		while (num > 0) {
			digits++;
			num = num/10;
		}
		if (digits %2 == 0) {
			num = n;
			firstHalf = num%(int) Math.pow(10,digits/2);
			SecondHalf = num/(int) Math.pow(10,digits/2);
			squareofSum =(firstHalf+SecondHalf)*(firstHalf+SecondHalf);
			if(n == squareofSum) {
				System.out.println(n+"is a tech number.");
			} else {
				System.out.println(n+"is not a tech number.");
			}
		}else {
			System.out.println(n+"is not a tech number.");
		}
	}
}

