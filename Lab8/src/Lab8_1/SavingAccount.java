package Lab8_1;

public class SavingAccount extends BaseAccount {
	private Employees employee;
	public DebitCard debitCard;
	private double money;

	public SavingAccount(Employees employee) {
		this.employee = employee;
		debitCard = new DebitCard();
		employee.debitCard = this.debitCard;
		debitCard.setCardNumber(employee.securityNumber);
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	@Override
	public boolean deposit(double amount) {
		debitCard.addMoney(amount);
		return true;
	}
	public boolean withdraw(double amount) {
		if(money < amount) {
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
	
	public class DebitCard extends Card{
		private String cardNumber;
		
		public DebitCard() {
			money = 0;
		}
		public String type() {
			return "visa";
		}
		public double discount() {
			return 2.5;
		}
		public void addMoney(double plus) {
			money = money + plus;
		}
		
		public boolean withdraw(double amount) {
			if(money > amount) {
				money = money - amount;
				return true;}
			else {
				return false;
			}
		}
		
		//Getter & Setter
		public String getCardNumber() {
			return cardNumber;
		}
		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}
		public DebitCard getCard() {
			return this;
		}

	}
	
}