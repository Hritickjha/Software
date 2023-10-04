package Java_practices;

public class AutomaticTypeConversion {
	public static void main(String args[]) {
		byte b=12;
		short s=b; //byte to short
		int i=s; //short to int
		long l=i; // int to long
		float f=l; //long to float
		double d=f; //float to double
		char c='B';
		d=f=l=i=c;/* A character(char) can be converted to a int,long,float or double*/
		
	}
}

