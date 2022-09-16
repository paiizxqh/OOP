package Lab6_3;

public class CommissionPay extends Employees{
	private double grossSales;
	private double commissionRate;
	
	public CommissionPay(String first, String last, String ssn,double gross,double commr){
		super(first,last,ssn);
		this.grossSales = gross;
		this.commissionRate = commr;
	}
	
	public String toString(){
		return "commission employee: " + super.toString()
				+ "\ngross sales: $" + grossSales
				+ "; commission rate: " + commissionRate;
	}

	@Override
	public double earnings() {
		return grossSales*commissionRate;
	}

}