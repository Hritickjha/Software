package Java_practices;

public class ForEachLoop {
	public static void main(String args[]) {
		int nums[]= {999,5,108,74,69,128};
		System.out.print("[");
		for(int i : nums) {
			System.out.print(i+",");
			/* 1st Iteration: i=23
			 * 2nd Iteration: i=11
			 * ............
			 * 6th Iteration: i=50*/
		}
		System.out.println("\b]");
	}
}

