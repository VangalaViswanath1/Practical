

class Pyramid{
	public static void main(String args[])
	{
		for(int i=1; i<=4; i++)			//for loop here
		{
			for(int j=4; j>=i; j--)	          // using nested for loophere
			{
				System.out.print(" "); //printing space here
			}
			for(int k=1; k<=i; k++)	//using onemore inner forloop
			{
				System.out.print(" *");	//printing *
			}
			System.out.println();		
		}
	}
}

