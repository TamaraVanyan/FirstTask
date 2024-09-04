import java.util.Scanner;
public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Մուտքագրեք առաջին տասնորդական թիվը: ");
        double num1 = scanner.nextDouble();

        System.out.print("Մուտքագրեք երկրորդ տասնորդական թիվը: ");
        double num2 = scanner.nextDouble();

        System.out.print("Մուտքագրեք երրորդ տասնորդական թիվը: ");
        double num3 = scanner.nextDouble();

        double sum = num1 + num2 + num3;

        int integerPart = (int) sum;
        System.out.println("Գումարի ամբողջ մասը: " + integerPart);

        double DecimalPart = sum - integerPart;
        System.out.println("Գումարի տասնորդական մասը: " + DecimalPart);

        int integerSum = (int) num1 + (int) num2 + (int) num3;
        System.out.println("Երեք թվերի ամբողջ մասերի գումարը: " + integerSum);

        scanner.close();
    }
}