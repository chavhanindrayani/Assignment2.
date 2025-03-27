import java.util.*;
class inputThreeNo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number :- ");
        int number1=sc.nextInt();
        System.out.print("Enter the second number :- ");
	    int number2=sc.nextInt();
        System.out.print("Enter the thrid number :- ");
        int number3=sc.nextInt();

	if(number1>number2 && number1>number3)
	{
		System.out.println("the number1 is largest :- ");
	}
    else if(number2>number1 && number2>number3)
	{
		System.out.println("the number2 is largest :- ");
	}
	else
	{
		System.out.println("the number3 is largest :- ");
	}
}
}
