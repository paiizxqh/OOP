package Lab6_1;


public class Undergrad extends Student{
  protected String year;

  public Undergrad(int id, String name, double gpa, String year) {
    super(id,name,gpa);
    this.year = year;
  }

  public String getYear(){
    return year;
  }

  public void setYear(String year){
    this.year = year;
  }

  public String toString(){
    return "Undergraduate "+super.toString()+"\nYear: "+year;
  }
}