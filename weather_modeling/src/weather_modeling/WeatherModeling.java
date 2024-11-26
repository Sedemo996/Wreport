package weather_modeling;

public class WeatherModeling {

	public static void main(String[] args) {
		// Quadratic equation ax^2 + bx + c = 0
        double a = 1.0, b = -7.0, c = 12.0;

        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are: " + root1 + " and " + root2);
        } else {
            System.out.println("No real roots.");
        }
	}

}
