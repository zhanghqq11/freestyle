package review_practice4_6;
import java.util.Arrays;

public class Review6 {
	public static void main(String[] args) {
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		for(int j=0;j<arr.length/2;j++) {
			int tem=arr[j];
			arr[j]=arr[arr.length-j-1];
			arr[arr.length-j-1]=tem;
		}
		System.out.print(Arrays.toString(arr));
    }
}
