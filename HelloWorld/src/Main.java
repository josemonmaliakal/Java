public class Main {
    public static void main(String[] args){
        System.out.print("Hello There , This is a test ");
		int age = 10;
		System.out.print("I am  of "+age);
        boolean isStudent = true ;
        boolean forSale;
        System.out.print("\n");
        if (isStudent){
            System.out.print("You are a student");
        }
        else{
            System.out.print("Not  a student ");
        }
        // Int
        int  year = 2025 ;
        // Strings
        String name = "JoseMon Maliakal ";
        String food = "Appam ";
        String email = "fakeemail@gmail.com";
        String car = "Toyota";
        String color = "Red";
        System.out.println("You are "+name+ "AND You like "+food);
        System.out.println("Your Choice is :"+car+" "+ year+" "+ color);
        System.out.println("And the price is :"+ 7000000 + " INR ");
        forSale = true ;
        if (forSale){
            System.out.println("Car For sale");
        }

    }
}