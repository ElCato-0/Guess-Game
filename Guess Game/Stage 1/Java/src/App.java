import java.util.Scanner;
import java.util.Random;

public class App {
    
    public static int readInt(String message) {
        return readInt(message, "Invalid integer!");
    }

    public static int readInt(String message, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            try {
                int num = Integer.parseInt(scanner.nextLine());
                return num;
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println();
        System.out.println("Guess the number between 1 and 10");
        System.out.println();

        Random random = new Random();
        int randNum = random.nextInt(10) + 1;

        while (true) {
            int userNum = readInt(">> ");

            if (userNum > randNum) {
                System.out.println("Too high, try again.");
            } else if (userNum < randNum) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("You got it!");
                break;
            }
        }
    }
}
