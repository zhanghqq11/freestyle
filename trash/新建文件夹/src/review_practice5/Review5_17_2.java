package review_practice5;
class employee{
	private String empNum;
	private String name;
	private double base_sallary;
	private double raise_rate;
	
	public employee(String empNum,String name,double base_sallary,double raise_rate) {
//		super();
		this.empNum=empNum;
		this.name=name;
		this.base_sallary=base_sallary;
		this.raise_rate=raise_rate;
	}
	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(String n) {
		empNum=n;
	}
	public String getName() {
		return name;
	}
	public void setName(String m) {
		name=m;
	}
	public double getBaseSall() {
		return base_sallary;
	}
	public void setBaseSall(double b) {
		base_sallary=b;
	}
	public double getRaiseRate() {
		return raise_rate;
	}
	public void setRaiseRate(double v) {
		raise_rate=v;
	}
	public String toString() {
		return this.empNum+" "+this.name+" "+this.base_sallary+" "+this.raise_rate;
	}
	public void groth() {
		this.raise_rate=this.base_sallary*this.raise_rate;
	}
}

public class Review5_17_2 {
	public static void main(String[] args) {
		employee emp=new employee("005", "lisa", 10000, 1.3);
		emp.groth();
		System.out.print(emp);
	}
}
