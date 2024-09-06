import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the number of students: ");

        int numstudent = sc.nextInt();
        int[] grades = new int[numstudent];
        for (int i = 0; i < numstudent; i++) {
            System.out.printf("Enter grade for student " +(i+1)+ " : ");
            grades[i] = sc.nextInt();
        }

        int sum = 0;
        int highest = grades[0];
        int lowest = grades[0];
        for (int grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            } else if (grade < lowest) {
                lowest = grade;

            }
        }
        double average = sum / numstudent;

        System.out.println("/n Result:" );
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

    }
}