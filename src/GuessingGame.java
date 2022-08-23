import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public  GuessingGame(){

    }
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        boolean correctGuess = false;

        int guess = 0;
        int increment = 0;

        System.out.println("Hello user, What is your name?");

        String name = scan.nextLine();

        System.out.println("Welcome " + name + " I'm thinking of a number between 1 and 100.");

        Random rand = new Random();

        int number = rand.nextInt(100);

        System.out.println("Try to guess my number.");

        while (correctGuess == false) {

            increment++;

            try {

                guess = scan.nextInt();
            } catch (Exception e) {

                String badScan = scan.next();

                System.out.println("That's not an integer, try again");

                continue;
            }

            if (guess > 100 || guess < 1) {

                System.out.println("You're guess is out of range. Please try again.");
            }

            else if (guess > number) {

                System.out.println("You're guess is too high. Please try again.");
            }

            else if (guess < number) {

                System.out.println("You're guess is too low. Please try again.");
            }

            else if (guess == number) {

                System.out.println("Well done, " + name + "! You found my number in " + increment + " tries!");

                correctGuess = true;
                scan.close();
            }
        }
    }
}
