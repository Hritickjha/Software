package Java_practices;

public class PrintArray {
	public static void main(String args[]){
		int nums[]= {55,8,1,33,99,59};
		System.out.print("[");
		for(int i=0; i<nums.length; i++){
			System.out.print(nums[i]+",");
		}
	System.out.println("\b]");
	/*Remove the last comma and print a box bracket*/
	}
}

