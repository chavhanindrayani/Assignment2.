import java.util.*;
class calculator
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);

        int n1=0;
        int n2=0;
        char operator;


		System.out.println("Enter the n1 := ");
		n1 = sc.nextInt();
		System.out.println("Enter the n2 := ");
		n2 = sc.nextInt();
		System.out.println("What is Operation ?");
		operator=sc.next().charAt(0);
        switch(operator)
        {
			case'+':
			        System.out.println(n1+2);
			        break;
			case'-':
			        System.out.println(n1-2);
			        break;
			case'*':
			        System.out.println(n1*2);
			        break;
			case'/':
			        System.out.println(n1/2);
			        break;
		}

	}
}