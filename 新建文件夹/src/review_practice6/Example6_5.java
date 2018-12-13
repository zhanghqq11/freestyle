package review_practice6;
interface A{
	public String author="Dennis";
	public void print();
	public String getInfo();
}

abstract class B implements A{
	public abstract void say();
}

class X extends B{
	public void say() {
		System.out.println(author);
	}
	public String getInfo() {
		return "Hello";
	}
	public void print() {
		System.out.println("author"+author+" "+getInfo());
	}
}
public class Example6_5 {
	public static void main(String[] args) {
		X x=new X();
		x.say();
	}
}
