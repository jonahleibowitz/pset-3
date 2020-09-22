import java.util.Scanner;
//import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise9 {
   // private static DecimalFormat df = new DecimalFormat("0");
    private static DecimalFormat formatter = new DecimalFormat("#,###");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Amount:");
        double amount = in.nextDouble();
        double originalAmount = amount;

        double quarters= Math.floor(amount/0.25);
         amount = amount-(quarters*0.25);

        double tenCents= Math.floor(amount/0.1);
            amount = amount - (tenCents * 0.1);

        double nickels= Math.floor(amount/0.05);
            amount = amount- (nickels* 0.05);

        double pennies= amount/0.01;


        System.out.println("Amount   : " + originalAmount + '\n' + '\n' +
                "Quarters : " + formatter.format(quarters) + '\n' + "Dimes    : "
                + formatter.format(tenCents) + '\n' + "Nickels  : " + formatter.format(nickels) + '\n'
                + "Pennies  : " + formatter.format(pennies));

      // df.setRoundingMode(RoundingMode.UP);
       // System.out.println('\n'+ "$" + formatter.format(grossPay));

        in.close();
    }
}

