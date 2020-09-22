import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise10 {
    private static DecimalFormat df = new DecimalFormat("0.00");
    private static DecimalFormat formatter = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Fahrenheit:");
        double fahrenheit = in.nextDouble();

        double celsius= ((fahrenheit-32)*(5/9));
        double kelvin = celsius + 273.15;

        System.out.println("Fahrenheit : " + fahrenheit + '\n' + '\n' + "Celsius    :" + celsius + '\n' + "Kelvin     :" + kelvin);

      //  df.setRoundingMode(RoundingMode.UP);
        //System.out.println('\n'+ formatter.format(totalGrade) +"%");

        in.close();
    }
}

