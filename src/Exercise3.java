import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise3 {
    private static DecimalFormat answerFormat = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Height : ");
        double height = in.nextDouble();
        System.out.print("Width  : ");
        double width = in.nextDouble();

        double area= (height * 25.4) * (width * 25.4) ; //May not be exact conversion rate between inches and mm but should be close enough


       System.out.println('\n' + answerFormat.format(area) + " square millimeters.");

        in.close();
    }
}
