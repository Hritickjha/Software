package Java_practices;

public class PyramidPattern {
	public static void main(String[] args) {
		// i for rows and j for columns
		int i,j,row = 6;
		for (i=0; i<row; i++) {
			for (j=row-i; j>1; j--) {
				System.out.print("");
			}
			for (j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

