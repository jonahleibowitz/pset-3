import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise9 {
    private static DecimalFormat formatter = new DecimalFormat("#,###");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Amount   : ");
        double amount = 100* in.nextDouble();

        double quarters = amount/25;
        quarters= (int) quarters;
        amount = amount % 25;

        double dimes = amount/10;
        dimes= (int) dimes;
        amount = amount % 10;

        double nickels = amount/5;
        nickels = (int) nickels;
        amount = amount % 5;

        double pennies= amount;
        pennies = (int) pennies;

        System.out.println( '\n' +
                        "Quarters : " + formatter.format(quarters) + '\n' + "Dimes    : "
                + formatter.format(dimes) + '\n' + "Nickels  : " + formatter.format(nickels) + '\n'
               + "Pennies  : " + formatter.format(pennies));


        in.close();
    }
}

