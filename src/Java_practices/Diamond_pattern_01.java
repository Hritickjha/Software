package Java_practices;
import java.util.Scanner;
public class Diamond_pattern_01 {
	public static void main(String args[]) {
		int num, product=1,sum=0, lastdigit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		num = sc.nextInt();
		while(num>0) {
			lastdigit=num%10;
			sum=sum+lastdigit;
			product=product*lastdigit;
			num=num/10;
		}
		if(sum== product)
			System.out.println("spy number.");
		else
			System.out.println("not a spy number.");
	}
}

