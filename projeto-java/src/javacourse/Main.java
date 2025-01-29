package javacourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cursojava.classes.Student;

public class Main {

	public static void main(String[] args) {

		Scanner board = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();

		while (true) {

			System.out.println("Choose an option: \n" 
					+ "1-Register student \n" 
					+ "2-Consult a student \n"
					+ "3-See student results\n"
					+ " \n" + "4-Sair");

			int choice = board.nextInt();
			board.nextLine();

			switch (choice) {
			case 1: {
				System.out.println("Write the student name: ");
				String studentName = board.nextLine();

				System.out.println("Write the student registration: ");
				String studentRegistration = board.nextLine();

				System.out.println("write the student age: ");
				int studentAge = board.nextInt();

				System.out.println("Write the first grade: ");
				double firstGrade = board.nextDouble();

				System.out.println("Write the second grade: ");
				double secondGrade = board.nextDouble();

				System.out.println("Write the third grade: ");
				double thirdGrade = board.nextDouble();

				board.nextLine();

				students.add(
						new Student(studentName, studentRegistration, studentAge, firstGrade, secondGrade, thirdGrade));
				System.out.println("Aluno " + studentName + " Successfully  registered!");
				break;
			}

			case 2: {
				System.out.println("Write the registration number of the student you need to consult: ");
				String consultedStudent = board.nextLine();

				boolean found = false;
				for (Student student : students) {
					if (student.registration.equals(consultedStudent)) {
						System.out.println("Name: " + student.name + "\nRegistration: " + student.registration + "\nAge: "
								+ student.age + "\nFirst grade: " + student.firstGrade + "\nSecond grade: "
								+ student.secondGrade + "\nThird grade: " + student.thirdGrade
								+ "\nFinal everage: " + student.calculateAverage());
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println("Student not found.");
				}
				break;
			}

			case 3: {
				if (students.isEmpty()) {
					System.out.println("No students registered.");
				} else {
					for (Student student : students) {
						System.out.println("Name: " + student.name + " - Final Avarage: " + student.calculateAverage()
								+ " - Status: " + (student.calculateAverage() >= 7 ? "Approved" : "failed"));
					}
				}
				break;
			}

			case 4:
				System.out.println("Closing the program...");
				board.close();
				return;

			default:
				System.out.println("Invalid option, try again.");
			}
		}
	}
}
