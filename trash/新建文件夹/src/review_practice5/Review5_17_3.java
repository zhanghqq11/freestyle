package review_practice5;
//
//import com.sun.org.apache.xpath.internal.operations.Equals;
//
//class Count{
//	private static int numN=0;
//	private static int numO=0;
//	private char cha[];
//	public Count(String n) {
//		this.cha=n.toCharArray();
//	}
//	public char[] setCount() {
//		return cha;
//	}
//	public void countMN() {
//		for(int i=0;i<cha.length;i++) {
//			if (cha[i]=="n") {
//				numN++;
//			}
//			if (cha[i]=="o") {
//				numO++;
//			}
//			System.out.println(numN+" "+numO);
//		}
//	}
////	public String toString() {
////		
////	}
//}
//public class Review5_17_3 {
//	public static void main(String[] args) {
//		Count count1=new Count("want you to know one thing");
////		System.out.print(count1);
//		count1.countMN();
//	}
//}
public class Review5_17_3 {
	public static void main(String[] args) {
		String str = "want you to know one thing" ;
		int sum = 0 ;
		while (str.indexOf("n") != -1) { 
			sum ++ ;
			str = str.substring(str.indexOf("n") + 1);
		}
		System.out.println(sum);
	}
}