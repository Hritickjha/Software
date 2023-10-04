package Variable_Scope;

public class VariableScope {
	public static void main(String args[]) {
		int x=100;
		int y=300;
		if(x>0) {
			
			System.out.println("x : "+x);
			System.out.println("y: "+y);
			x++;
			y++;
		}
		System.out.println("x : "+x);
		System.out.println("y :"+y);
	}
}
