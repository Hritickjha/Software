package Java_practices;

public class Casting2 {
	public static void main(String[] args) {
		int i=4330;
		//00000000 00000000 00010000 11101010
		byte b=(byte)i;
		/*Last 8 bits of 'i' are Copied to 'b' That is b=11101010 = -22*/
		System.out.println("b="+b);
	}
}

