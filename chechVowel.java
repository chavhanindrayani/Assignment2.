//Write a Java program that accepts a character as input and
//checks whether it is a vowel (a, e, i, o, u) or a consonant using if-else.
import java.util.*;
class chechVowel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		char vowelcount=0;
		char consonantcount=0;

		System.out.println("Enter the character :- ");
		ch=sc.next().charAt(0);

        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
			System.out.println("vowel, ");
		}
		else
		{
			System.out.println("cansonant, " );
		}
	}
}