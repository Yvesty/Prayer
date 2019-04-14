package algorithm;

public class Quick {
	private void quickSort(int[] array,int low,int high) {
		if(low >= high)
			return;
		int i = low, j = high, index = array[i];
		while(i<j) {
			while(i < j && array[j] >= index)
				j--;
			if(i < j)
				array[i++] = array[j];
			while(i < j && array[i] < index)
				i++;
			if(i < j)
				array[j--] = array[i];
		}
		array[i] = index;
		quickSort(array, low, i - 1);
		quickSort(array, i + 1, high);
	}
	
	public void quickSort(int[] array) {
		if(array.length == 0)
			return;
		quickSort(array, 0, array.length - 1);
	}
	
}
