package review_practice4_6;

public class Review_fourth {
	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6,7};
		int max=0,min=arr[0],sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.print(min+"\n"+max+"\n"+sum+"\n");
	}
}
