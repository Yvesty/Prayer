package algorithm;

public class Bubble {
	public static void main(String[] args) {
		int[] arr = {12, 45, 9, 67, 455};
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr [j + 1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		
		System.out.println("排序后:  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("排序后 ");
		
		int[] arr2 = {12,45,9,67,455};
		arr2 = recursiveBubble(arr2, arr2.length);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
	
		
	}
	
	public static int[] recursiveBubble(int[] arr,int e){
		if (e == 0) {
			return arr;
		}
		else {
			for (int i = 0; i < e-1; i++) {
				int temp = 0;
				if (arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			
			e--;
			recursiveBubble(arr, e);
		}
		return arr;
	}
}
