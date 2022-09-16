package Lab7_2;

public class SavingAccount extends BaseAccount {
	private Employees employee;
	public DebitCard debitCard;

	public SavingAccount(Employees employee) {
		this.employee = employee;
		debitCard = new DebitCard();
		employee.debitCard = this.debitCard;
		debitCard.setCardNumber(employee.securityNumber);
	}
	
	@Override
	public boolean deposit(double amount) {
		debitCard.addMoney(amount);
		return true;
	}
	public boolean withdraw(double amount) {
		if(debitCard.getMoney() < amount) {
			return false;
		}
		else {
			debitCard.withdraw(amount);
			return true;
		}
	}
	
	//Getter & Setter
	public Employees getEmployee() {
		return employee;
	}
	public void setEmployee(Employees employee) {
		this.employee = employee;
	}
	
	
}