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

        int lower, upper;

        while (true) {
            lower = readInt("Enter the lower limit >> ");
            upper = readInt("Enter the upper limit >> ");
            if (upper <= lower) {
                System.out.println("The upper limit must be greater than the lower limit!");
            } else {
                break;
            }
        }

        Random random = new Random();
        double score = 100;
        int randNum = random.nextInt(upper - lower + 1) + lower;

        System.out.printf("Guess the number between %d and %d\n", lower, upper);
        System.out.println();

        while (true) {
            if (score <= 0) {
                System.out.println("You ran out of points!");
                break;
            }
            int userNum = readInt(">> ");
            if (userNum == randNum) {
                System.out.printf("You got it! Your score is %.0f\n", score);
                break;
            } else {
                score -= Math.abs(userNum - randNum) * 25.0 / (upper - lower);
            }
            System.out.printf("Too %s, your score: %.0f\n", userNum > randNum ? "high" : "low", score);
        }
    }
}
