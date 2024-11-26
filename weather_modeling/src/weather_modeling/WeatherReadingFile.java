package weather_modeling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherReadingFile {

	public static void main(String[] args) {
		 try {
	            File file = new File("input.txt");
	            Scanner scanner = new Scanner(file);

	            double a = scanner.nextDouble();
	            double b = scanner.nextDouble();
	            double c = scanner.nextDouble();

	            double discriminant = b * b - 4 * a * c;

	            if (discriminant >= 0) {
	                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	                System.out.println("Roots are: " + root1 + " and " + root2);
	            } else {
	                System.out.println("No real roots.");
	            }

	            scanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found.");
	        }

	}

}
