import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise8 {
    private static DecimalFormat formatter = new DecimalFormat("#,###");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Students : ");
        int students = in.nextInt();
        System.out.print("Teachers : ");
        int teachers = in.nextInt();
        System.out.print("Capacity : ");
        int capacity = in.nextInt();

        double buses= (students + teachers + capacity -1 )/capacity;
        int overflow= (students + teachers) % capacity;


        System.out.println('\n' + "Buses required      : " +
                formatter.format(buses) + '\n' + "Overflow passengers : " + formatter.format(overflow));


        in.close();
    }
}

