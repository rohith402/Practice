import java.util.Arrays;

public class QuickSort {
	
	public static int rearrange(int[] arr, int start, int end) {
		int i = start+1;
		int piv = arr[start];
		for(int j=i; j<=end; j++) {
			if(arr[j] < piv) {
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i-1, start);
		return i-1;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void sort(int[] arr, int start, int end) {
		if(start < end) {
			int piv = rearrange(arr, start, end);
			sort(arr, start, piv-1);
			sort(arr, piv+1, end);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {7,9,8,3,2,1};
		sort(arr, 0, arr.length-1);
		Arrays.stream(arr).forEach(i -> System.out.println(i));
	}

}
