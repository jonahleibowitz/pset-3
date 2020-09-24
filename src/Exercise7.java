import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise7 {
    private static DecimalFormat formatter = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Salary:");
        double salary = in.nextDouble();
        System.out.println("401(k):");
        double savingsAccount = in.nextDouble();
        System.out.println("Federal:");
        double fed = in.nextDouble();
        System.out.println("State:");
        double state = in.nextDouble();

        double pretax = (salary-((salary/100)*savingsAccount)); //deducting the 401(k) before taxes


         double yearlyMinusFed = (pretax- ((pretax/100)*fed));
         double yearlyMinusAllTax= (yearlyMinusFed- ((pretax/100)*state));
        double payCheck = yearlyMinusAllTax/24;


        System.out.println("Salary  : " + salary + '\n' + "401(k)  : " + savingsAccount
         + '\n' + "Federal : " + fed + '\n' + "State   : " + state);



        System.out.println('\n' + "$" + formatter.format(payCheck) + ".");


        in.close();
    }
}