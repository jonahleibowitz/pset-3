import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise7 {
    private static DecimalFormat formatter = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Salary:");
        double salary = in.nextDouble();
        System.out.println("401(k):");
        double savingsAccount = in.nextDouble();
        System.out.println("Federal:");
        double fed = in.nextDouble();
        System.out.println("State:");
        double state = in.nextDouble();

        double gross = (salary-((salary/100)*savingsAccount));


        double netPayFed = (gross- ((gross/100)* fed+state));
        double netPayState = netPayFed- ((netPayFed/100)* state);
        double payCheck = netPayState/24;
       // double payCheck= (netPayState-((netPayState/100)*fed))/24;


        System.out.println("Salary  : " + salary + '\n' + "401(k)  : " + savingsAccount
         + '\n' + "Federal : " + fed + '\n' + "State   : " + state);



        System.out.println('\n' + "$" + formatter.format(payCheck));


        in.close();
    }
}