package exercicios6;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		double salary = grossSalary - tax;
		return salary;
	}
	
	public void increaseSalary(double percentual) {
		grossSalary += grossSalary * percentual / 100;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
		}

}
