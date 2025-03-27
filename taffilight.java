import java.util.*;
class taffilight
{
	public static void main(String args[])
	{
		Scanner r = new Scanner(System.in);

        String colour="  ";
		System.out.println("Enetr the colours");
        colour=r.nextLine();

        switch(colour)
        {
			case "red":
		           System.out.println("stop");
		           break;
		    case "yellow":
		           System.out.println("get rady");
		           break;
		    case "green":
		           System.out.println("go");
		           break;
		}
    }
}