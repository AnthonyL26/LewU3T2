import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String input = scan.nextLine();
        Calculator calculator = new Calculator(input);
        System.out.println("Result: " + calculator.calculate());
    }
}
