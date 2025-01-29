package cursojava.classes;

public class Student {
	public String name;
	public String registration;
	public int age;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;
	
	public Student(String name, String ragistration, int age, double firstGrade, 
			double secondGrade, double thirdGrade) {
		this.name = name;
		this.registration = ragistration;
		this.age = age;
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
		this.thirdGrade = thirdGrade;
	}
	
	public double calculateAverage() {
		double average = (firstGrade + secondGrade + thirdGrade)/3;
		return average;
	}
}
