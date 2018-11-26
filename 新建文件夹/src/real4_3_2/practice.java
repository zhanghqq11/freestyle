package real4_3_2;

public class practice {
	public static void main(String[] args) {
		int score[]= {22,11,33,44,55,67};
		int age[]= {7,6,8,9,10};
		sort(score);
		sort(age);
		print(score);
		System.out.print(" ");
		print(age);
	}
	
	public static void sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if (arr[i]<arr[j]) {
				int tem=arr[i];
				arr[i]=arr[j];
				arr[j]=tem;
				}
			}
		}
	}
	
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
