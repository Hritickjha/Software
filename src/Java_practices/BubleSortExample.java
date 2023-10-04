package Java_practices;

public class BubleSortExample {
	static void bublesort(int[] arr) {
		int n = arr.length, temp =n;
		for (int i=0; i<n; i++) {
			for (int j=1; j<(n-i); j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];// swap element
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		 int arr[] = {3,60,35,2,45,320,5};
		 System.out.println("Array Before Bubble sort");
		 for (int i=0; i < arr.length; i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
		  bublesort(arr);
		 //sorting array elements using bubble sort
		 System.out.println("Array after Bubble sort");
		 for(int i=0; i < arr.length; i++) {
			 System.out.print(arr[i]+" ");
		 }	 
	}
}
