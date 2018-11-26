package review_practice4_6;

public class Review_second {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int odd_num=0,even_num=0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]%2==0) {
				even_num+=1;
			}
			else {
				odd_num+=1;
			}
		}
		System.out.println(even_num +" "+ odd_num);
	}
}
