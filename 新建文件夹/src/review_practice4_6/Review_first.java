package review_practice4_6;

public class Review_first {
	public static void main(String[] args) {
		int precess_number=20;
		long sum=0;
		for(long i=1;i<=precess_number;i++) {
			sum+=factorial(i);
		}
		System.out.print(sum);
	}
	
	public static long factorial(long num) {
		if (num<=1) {
			return 1;
			}
		else {
			return num*factorial(num-1);
		}
	}
}
