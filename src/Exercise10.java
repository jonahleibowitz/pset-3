import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise10 {
    private static DecimalFormat formatter = new DecimalFormat("#,##0.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Fahrenheit : ");
        double fahrenheit = in.nextDouble();

        double celsius= ((fahrenheit-32)*(5/9));
        double kelvin = celsius + 273.15;

        System.out.println( '\n' + "Celsius    :" + formatter.format(celsius) +
                '\n' + "Kelvin     :" + formatter.format(kelvin));

        in.close();
    }
}

