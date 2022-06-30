
class Year{
	public static void main(String args[])
	{
	int a = 2008;				
	if(a%400==0 && a%100==0 ||a%100!=0 && a%4==0 )		//Logic 
	{
		System.out.print("Leap year");			
	}
	else
	{
		System.out.print("it's not a leap year");
	}

	}
}