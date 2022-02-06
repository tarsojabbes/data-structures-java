package Arrays;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many day's temperature? ");

        int numDays = scanner.nextInt();
        int sum = 0;
        int[] temperatures = new int[numDays];

        for (int i = 1; i <= numDays; i++){
            System.out.print("How many day's temperature? ");
            int dayTemp = scanner.nextInt();
            temperatures[i - 1] = dayTemp;
            sum = sum + dayTemp;
        }

        scanner.close();

        double average = sum/numDays;

        int aboveAverage = 0;

        for (int x : temperatures){
            if (x > average){
                aboveAverage++;
            }
        }

        System.out.println("Average temperature: " + average);
        System.out.println(aboveAverage + " day(s) above the average.");

    }
}
