import java.util.Scanner;
//import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise3 {
    //private static DecimalFormat df = new DecimalFormat("0.00");
    private static DecimalFormat answerFormat = new DecimalFormat("#,###.00");
   // private static DecimalFormat noDecimals = new DecimalFormat("#,###");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Height:");
        double height = in.nextDouble();
        System.out.println("Width:");
        double width = in.nextDouble();
        System.out.println("Height : " + height + '\n' + "Width  : " + width);

        double area= (height * 25.4) * (width * 25.4) ; //May not be exact conversion rate between inches and mm but should be close enough
       // df.setRoundingMode(RoundingMode.UP);

       System.out.println('\n' + answerFormat.format(area) + " square millimeters.");

                   // System.out.println('\n' + df.format(area) + " square millimeters");

        in.close();
    }
}
