//Extends from StudentAB
public class StudentB extends StudentAB {
	//data member
	private double s19;
	private double s29;
	private double s39;
	private double s49;
	//Constructor
	public StudentB(int i, String n, double g, double eng, double math, double sci, double s19, double s29, double s39, double s49) {
		super(i, n, g, eng, math, sci);
		//refer constructor to data member
		this.s19 = s19; this.s29 = s29; this.s39 = s39; this.s49 = s49;
	}
	//Methods
	public double gets19() {
		return s19;
	}
	public double gets29() {
		return s29;
	}
	public double gets39() {
		return s39;
	}
	public double gets49() {
		return s49;
	}
	public String printAB() {
		return "s19 "+String.format("%.2f",s19)+"  s29 "+String.format("%.2f",s29)+"  s39 "+String.format("%.2f",s39)+"  s49 "+String.format("%.2f",s49)+"\n";
	}
	public double calPointAB() {
		return (calPoint()+s19*0.1+s29*0.2+s39*0.4+s49*0.3)/2;
	}

}