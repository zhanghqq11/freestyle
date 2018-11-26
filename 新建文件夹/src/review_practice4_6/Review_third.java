package review_practice4_6;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

public class Review_third {
	public static void main(String[] args) {
		int oldArr[]= {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int zero_amount=0;
		for(int i=0;i<oldArr.length;i++) {
			if(oldArr[i]==0) {
				zero_amount++;
			}	
		}
		
		int new_length=0;
		new_length=oldArr.length-zero_amount;
		int newArr[]=new int[new_length];
		int j=0;
		for(int i1=0;i1<oldArr.length;i1++) {
			if (oldArr[i1]!=0) {
				newArr[j]=oldArr[i1];
				j++;
			}
		}
		for(int n:newArr) {
			System.out.println(n+" ");
		}
//		System.out.println(newArr[11]);
	}
}
