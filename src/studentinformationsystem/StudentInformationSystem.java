package studentinformationsystem;

public class StudentInformationSystem {
    public static void main(String[] args) {
        String studentName = "Nur Fatin Nasuha Binti Jefry";
        String studentId = "S88272";
        double mark1 = 85.0;
        double mark2 = 92.0;
        double total = mark1 + mark2;

        System.out.println("Student Information System");
        System.out.println("Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.printf("Mark 1: %.1f%n", mark1);
        System.out.printf("Mark 2: %.1f%n", mark2);
        System.out.printf("Total mark: %.1f / 200%n", total);
    }
}
