


public class AmStrong{
	public static void main(String[] args){

	int n = 143;
	int temp = n;
	int r, sum = 0;

	while(n>0){
		r = n%10;
		n = n/10;
		sum = sum +  r*r*r;
	}
	if(temp == sum)
		System.out.print("it's an Amstrong number");
	else
		System.out.print("It's not an amstrong number");
}
}