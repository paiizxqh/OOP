package Lab9_2;

public class Student {
	private String name;
	private String grade;
	private double GPA = 0;

	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}

	public void show() {
		try {
			greet();
			System.out.println(name + " registered " + grade.length()
					+ " subjects and got GPA " + GPA);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void greet() throws Exception {
		int lengthName = name.length();
		int lengthGrade = grade.length();
		for (int i = 0; i < lengthName; i++) {
			// ��Ǩ�ͺ��������յ���Ţ�������
			if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
				throw new DigitException(
						"DigitException :(digit is not allowed in name) can not display.");
			}
			// ��Ǩ�ͺ��������ժ�ͧ��ҧ�������
			if (name.charAt(i) == ' ') {
				throw new SpaceException(
						"SpaceException :(space is not allowed in name) can not display.");
			}
		}
		for (int i = 0; i < lengthGrade; i++) {
			// ��Ǩ�ͺ�ô��Ҷ١��ͧ�������
			if (grade.charAt(i) != 'A' && grade.charAt(i) != 'B'
					&& grade.charAt(i) != 'C' && grade.charAt(i) != 'D'
					&& grade.charAt(i) != 'E' && grade.charAt(i) != 'F'
					&& grade.charAt(i) != 'I') {
				throw new GradeException(
						"GradeException :(grade must be A B C D E F) can not display.");
			}
			// ��Ǩ�ͺ�ô����� I
			if (grade.charAt(i) == 'I') {
				throw new IncompleteException(
						"IncompleteException :(grade I is incomplete) can not display.");
			}
			switch (grade.charAt(i)) {
			case 'A':
				GPA += 4;
				break;
			case 'B':
				GPA += 3;
				break;
			case 'C':
				GPA += 2;
				break;
			case 'D':
				GPA += 1;
				break;
			/*
			 * case 'E': GPA =+ 0.5; break;
			 */
			case 'F':
				GPA += 0;
				break;
			}
		}
		GPA = GPA / grade.length();
	}

	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
}