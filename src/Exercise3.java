import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Height:");
        int height = in.nextInt();
        System.out.println("Width:");
        int width = in.nextInt();
        System.out.println("Height:" + height + '\n' + "Width:" + width);
            double area= (height * 25.4) * (width * 25.4) ; //May not be exact conversion rate between inches and mm but should be close enough
                    System.out.println('\n' + area + " square millimeters");

        in.close();
    }
}
