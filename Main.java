import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("press 1 for Fahrenheit to Celsius convertor: ");
        System.out.print("press 2 for Celsius to Fahrenheit convertor: ");

        int input = s.nextInt();

        if (input == 1) {
            System.out.println("you have chosen Fahrenheit to Celsius convertor, enter Fahrenheit: ");
            int f = s.nextInt();

            double ftoc = (f - 32) * 5 / 9;
            System.out.println(ftoc);
        }

        else if (input == 2) {
            System.out.println("you have chosen Celsius to Fahrenheit convertor, enter Celsius: ");
            int c = s.nextInt();

            double ctof = c * (9.0 / 5.0) + 32;
            System.out.println(ctof);
        } else {
            System.out.println("choose only 1 or 2.");
        }

        s.close();
    }
}