package Lab7_2;

public class DebitCard extends Card{
	private double money;
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
	
	@Override
	public boolean withdraw(double amount) {
		if(money > amount) {
			money = money - amount;
			return true;}
		else {
			return false;
		}
	}
	
	//Getter & Setter
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
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