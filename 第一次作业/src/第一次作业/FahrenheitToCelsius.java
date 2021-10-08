package 第一次作业;
import java.util.Scanner;
public class FahrenheitToCelsius {
	public static void main(String[] args ) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + 
		celsius + " in Celsius ");
		
	}

}
