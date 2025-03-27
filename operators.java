import java.util.*;
class operators
{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("Enter the no.");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.println("add"+(a+b));
		System.out.println("sub"+(a-b));
		System.out.println("mul"+(a*b));
		System.out.println("divide"+(a/b));
		System.out.println("remainder"+(a%b));
		System.out.println("lessthan"+(a<b));
		System.out.println("greaterthan"+(a>b));
		System.out.println("lessthan equal to " +(a<=b));
		System.out.println("greatethan equal to " +(a>=b));
		}
}