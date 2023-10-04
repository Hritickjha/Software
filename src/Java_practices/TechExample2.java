package Java_practices;

public class TechExample2 {
	public static void main(String[] args) {
		System.out.println("Tech number between 1 to 1000000 are:");
		for (int i =1; i <= 10000000; i++) {
			// determines the last digit of the given number
			int p1 = i%100;
			//remove the last digit of the number
			int p2 = i/100;
			//add the two parts i.e p1 and p2
			int sum = p1+p2;
			/*
			 * square the sum that we get from the above statement and compare the square
			 */
			// with the given number
			if(i == (sum*sum))
				//prints the tech number
				System.out.println(i);
		}
	}
}

