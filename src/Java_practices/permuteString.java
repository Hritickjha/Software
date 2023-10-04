package Java_practices;

public class permuteString {
	public static String SwapString(String a, int i, int j ) {
		char[]b = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}
	public static void main(String[] args) {
		String str ="ABC";
		int len = str.length();
		System.out.println("All the permutation of the string are:");
		generatedpermutation(str,0,len);
	}
	public static void generatedpermutation(String str, int start, int end) {
		if(start == end -1)
			System.out.println(str);
		else {
			for(int i =start; i<end; i++) {
				str = SwapString(str,start,i);
				generatedpermutation(str,start+1, end);
				str = SwapString(str, start, i);	
			}
		}
	}

}

