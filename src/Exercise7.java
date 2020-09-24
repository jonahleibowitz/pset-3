import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise7 {
    private static DecimalFormat formatter = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Salary  : ");
        double salary = in.nextDouble();
        System.out.print("401(k)  : ");
        double savingsAccount = in.nextDouble();
        System.out.print("Federal : ");
        double fed = in.nextDouble();
        System.out.print("State   : ");
        double state = in.nextDouble();

            double pretax = (salary-((salary/100)*savingsAccount)); //deducting the 401(k) before taxes
            double yearlyMinusFed = (pretax- ((pretax/100)*fed)); //Subtracting only federal from pretax
            double yearlyMinusAllTax= (yearlyMinusFed- ((pretax/100)*state)); //Subtracting state from pretax
            double payCheck = yearlyMinusAllTax/24; //Dividing yearly number for a 2 week pay check


        System.out.println('\n' + "$" + formatter.format(payCheck) + ".");


        in.close();
    }
}