package entities;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double getFinalGrade() {
		return n1 + n2 + n3;
	}
	
	public String getStatus() {
		if(this.getFinalGrade() >= 60) {
			return "PASS";
		} else {
			double missingPoints = 60 - this.getFinalGrade();
			return "FAILED" + "\n" + "MISSING " + missingPoints + " POINTS";
		}
	}
}
