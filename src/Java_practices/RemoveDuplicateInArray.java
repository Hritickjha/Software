package Java_practices;

public class RemoveDuplicateInArray {
	public static int RemoveDuplicateElements(int arr[], int n) {
		if (n==0 || n==1) {
			return n;
		}
		int[] temp = new int[n];
		int j=0;
		for (int i=0; i<n-1; i++) {
			temp[j++] = arr[i];
			}
	temp[j++] = arr[n-1];
	for (int i=0; i<j; i++) {
		arr[i] = temp[i];
		}
			return j;
	}
	public static void main(String[] args) {
		int arr[] = {10,20,20,30,30,40,50,50};
		int length = arr.length;
		length = RemoveDuplicateElements(arr, length);
		for (int i=0; i<length; i++)
			System.out.print(arr[i]+" ");
	}
}
