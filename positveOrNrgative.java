import java.util.*;
class positveOrNrgative
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int positive=0;
		int negative=0;
		int zero=0;
		System.out.println("Enter the number :- ");
		int number=sc.nextInt();
		if(number > 0)
		{
			positive++;
			System.out.println("this is positive number :- ");
		}
		else if (number < 0)
		{
			negative++;
			System.out.println("this is negative number:- ");
		}
		else
		{
			zero++;
			System.out.println("this is zero:- ");
		}
	}
}