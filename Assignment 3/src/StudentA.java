//Extends from StudentAB
public class StudentA extends StudentAB {
	//Data Member
	private double gat;
	private double pat1;
	private double pat2;
	//Constructor
	public StudentA(int i, String n, double g, double eng, double math, double sci, double gat, double pat1, double pat2) {
		super(i, n, g, eng, math, sci);
		//Point data constructor to data member
		this.gat = gat; this.pat1 = pat1; this.pat2 = pat2;
	}
	//Methods
	public double getGat() {
		return gat;
	}
	public double getPat1() {
		return pat1;
	}
	public double getPat2() {
		return pat2;
	}
	public String printAB() {
		return "gat "+String.format("%.2f",gat)+"  pat1 "+String.format("%.2f",pat1)+"  pat2 "+String.format("%.2f",pat2)+"\n";
	}
	public double calPointAB() {
		return (calPoint()+gat*0.2+pat1*0.4+pat2*0.4)/2;
	}

}
