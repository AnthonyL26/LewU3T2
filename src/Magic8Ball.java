import java.util.Scanner;

public class Magic8Ball
{
    public static void main(String[] args)
    {
        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

        String response = "";  // update this variable with the response

        // Write code here to generate a random number from 1 to 6
        int outcome = (int) (Math.random()*6)+1;

        if (outcome == 1) {
            response += ("Outlook Good");
        } if (outcome == 2) {
            response += ("Without a doubt!");
        } if (outcome == 3) {
            response += ("Ask again later");
        } if (outcome == 4) {
            response += ("Better not tell you now");
        } if (outcome == 5) {
            response += ("My sources say no");
        } if (outcome == 6) {
            response += ("Don't count on it.");
        }
        System.out.println(response);  // print response
    }
}
