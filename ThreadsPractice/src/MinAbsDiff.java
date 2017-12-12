import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinAbsDiff {

    static int minimumAbsoluteDifference(int n, Integer[] arr) {
    	Arrays.sort(arr, Collections.reverseOrder());
        int res = Math.abs(arr[0]-arr[1]);
        for(int i=1;i<arr.length-2;i++) {
        	if(res > Math.abs(arr[i]-arr[i+1])) {
        		res = Math.abs(arr[i]-arr[i+1]);
        	}
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] arr = new Integer[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        in.close();
    }
}
