package Test;

public class Maopao {
	public static void main(String[] args) {
		int[] arr = {12,45,9,67,455};
		arr = recursiveBubble(arr, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static int[] recursiveBubble(int[]arr,int e) {
		if(e == 0) {
			return arr;
		}
		else {
			for (int i = 0; i < e-1; i++) {
				int temp = 0;
				if(arr[i]>arr[i+1]) {
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
