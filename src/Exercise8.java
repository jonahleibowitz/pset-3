import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise8 {
    private static DecimalFormat formatter = new DecimalFormat("#,###");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Students:");
        double students = in.nextDouble();
        System.out.println("Teachers:");
        double teachers = in.nextDouble();
        System.out.println("Capacity:");
        double capacity = in.nextDouble();

        double totalPeople= students+teachers;
        double buses = Math.ceil(totalPeople/capacity);
        double overflow = totalPeople - (Math.floor(totalPeople/capacity)*capacity);



        System.out.println("Students  : " + students + '\n' + "Teachers  : " + teachers
                + '\n' + "Capacity  : " + capacity + '\n' + '\n' + "Buses required      : " +
                formatter.format(buses) + '\n' + "Overflow passengers : " + formatter.format(overflow));


        in.close();
    }
}

