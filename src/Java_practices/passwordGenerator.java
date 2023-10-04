package Java_practices;
import java.util.Random;

public class passwordGenerator {
	public static void main(String[] args) {
		int length = 10;
		System.out.println(geek_password(length));
	}
static char[] geek_password(int len) {
	System.out.println("generating password using random");
	System.out.println("your new password is:");
	String Capital_chars ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String Small_chars ="abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String Symbols ="!@#$%^&*()_+-";
	String values =
			Capital_chars+ Small_chars+numbers+Symbols;
	Random rndm_method = new Random();
	char[] password = new char[len];
	for(int i = 0; i<len; i++) {
		password[i]= values.charAt(rndm_method.nextInt(values.length()));
	}
	return password;
	}
}

