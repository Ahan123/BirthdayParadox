import java.util.Scanner;

public class BirthdayParadox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the number of people you want to insert on the x-axis.");
        int maxNumberOfPeople = scanner.nextInt();

        for (double numberOfPeople = 1; numberOfPeople <= maxNumberOfPeople; numberOfPeople++) {
            double numerator = 1;
            double denominator = 1;
            for (double i = 365; i > (365 - numberOfPeople); i--) {
                numerator*=i;
                denominator *= 365;
            }
            double probability = 1.0d - (double) numerator / (double) denominator;
            System.out.println(probability);
        }
    }
}
