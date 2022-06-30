
import java.util.Scanner;
public class Factorial{
	public static void main(String[] args) {
		int fact = 1;
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		for(int i=1; i<=a; i++)
		{
			fact = fact*i;
		}
		System.out.print("Factorial " + fact);

	}
}