package resourses;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary-tax;
	}
	public void increaseSalary(double percentage) {
		
		//grossSalary = ;
		grossSalary = grossSalary + (grossSalary/100*percentage)-tax;
	}	
}
