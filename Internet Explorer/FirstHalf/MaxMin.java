package FirstHalf;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] arg) {
        int answerMax;
        Scanner One = new Scanner(System.in);
        Scanner Two = new Scanner(System.in);

        System.out.println("Enter 2 Number or something:");
        answerMax = MyMax(One.nextInt(), Two.nextInt());

        System.out.println("Your max is " + answerMax);
    }

    public static int MyMax(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
}
