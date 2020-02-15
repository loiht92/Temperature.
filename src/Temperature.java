import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double celsius;
        double fahrenheit;

        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter a choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("fahrenheit To celsius: " +fahrenheitTocelsius(fahrenheit));
                    break;

                case 2:
                    System.out.println("Enter celsius");
                    celsius = scanner.nextDouble();
                    System.out.println("celsius To Fahrenheit:" +celsiusToFahrenheit(celsius));
                    break;

                case 0:
                    System.exit(0);
            }

        } while (choice != 0);

    }
    private static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32 ;
        return fahrenheit;
    }

    private static  double fahrenheitTocelsius(double fahrenheit){
        double celsius = (5.0 /9) *(fahrenheit - 32);
        return celsius;
    }




}
