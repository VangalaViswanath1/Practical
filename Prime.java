import java.util.Scanner;
public class Prime{
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		for(int i=1; i<=a; i++)
		{
			if(a%i==0)
			{
			count++;
			}
		}
		if(count ==2)
			System.out.print("Prime Number");
		else
			System.out.print("Prime Not Number");	
		

	}
}