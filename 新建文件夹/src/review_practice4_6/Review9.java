package review_practice4_6;

import java.util.Arrays;

public class Review9 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,11};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		arr[0]=max;
		System.out.print(Arrays.toString(arr));
	}
}
