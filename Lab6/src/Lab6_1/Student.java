package Lab6_1;

public class Student {
	protected String name;
	protected int id;
	protected double gpa;
	
	public Student(int id,double gpa) {
		this.id = id;
		name = "";
		this.gpa = gpa;
	}
	
	public Student(int id,String name,double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public double getGPA(){
		return gpa;
	}

	public void setGPA(Double gpa){
		this.gpa = gpa;
	}

	public String toString(){
		return "Student:"
			+"\nID: "+id
			+"\nName: "+name
			+"\nGPA: "+gpa;
	}

}
