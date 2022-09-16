package Lab4_1;

public class BankAccount {
	private String name;
	private double amount;
	private Date date;

	//constructors
	public BankAccount(String name){
		this.name = name;
		this.amount = 0;
		this.date = new Date(29, 7, 2022);
	}

	public BankAccount(String name,double amount,Date date){
		this.name = name;
		this.amount = amount;
		this.date = date;
	}

	//getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
   
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

	//method
	public void deposit(double amount){
		this.amount = amount + this.amount;
	}
	
	public boolean withdraw(double amount){
		if(amount <= this.amount){
			this.amount = this.amount - amount;
			return true;
			} 
			else{
				return false;
			}
	}

	public void transfer(BankAccount other,double amount){
		if(amount <= this.amount)
			this.amount = this.amount - amount;
			other.deposit(amount);
	}

	public double property(){
		return this.amount;
	}

	public String getInfo(){
		return this.name+" "+date.getDay()+" "+date.getMonth()+" "+date.getYear();
	}

	public static void main(String[] args) {
        Date Date1 = new Date(29, 7, 2022);
		BankAccount Act = new BankAccount("BankAccount 1 :", 0, Date1);
		Date Date2 = new Date(1, 11, 2015);
		BankAccount ActOther = new BankAccount("BankAccount 2 :", 500, Date2);
		Act.deposit(1000);
		ActOther.transfer(Act, 300);
		ActOther.withdraw(300);
		System.out.println(Act.getInfo()+" "+Act.property());
		System.out.println(ActOther.getInfo()+" "+ActOther.property());
	}
}