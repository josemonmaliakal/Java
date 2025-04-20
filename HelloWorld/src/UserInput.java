import java.util.Scanner;

public class UserInput {
    // Class to demonstrate user input
    public static void main(String[] args){
        System.out.println("Enter your name ");
        Scanner scanner = new Scanner(System.in);
        // Scan string with spaces
        String name = scanner.nextLine();
        // Reading Integers
        System.out.println("Enter your age ");
        int age = scanner.nextInt();
        System.out.println("Hello "+name + " Your Age is "+age);
        // Reading Doubles
        System.out.println("Enter your GPA ");
        double gpa = scanner.nextDouble();
        System.out.println("Hello "+name + " Your Age is "+age+ "Your GPA is "+gpa);
        scanner.close();
    }
}
