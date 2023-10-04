package Java_practices;

public class Casting1 {
	public static void main(String[] args) {
		 int i=10; //Integer is a 32 bits
		 byte b; //Byte is 8 bits 
		 /* using b=i; will result in a compile time error as 'i' is a larger type.*/
		 b=(byte)i;
		 /*Casting a int into a byte by instructing the compiler to copy the last 8 bits of 'i' to 'b'.*/
		 System.out.println("b="+b);
	}
}

