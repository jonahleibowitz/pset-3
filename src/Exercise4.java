import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise4 {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Height:");
        int height = in.nextInt();
        System.out.println("Width:");
        int width = in.nextInt();
        System.out.println("Height:" + height + '\n' + "Width:" + width);
        double perimeter= (height * 2.54) * (width * 2.54) ;
        df.setRoundingMode(RoundingMode.UP);
        System.out.println('\n' + df.format(perimeter) + " centimeters");

        in.close();
    }
}

