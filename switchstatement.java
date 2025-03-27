import java.util.*;
class switchstatement
{
	public static void main(String args[])
	{
		Scanner r = new Scanner(System.in);

		System.out.println("Enetr the days");
		int days = r.nextInt();

		switch(days)
		{
		case 1:
		       System.out.println("Monday");
		       break;
        case 2:
               System.out.println("Tuseday");
		       break;
		case 3:
		       System.out.println("Wednsday");
		       break;
		case 4:
		       System.out.println("Thursday");
		       break;
		case 5:
		       System.out.println("Friday");
		       break;
		case 6:
		       System.out.println("Saturday");
		       break;
		case 7:
		       System.out.println("Sunday");
		       break;
		default:
		       System.out.println("Invalid");
		       break;
	    }
	}
}
