package review_practice5;

import java.security.acl.Permission;

class person{
	private String name;
	private int age;
	public void tell() {
		System.out.println(getName()+" "+getAge());
	}
	public person(String name) {
		this.setName(name);
	}
	public person(String name,int age) {
		this.setAge(age);
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String n) {
		name=n;
	}
	public void setAge(int m) {
		if (m>=0 && m<150) {
			age=m;	
		}
	}
}
public class example054 {
	public static void main(String[] args) {
		person per=new person("lisa");
		per.tell();
	}
}
