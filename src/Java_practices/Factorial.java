package Java_practices;

public class Factorial {
	static double getfactorial(int num) {
		if(num>=0) {
			double Factorial =1;
			for(int i=2; i<=num; i++) {
				Factorial = Factorial*i;
				//double = double*int
			}
			return Factorial;
			}
		return -1;
	}
	public static void main(String args[]) {
		System.out.println("factorial of" + "10 is" + getfactorial(10));
		System.out.println("factorial of" + "5 is" + getfactorial(5));
		System.out.println("factorial of" + "7 is" + getfactorial(7));
	}
}
