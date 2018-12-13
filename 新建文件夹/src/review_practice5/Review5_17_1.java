package review_practice5;
class Address{
	private String national;
	private String state;
	private String city;
	private String street;
	private String postCode;
	
	public Address(){
	}
	public Address(String national,String state,String city,String street, String postCode) {
		this.national=national;
		this.state=state;
		this.city=city;
		this.street=street;
		this.postCode=postCode;
	}
	public String getNational(){
		return national;
	}
	public void setNational(String n) {
		national=n;
	}
	public String getState() {
		return state;
	}
	public void setState(String m) {
		state=m;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String b) {
		city=b;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String v) {
		street=v;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String c) {
		postCode=c;
	}
	public String toString() {
		return this.national+" "+this.state+" "+this.city+" "+this.street+" "+this.postCode;
	}
}
public class Review5_17_1 {
	public static void main(String[] args) {
		Address ad=new Address("China","Ningxia","Yinchuan","Chuanxin","n2038");
		System.out.println(ad);
	}
}
