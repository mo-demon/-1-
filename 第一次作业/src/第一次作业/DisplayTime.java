package 第一次作业;
import java.util.Scanner;
public class DisplayTime {
	public static void main(String[] ages) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + " second is " + minutes + 
				" minutes and " + remainingSeconds + " seconds");
	}

}
