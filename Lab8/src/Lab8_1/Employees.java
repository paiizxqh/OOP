package Lab8_1;

import Lab8_1.SavingAccount.DebitCard;

public abstract class Employees {
	protected String firstName;
	protected String lastName;
	protected String securityNumber;
	protected DebitCard debitCard;
	
	public Employees(String first,String last,String ssn){
		firstName = first;
		lastName = last;
		securityNumber = ssn;
	}
	public String toString(){
		return String.format("%s %s\nsocial security number: %s",firstName,lastName,securityNumber);
	}
	public DebitCard getCard() {
		return debitCard;
	}
	
	public abstract double earnings();
}