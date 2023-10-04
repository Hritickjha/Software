package Java_practices;

public class RemoveDuplicateArray1 {
	public static int RemoveDuplicateElements(int arr[], int n) {
		if (n==0|| n==1) {
			return n;
		}
		int j = 0;//for next element
		for(int i=0; i<n-1; i++) {
			if(arr[i]!= arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		return j;
	}
	public static void main(String[]args) {
		int arr[]= {1,1,50,50,60,32,32,88,88};
		int length = arr.length;
		length = RemoveDuplicateElements(arr, length);
		//printing array elements
		for (int i=0; i<length; i++)
			System.out.print(arr[i]+" ");
	}
}

