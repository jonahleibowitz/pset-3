import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise5 {
    private static DecimalFormat formatter = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Homework 1 : ");
        double homeworkOne = in.nextDouble();
        System.out.print("Homework 2 : ");
        double homeworkTwo = in.nextDouble();
        System.out.print("Homework 3 : ");
        double homeworkThree = in.nextDouble();
        System.out.print("Quiz 1     : ");
        double quizOne = in.nextDouble();
        System.out.print("Quiz 2     : ");
        double quizTwo = in.nextDouble();
        System.out.print("Test 1     : ");
        double testOne = in.nextDouble();

            double totalGrade= ( ((homeworkOne + homeworkTwo + homeworkThree)/3*0.15)
               + ((quizOne + quizTwo)/2*0.35) + (testOne*0.50));

        System.out.println('\n'+ formatter.format(totalGrade) +"%.");

        in.close();
    }
}
