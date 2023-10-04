package Variable_Scope;

public class VariableScope_1 {
	public static void main(String args[]) {
		int x=100;
		if(x>0) {
			int y=200;
			System.out.println("x :"+x);
			System.out.println("y :"+y);
			x++;
			y++;
		}
		System.out.println("x : "+x);
		//system.out.println("y : "+y);-> error
	}
}
