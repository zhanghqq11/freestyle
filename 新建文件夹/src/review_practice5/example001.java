package review_practice5;

//import java.awt.datatransfer.StringSelection;

class student{
	private String stunumber;
	private String name;
	private float math;
	private float english;
	private float computer;
	public student() {
		
	}
	public student(String stunumber, String name,float math,float english,float computer) {
		this.setStunumber(stunumber);
		this.setName(name);
		this.setEnglish(english);
		this.setMath(math);
		this.setComputer(computer);
	}
	public void setStunumber(String n) {
		stunumber=n;
	}
	public void setName(String m) {
		name=m;
	}
	public void setMath(float b) {
		math=b;
	}
	public void setEnglish(float v) {
		english=v;
	}
	public void setComputer(float c) {
		computer=c;
	}
	public String getStunumber() {
		return stunumber;
	}
	public String getName() {
		return name;
	}
	public float getMath() {
		return math;
	}
	public float getEnglish() {
		return english;
	}
	public float getComputer() {
		return computer;
	}
}
public class example001 {
	public static void main(String[] args) {
		student stu=new student("N001","dennis",15.5f,13.5f,13.5f);
		System.out.print(stu.getStunumber());
	}
}