import java.util.Scanner;
public class FourDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four digit number: ");
        int number = scanner.nextInt();
        System.out.println("Thousands: " + (number / 1000));
        System.out.println("Hundreds: " + (number / 100 % 10));
        System.out.println("Tens: " + (number / 10 % 10));
        System.out.println("Units: " + (number % 10));
    }
}
