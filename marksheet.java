import java.util.*;
class marksheet
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name := ");
		String name=sc.nextLine();
		System.out.println("Enter the marks := ");
		float marks=sc.nextFloat();

		if(marks >= 90)
		{
			System.out.println("your grade is A");
		}
	    else if(marks >=80)
		{
			System.out.println("your grade is B");
		}
		else if(marks >=70)
		{
			System.out.println("your grade is C");
		}
		else if(marks >=60)
		{
			System.out.println("your grade is D");
		}
		else
		{
			System.out.println("you are the Fail");
		}
	}
}