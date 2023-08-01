// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dataPoints;
        Random rnd = new Random();
        dataPoints = new int[100];
        Scanner in = new Scanner(System.in);
        int userInput = 0;
        int userValueFound = 0;
        double dataPointsSum = 0;
        double dataPointsAverage = 0;
        int valueFoundIndex = -1;
        int maxValue = 0;
        int minValue = 0;
        for(int i = 0; i < 100; i++){
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for(int i = 0; i < 100; i++){
            System.out.print( dataPoints[i] + " | ");
        }
        for(int i = 0; i < 100; i++){
            dataPointsSum = dataPointsSum + dataPoints[i];
        }
        dataPointsAverage = dataPointsSum / 100;
        System.out.println();
        System.out.println("The sum of the random array dataPoints is " + dataPointsSum);
        System.out.println("The average of the random array dataPoints is " + dataPointsAverage);

        userInput = SafeInput.getRangedInt(in, "Enter a number ", 1, 100);
        for(int i = 0; i < 100; i++){
            if(dataPoints[i] == userInput){
                userValueFound++;
            }
        }
        System.out.println("Your value was found " + userValueFound + " times");

        userInput = SafeInput.getRangedInt(in, "Enter a number ", 1, 100);
        for(int i = 0; i < 100; i++){
            if(dataPoints[i] == userInput){
                valueFoundIndex = i;
                break;
            }
        }
        if(valueFoundIndex == -1){
            System.out.println("Value " + userInput + " not found");
        }else {
            System.out.println("The value " + userInput + " was found at array index " + valueFoundIndex);
        }
        for(int i = 0; i < 100; i++){
            if(i == 0) {
                minValue = dataPoints[i];
                maxValue = dataPoints[i];
            }else{
                if(dataPoints[i] < minValue){
                    minValue = dataPoints[i];
                }
                if(dataPoints[i] > maxValue){
                    maxValue = dataPoints[i];
                }
            }
        }
        System.out.println("The maximum value is " + maxValue);
        System.out.println("The minimum value is " + minValue);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int dataPoints[])
    {
        double dataPointsSum = 0;
        double dataPointsAverage = 0;
        for(int i = 0; i < dataPoints.length; i++){
            dataPointsSum = dataPointsSum + dataPoints[i];
        }
        dataPointsAverage = dataPointsSum / dataPoints.length;
        return dataPointsAverage;
    }

}
