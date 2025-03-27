import java.util.*;
class leapYear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Year := ");
		int year = sc.nextInt();
		if(year % 4 == 0)
		{
            System.out.println(" this is Leap year.");
		}
		else
		{
			System.out.println(" this is not Leap year.");
		}
	}
}