package Java_practices;

public class Question {
	/* what are the error in the following code?*/
	public static void main(String args[]) {
		int x=100;
		int y=300;
		int z=400;
		System.out.println(x);//line 1
		System.out.println(y);//line 2
		{
			
			System.out.println(x);//line 3
			System.out.println(y);//line 4
			{
				
				System.out.println(z);//line 9
			}
			System.out.println(z);//line 12
		}
		System.out.println(x);//line 13
		System.out.println(y);//line 14	
	}
}

