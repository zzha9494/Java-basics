package W4;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Statistics {

    // Returns the mean of the given data set.
    public static double mean(ArrayList<Double> numbers) {

        // TODO
        double mean = 0;
        for (double i: numbers)
            mean += i;
        mean /= numbers.size();
        return mean;
    }

    // Returns the variance of the given data set.
    public static double variance(ArrayList<Double> numbers, double mean) {

        // TODO
        double variance = 0;
        for (double i: numbers)
            variance += (i - mean) * (i - mean);
        variance /= numbers.size();
        return variance;
    }

    // Returns the standard deviation of the given data set.
    public static double sd(double variance) {

        // TODO
        return Math.sqrt(variance);
    }

    public static void main(String[] args) {

        // TODO
        ArrayList<Double> numbers = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter data set:");
        while (scan.hasNextDouble())
            numbers.add(scan.nextDouble());

        if (numbers.size() == 0) {
            System.out.println("\nNo data!");
            return;
        }

        double mean = mean(numbers);
        double variance = variance(numbers, mean);
        double sd = sd(variance);
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println("\nMean = " + df.format(mean));
        System.out.println("Variance = " + df.format(variance));
        System.out.println("Standard deviation = " + df.format(sd));
    }
}