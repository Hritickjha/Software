package ManagementSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class StockManagementSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//create an empty arraylist to hold the stocks
		ArrayList<stock> Stocks = new ArrayList<>();
		//display the menu and ask for user input
		int choice;
do {
	System.out.println("1.Add stock");
	System.out.println("2.Remove stock");
	System.out.println("3.view stock");
	System.out.println("4.Exit");
	System.out.println("Enter your choice :");
	choice = input.nextInt();
	
	switch (choice) {
	case 1:
		//ask for stock details
		System.out.print("Enter the stock name:");
		String name = input.next();
		System.out.print("Enter the stock quantity:");
		int quantity = input.nextInt();
		System.out.print("Enter the stock price :");
		double price = input.nextDouble();
		
		//create a new stock object and add it to the arraylist
		stock newStock = new stock(name,quantity,price);
		Stocks.add(newStock);
		System.out.println("Stock added successfully");
		break;
	case 2:
		//ask for the stock name and quantity to remove
		System.out.print("Enter the stock name: ");
		String stockName = input.next();
		System.out.print("Enter the quantity to remove :");
		int removeQuantity = input.nextInt();
		
		//loop through the stocks to find the matching stock
		boolean stockFound = false;
		for (stock stock : Stocks) {
			if(stock.getName().equals(stockName)) {
				// if the stock is found, remove the specified quantiy
				stockFound = true;
				stock.removeQuantity(removeQuantity);
				System.out.println("stock removed successfully");
				break;
			}
		}
		if (!stockFound) {
			System.out.println("stock not found");
		}
		break;
	case 3:
		//display the list of stocks
		System.out.println("current stocks:");
		for(stock stock : Stocks) {
			System.out.println(stock.toString());
		}
		break;
	case 4:
		System.out.println("Exiting the program...");
		break;
		
	default:
		System.out.println("Invalid choice, try again");
		break;
	}
} while (choice !=4);
input.close();
	}
}	
	
	
class stock{
	private String name;
	private int quantity;
	private double price;
	
	public stock(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public double  getprice() {
		return price;
	}
	public void removeQuantity (int quantiyToRemove) {
		if (quantiyToRemove <= quantity) {
			quantity -= quantiyToRemove;
		} else {
			System.out.println("Not enough quantity to remove");
		}
	}	
	
public String toString() {
	return name + ",quantity:" + quantity + ",price:$" + price;
	}
}

