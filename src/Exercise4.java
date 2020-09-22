import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise4 {
    private static DecimalFormat formatter = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Height:");
        double height = in.nextDouble();
        System.out.println("Width:");
        double width = in.nextDouble();
        System.out.println("Height : " + height + '\n' + "Width  : " + width);
        double perimeter= ((height * 2.54)*2) + ((width * 2.54)*2) ;

        System.out.println('\n' + formatter.format(perimeter) + " centimeters");


        in.close();
    }
}
