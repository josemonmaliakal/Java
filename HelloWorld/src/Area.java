import java.util.Scanner;

public class Area {
    // Program to calculate are of triangle
    public static void main(String[] args){
        // variable declaration
        double base = 0;
        double height = 0;
        double area = 0 ;
        //Accept Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate Triangle Area");
        System.out.print("Enter Base Length (B) of Triangle In CM : ");
        base = scanner.nextDouble();
        System.out.print("Enter Height (H) of Triangle In CM : ");
        // Calculator
        height = scanner.nextDouble();
        area = .5 * base * height;
        System.out.println("Area calculated as "+area+" CM²");
        scanner.close();


    }
}
