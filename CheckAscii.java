import java.util.Scanner;

public class CheckAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input lowercase : ");
        char lowercase = scanner.next().charAt(0);

        char uppercase = (char) (lowercase - 32);

        System.out.println("Uppercase: " + uppercase);

        scanner.close();
    }
}
