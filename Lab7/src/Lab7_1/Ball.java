package Lab7_1;

public abstract class Ball {
	private String tradeMark;
	
	public Ball(String tradeMark){
		this.tradeMark = tradeMark;
	}

	public void inflate(double volume){
		System.out.println(this.getTradeMark()+"'s ball is inflated "+volume+" cu.ft.");
	}
	
	public void show(){
		System.out.println(this.getTradeMark()+" is a trademark of "+getClass().getSimpleName()+".");
	}
	
	//Getter & Setter
	public String getTradeMark() {
		return tradeMark;
	}

	public void setTreadMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}
}