import java.util.Scanner;

public class CheckDivisability{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Մուտքագրեք առաջին թիվը (a): ");
        int a = scanner.nextInt();

        System.out.print("Մուտքագրեք երկրորդ թիվը (b): ");
        int b = scanner.nextInt();

        boolean isDivisible = a % b == 0;

        System.out.println(isDivisible);
        
        scanner.close();
    }
}
