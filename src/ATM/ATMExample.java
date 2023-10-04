package ATM;
import java.util.Scanner;
public class ATMExample {

	public static void main(String[] args) {
		int balance = 100000,withdraw,desposit;
		//Create Scanner class object to get choice of user
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Automated Teller Machine");
			System.out.println("choose 1 for withdraw");
			System.out.println("choose 2 for Deposit");
			System.out.println("choose 3 for check Balance");
			System.out.println("choose 4 for Exit");
			System.out.println("choose operation you want perform:");
		
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
				System.out.print("Enter money to be withdraw :");
			//Get the withdraw money from user
			withdraw = sc.nextInt();
				if(balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("please collect your money");
				}
				else {
					System.out.println("Insufficient Balance");
					System.out.println("");
					
				}
					break;
					case 2:
					System.out.print("Enter money to be deposited :");
					desposit = sc.nextInt();
					balance = balance + desposit;
					System.out.println("your money has been successfully deposited");
					System.out.println("");
					break;
					
					case 3:
					System.out.println("Balance :" + balance);
				}
			}
	}
}


