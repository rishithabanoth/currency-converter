import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("##.###");

        int code;
        do {
            System.out.println("*** Welcome to Currency Converter Project ***");
            System.out.println("Enter the currency code:");
            System.out.println("1: Rupees\n2: Dollar\n3: Pound\n4: Euro\n5: Kuwaiti dinar\n0: Exit");

            code = scanner.nextInt();

            if (code == 0) {
                System.out.println("Exiting the program. Thank you!");
                break;
            }

            double rupee, dollar, pound, euro, KWD;

            switch (code) {
                case 1:
                    System.out.println("Enter amount in rupees:");
                    rupee = scanner.nextDouble();
                    dollar = rupee / 75;
                    System.out.println("Dollar: " + formatter.format(dollar));
                    pound = rupee / 101;
                    System.out.println("Pound: " + formatter.format(pound));
                    euro = rupee / 84;
                    System.out.println("Euro: " + formatter.format(euro));
                    KWD = rupee / 250;
                    System.out.println("Kuwaiti dinar: " + formatter.format(KWD));
                    break;

                case 2:
                    System.out.println("Enter amount in dollar:");
                    dollar = scanner.nextDouble();
                    rupee = dollar * 75;
                    System.out.println("Rupees: " + formatter.format(rupee));
                    pound = dollar * 0.72;
                    System.out.println("Pound: " + formatter.format(pound));
                    euro = dollar * 0.88;
                    System.out.println("Euro: " + formatter.format(euro));
                    KWD = dollar * 0.30;
                    System.out.println("Kuwaiti dinar: " + formatter.format(KWD));
                    break;

                case 3:
                    // ... (similar structure for other case)

                default:
                    System.out.println("Invalid Code!");
                    break;
            }
        } while (code != 0);

        scanner.close();
    }
}