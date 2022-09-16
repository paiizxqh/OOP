package Lab7_2;

public class FixedSalary extends Employees{
	private double monthlySalary;

	public FixedSalary(String first, String last, String ssn,double months) {
		super(first,last,ssn);
		this.monthlySalary = months;
	}
	public String toString(){
		return "Fixed salary employee: " + super.toString() + "\nmontly salary: $" + monthlySalary;
	}

	@Override
	public double earnings() {
		return monthlySalary;
	}
}