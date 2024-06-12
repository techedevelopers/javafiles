import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("Welcome to My Calculator");
        System.out.println("***************");


        System.out.println("1. Press for Addition");
        System.out.println("2. Press for Subtraction");
        System.out.println("3. Press for Multiplication");
        System.out.println("4. Press for Division");
        System.out.println("5. Press for Modulus");
        System.out.println("6. Exit");


        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter your input..");//
        int input = scanner.nextInt();

        if (input<1 || input>6){
            System.out.println("Invalid option. Kindly select valid option between 1 to 6");
            return;
        }
        if (input == 6){
            System.out.println("Exit");
            return;
        }

        System.out.println("Enter your input values against x");
        double x=scanner.nextDouble();
        System.out.println("Enter your input values against y");
        double y=scanner.nextDouble();

        switch (input){
            case 1:
            System.out.println("Result " + (x+y));
        break;
            case 2:
                System.out.println("Result " + (x-y));
                break;
            case 3:
                System.out.println("Result " + (x*y));
                break;
            case 4:
                if (y != 0){
                    System.out.println("Result " + (x/y));
                }
                else {
                    System.out.println("Error");
                }
                break;
            case 5:
                if (y !=0){
                    System.out.println("Result " + (x%y));
                }
                else{
                    System.out.println("Modulus is not allowed by Zero");
                }
                break;
            default:
                System.out.println("Invlaid input");
                break;


        }

    }
}
