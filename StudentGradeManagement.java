import java.util.Scanner;

public class StudentGradeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int sub3 = sc.nextInt();

        // Calculate average
        double average = (sub1 + sub2 + sub3) / 3.0;

        // Determine grade
        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // Display report
        System.out.println("\n========== Student Report ==========");
        System.out.println("Student Name : " + name);
        System.out.println("Subject 1    : " + sub1);
        System.out.println("Subject 2    : " + sub2);
        System.out.println("Subject 3    : " + sub3);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade        : " + grade);

        sc.close();
    }
}