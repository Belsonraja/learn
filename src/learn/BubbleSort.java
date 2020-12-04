package learn;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 3, 7, 4, 5, 2, 6, 1 };
		bubbleSort(arr);
	}

	static void bubbleSort(int[] arr) {
		boolean isSorted = false;
		int lastUnsorted = arr.length-1;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < lastUnsorted; i++) {
				if(arr[i]>arr[i+1]) {
					swap(arr, i, i+1);
					isSorted = false;
				}
			}
			lastUnsorted--;
		}
		print(arr);
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
