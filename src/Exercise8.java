import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise8 {
    private static DecimalFormat formatter = new DecimalFormat("#,###.00");
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
                + '\n' + "Capacity : " + capacity + '\n' + '\n' + "Buses required    : " +
                buses + '\n' + "Overflow passengers : " + overflow);


        in.close();
    }
}

