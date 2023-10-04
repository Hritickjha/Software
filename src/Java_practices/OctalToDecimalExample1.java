package Java_practices;
/*java program to demonstrate the use of integer.parseInt()method*/
//for converting Octal to Decimal number
public class OctalToDecimalExample1 {
	public static void main(String args[]) {
		//declaring an octal number
		String octalString="121";
	//converting octal number into decimal
		int decimal=Integer.parseInt(octalString,8);
	//printing converted decimal number
		System.out.println(decimal);
	}		
}

