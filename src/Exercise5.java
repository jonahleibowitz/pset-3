import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise5 {
    private static DecimalFormat df = new DecimalFormat("0.00");
    private static DecimalFormat formatter = new DecimalFormat("#,###.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Homework 1:");
        double homeworkOne = in.nextDouble();
        System.out.println("Homework 2:");
        double homeworkTwo = in.nextDouble();
        System.out.println("Homework 3:");
        double homeworkThree = in.nextDouble();
        System.out.println("Quiz 1:");
        double quizOne = in.nextDouble();
        System.out.println("Quiz 2:");
        double quizTwo = in.nextDouble();
        System.out.println("Test 1:");
        double testOne = in.nextDouble();

        double totalGrade= ( ((homeworkOne + homeworkTwo + homeworkThree)/3*0.15)
               + ((quizOne + quizTwo)/2*0.35) + (testOne*0.50));
                System.out.println("Homework 1 :" + homeworkOne + '\n' + "Homework 2 :" + homeworkTwo + '\n'
               + "Homework 3 :" + homeworkThree + '\n' + "Quiz 1     :" + quizOne + '\n' +
                "Quiz 2     :" + quizTwo + '\n' + "Test 1     :" + testOne);

        df.setRoundingMode(RoundingMode.UP);
        System.out.println('\n'+ formatter.format(totalGrade) +"%");

        in.close();
    }
}
