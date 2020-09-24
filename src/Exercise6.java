import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise6 {
    private static DecimalFormat df = new DecimalFormat("0.00");
    private static DecimalFormat formatter = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Wage:");
        double wage = in.nextDouble();
        System.out.println("Monday:");
        double monday = in.nextDouble();
        System.out.println("Tuesday:");
        double tuesday = in.nextDouble();
        System.out.println("Wednesday:");
        double wednesday = in.nextDouble();
        System.out.println("Thursday:");
        double thursday = in.nextDouble();
        System.out.println("Friday:");
        double friday = in.nextDouble();
        System.out.println("Saturday:");
        double saturday = in.nextDouble();
        System.out.println("Sunday:");
        double sunday = in.nextDouble();

        double grossPay= (wage* (monday+tuesday+wednesday+thursday+friday+saturday+sunday));
        System.out.println("Wage      : " + wage + '\n' + "Monday    : " + monday + '\n'
                + "Tuesday   : " + tuesday + '\n' + "Wednesday : " + wednesday + '\n' +
                "Thursday  : " + thursday + '\n' + "Friday    : " + friday + '\n' +
                "Saturday  : " + saturday + '\n' + "Sunday    : " + sunday);

        df.setRoundingMode(RoundingMode.UP);
        System.out.println('\n'+ "$" + formatter.format(grossPay) + ".");

        in.close();
    }
}

