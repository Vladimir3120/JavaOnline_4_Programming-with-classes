package Simpleclass03;

public class Student {

	private String surName;
	private String name;
	private String middleName;
	private int numberOfGroup;
	private int[] academicPerfomance;

	public Student() {
		super();
	}

	public Student(String surName, String name, String middleName, int numberOfGroup, int[] academicPerfomance) {
		super();
		this.surName = surName;
		this.name = name;
		this.middleName = middleName;
		this.numberOfGroup = numberOfGroup;
		this.academicPerfomance = academicPerfomance;
	}

	public String getSurName() {
		return surName;
	}

	public String getName() {
		return name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public int getNumberOfGroup() {
		return numberOfGroup;
	}

	public int[] getAcademicPerfomance() {
		return academicPerfomance;
	}

	public void excellentStudents(Student[] students) {

		for (int i = 0; i < students.length; i++) {
			int count = 0;
			for (int j = 0; j < students[i].getAcademicPerfomance().length; j++) {

				if (students[i].getAcademicPerfomance()[j] >= 9) {
					count++;
				}

			}
			if (count == 5) {
				System.out.println(students[i].getSurName() + " " + "(группа " + students[i].getNumberOfGroup() + ")");
			}

		}

	}
}
