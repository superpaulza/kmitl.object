
public class Student {
	
	private int id;
	private String name;
	private double gpa, onetEng, onetMath, onetScience;
	
	public Student(int i, String n, double g, double eng, double math, double sci) {
		this.id = i; this.name = n; this.gpa = g; 
		this.onetEng = eng; this.onetMath = math; this.onetScience = sci;
	}
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

}
