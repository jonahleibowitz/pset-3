import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise4 {
    private static DecimalFormat formatter = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Height : ");
        double height = in.nextDouble();
        System.out.print("Width  : ");
        double width = in.nextDouble();
        double perimeter= ((height * 2.54)*2) + ((width * 2.54)*2) ;

        System.out.println('\n' + formatter.format(perimeter) + " centimeters.");


        in.close();
    }
}
