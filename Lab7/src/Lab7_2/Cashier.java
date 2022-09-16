package Lab7_2;

public class Cashier {
	private String nameCashier;
	private InventoryCart ic;
	private DebitCard debitCard;
	
	public Cashier(){
		this.nameCashier = "";
	}
	public Cashier (String nameCashier) {
		this.nameCashier = nameCashier;
	}
	private Product inCart(int i) {
		return this.ic.getProduct(i);
	}
	public void doPayment(InventoryCart ic, DebitCard debitCard){
		this.ic = ic;
		this.debitCard = debitCard;
	}
	public double Discount(int disct) {
		return disct - disct * (debitCard.discount()/100.00);
	}
	public String ssCard() {
		String[] disct;
		disct = debitCard.getCardNumber().split("-");
		return "xxx-xxx-"+disct[2];
	}
	public void printReceipt() {
		int x=0;
		System.out.println("\t CARD TYPE:"+debitCard.type());
		System.out.println("\tCARD NUMBER:"+ssCard());
		System.out.println("\n\t Pumpkin Shop\n");
		
		for(int i=0;i<ic.getIndex();i++) {
			System.out.println("\t"+inCart(i).getQuantt()+" x "+inCart(i)+" \t"+inCart(i).getPrice()*inCart(i).getQuantt());
			x = x + inCart(i).getPrice()*inCart(i).getQuantt();
		}
		System.out.println("\t--------------------");
		System.out.println("\n\tCARD DISCOUNT\t"+debitCard.discount()+" %");
		
		System.out.println("\n\tTotal"+"\t\t" + Discount(x) +" \n");
	}
}