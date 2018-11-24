package real4_3_2;

import jdk.internal.dynalink.beans.StaticClass;

public class practice {
	public static void main(String[] args) {
		int score[]= {11,22,33,44,55,67};
		int age[]= {6,7,8,9,10};
	}
	
	public static void sort(int arr[]) {
		for(int i=0;i<=arr.length;i++) {
			for(int j=0;j<=arr.length;j++) {
				if (arr[i]<arr[j]) {
				int tem=arr[i];
				arr[i]=arr[j];
				arr[j]=tem;
				}
			}
		}
	}
}
