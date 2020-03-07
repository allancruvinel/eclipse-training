package resourses;

public class Student {
	public String nome;
	public double n1,n2,n3;
	public double maxnota = 100;
	
	public double maxScore() {
		return n1+n2+n3;
	}
	
	public String finalScore() {
		if(maxScore()>=60) {
			return "FINAL GRADE ="+maxScore()
			+ "\nPASS";
		}
		else
		{
			return "FINAL GRADE ="+maxScore()
			+ "\nFAILED"
			+ "\nMISSING "+(60-maxScore())+" POINTS";
	}
}
}
