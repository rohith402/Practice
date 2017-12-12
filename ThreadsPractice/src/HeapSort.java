import java.util.Arrays;

public class HeapSort {
	
	public static void createMaxHeap(int[] arr, int t) {
		
		for(int i=1;i<arr.length-t;i++) {
			insert(arr, i);
		}
		
	}
	
	public static void insert(int[] arr, int k) {
		while(k>0) {
			if(arr[(k-1)/2] < arr[k]) {
				swap(arr, k, (k-1)/2);
				k = (k-1)/2;
			} else {
				break;
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			createMaxHeap(arr,i);
			swap(arr,0,arr.length-1-i);
		}
	}
	
	public static void orderArray(int[] arr) {
		
	}
	
	public static int leftNode(int i) {
		return 2*i+1;
	}
	
	public static int rightNode(int i) {
		return 2*i+2;
	}
	
	public static void maxHeapify(int[] arr) {
		for(int i=arr.length-1/2;i>=0;i--) {
			int maxChildNode;
			if(leftNode(i) < arr.length && rightNode(i) < arr.length) {
				if(arr[leftNode(i)] > arr[rightNode(i)]) {
					maxChildNode = leftNode(i);
				}else {
					maxChildNode = rightNode(i);
				}
				if(arr[i] < arr[maxChildNode]) {
					swap(arr, i, maxChildNode);
				}
			}else if(leftNode(i) < arr.length) {
				maxChildNode = leftNode(i);
				if(arr[i] < arr[maxChildNode]) {
					swap(arr, i, maxChildNode);
				}
			}else if(rightNode(i) < arr.length) {
				maxChildNode = rightNode(i);
				if(arr[i] < arr[maxChildNode]) {
					swap(arr, i, maxChildNode);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {4,3,7,1,8,5};
		sort(arr);
		//maxHeapify(arr);
		//Arrays.stream(arr).forEach(i -> System.out.println(i));
	}

}
