package weather_modeling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherModeling {
    public static void main(String[] args) {
        double[][] inputs = {
            {1.0, -3.0, 2.0},
            {1.0, -2.0, 1.0},
            {1.0, 2.0, 5.0}
        };

        System.out.println("Multiple Sets of Inputs:");
        for (double[] set : inputs) {
            double a = set[0];
            double b = set[1];
            double c = set[2];
            solveQuadratic(a, b, c);
        }
    }
}