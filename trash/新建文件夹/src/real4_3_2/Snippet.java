package real4_3_2;

public class Snippet {
	public static void main(String[] args) {
		int arrayDemo[]= {12,47,32,14,56,41,326,42};
		for(int i=0;i<arrayDemo.length;i++) {
			for(int j=0;j<arrayDemo.length;j++) {
				if (arrayDemo[i]<arrayDemo[j]) {
					int small=arrayDemo[i];
					arrayDemo[i]=arrayDemo[j];
					arrayDemo[j]=small;
					
				}
			}
		}
		for(int i=0;i<arrayDemo.length;i++)
		System.out.print(arrayDemo[i]+" ");
	}
}

