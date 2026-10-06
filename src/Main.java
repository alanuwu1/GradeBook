import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Welcome To Your GradeBook");
		int count = 0;
		double sum = 0;
		double highest = Double.NEGATIVE_INFINITY;
		double lowest = Double.POSITIVE_INFINITY;

		System.out.println("Enter your grade: ");
		double grade = scanner.nextDouble();
		while (grade > 0) {
//	System.out.println("This action is not valid");

			if (grade > 100) {
				System.out.println("This is action is not valid");
			} else {
				count++;
				sum += grade;

				if (grade > highest) {
					highest = grade;
				}
				if (grade > lowest) {
					lowest = grade;
				}
			}
			System.out.println("Enter your grade: ");
			grade = scanner.nextDouble();

		}
		double average = sum / count;
		System.out.println("All done!");
		System.out.println("Total Grades Entered: " + count);
		System.out.println("Highest Grade: " + highest);
		System.out.println("Lowest Grade: " + lowest);
		System.out.println("Average: " + average);
	}
}
