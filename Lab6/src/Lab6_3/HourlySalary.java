package Lab6_3;

public class HourlySalary extends Employees {
	private double hourlyPay;
	private double hoursWorked;
	
	public HourlySalary(String first, String last, String ssn,double hourp,double hourw) {
		super(first,last,ssn);
		this.hourlyPay = hourp;
		this.hoursWorked = hourw;
	}
	
	public String toString(){
		return "hourly employee: " + super.toString()
				+ "\nhourly pay: $ " + hourlyPay
				+ "; hours worked: " + hoursWorked;
	}

	@Override
	public double earnings() {
		return hourlyPay*hoursWorked;
	}
}