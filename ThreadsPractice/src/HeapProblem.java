import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HeapProblem {
	
	public static void insert(Integer[] arr, int k) {
		while(k>0) {
			if(arr[(k-1)/2] < arr[k]) {
				swap(arr, k, (k-1)/2);
				k = (k-1)/2;
			} else {
				break;
			}
		}
	}
	
	public static void swap(Integer[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int leftNode(int i) {
		return 2*i+1;
	}
	
	public static int rightNode(int i) {
		return 2*i+2;
	}
	
	public static void maxHeapifyCorrected(Integer[] arr, int j, int size) {
		for(int i=(size-1)/2;i>=0;i--) {
			int maxChildNode;
			if(leftNode(i) < size-j && rightNode(i) < size-j) {
				if(arr[leftNode(i)] > arr[rightNode(i)]) {
					maxChildNode = leftNode(i);
				}else {
					maxChildNode = rightNode(i);
				}
				if(arr[i] < arr[maxChildNode]) {
					swap(arr, i, maxChildNode);
				}
			}else if(leftNode(i) < size-j) {
				maxChildNode = leftNode(i);
				if(arr[i] < arr[maxChildNode]) {
					swap(arr, i, maxChildNode);
				}
			}else if(rightNode(i) < size-j) {
				maxChildNode = rightNode(i);
				if(arr[i] < arr[maxChildNode]) {
					swap(arr, i, maxChildNode);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Integer[] arr = new Integer[size];
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		for(int i=0;i<size; i++) {
			arr[i] = sc.nextInt();
			if(i<2) {
				System.out.println("-1");
				if(i>0) {
					insert(arr, i);
				}
			}else {
				if(i == 2) {
					insert(arr, i);
					max1 = arr[0];
					if(arr[1] > arr[2]) {
						max2 = arr[1];
						max3 = arr[2];
					}else {
						max2 = arr[2];
						max3 = arr[1];
					}
				}else {
					if(arr[i]>max1) {
						max3 = max2;
						max2 = max1;
						max1 = arr[i];
					}else if(arr[i]>max2) {
						max3 = max2;
						max2 = arr[i];
					}else if(arr[i]>max3) {
						max3 = arr[i];
					}
				}
				System.out.println(max1+" "+ max2+" "+max3);
			}
		}
	}

}
