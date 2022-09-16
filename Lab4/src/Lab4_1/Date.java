package Lab4_1;
public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day >=1 && day <= 31)
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >=1 && month <=12)
        this.month = month;
    }

    public int getYear() {
        return year + 543;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //main
	public static void main(String[] args) {
        System.out.println("Date :");
        Date D = new Date(1, 1, 2000);
		System.out.println(D.getDay());
        System.out.println(D.getMonth());
        System.out.println(D.getYear());
        D.setDay(17);
        D.setMonth(10);
        D.setYear(2003);
        /*------------------------------ */
        System.out.print("\n");
        System.out.println(D.getDay());
        System.out.println(D.getMonth());
        System.out.println(D.getYear());
        /*------------------------------ */
        D.setDay(34);
        D.setMonth(12);
        D.setYear(2003);
        System.out.print("\n");
        System.out.println(D.getDay());
        System.out.println(D.getMonth());
        System.out.println(D.getYear());
	}
}
