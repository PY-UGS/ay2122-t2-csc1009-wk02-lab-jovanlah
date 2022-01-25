import java.util.Scanner;

public class Q2_NumInput {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");

        double doubleValue1 = in.nextDouble();
        double doubleValue2 = in.nextDouble();
        double doubleValue3 = in.nextDouble();

        double average = (doubleValue1+doubleValue2+doubleValue3)/3;
        System.out.printf("The average of %.1f %.1f %.1f is %.1f", doubleValue1,doubleValue2,doubleValue3,average);
        in.close();


    }
}
