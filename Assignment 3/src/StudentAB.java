//Abstract Class
public abstract class StudentAB {
	//Data Member
	private int id;
	private String name;
	private double gpa, onetEng, onetMath, onetScience;
	//Constructor
	public StudentAB(int i, String n, double g, double eng, double math, double sci) {
		//load data from constructor to data member
		this.id = i; this.name = n; this.gpa = g; 
		this.onetEng = eng; this.onetMath = math; this.onetScience = sci;
	}
	//Methods
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getGpa() {
		return gpa;
	}
	public double getEng() {
		return onetEng;
	}
	public double getMath() {
		return onetMath;
	}
	public double getScience() {
		return onetScience;
	}
	public double calPoint() {
		return gpa*25*0.10+onetScience*0.3+onetMath*0.4+onetEng*0.2;
	}
	public abstract String printAB();
	public abstract double calPointAB();
}
