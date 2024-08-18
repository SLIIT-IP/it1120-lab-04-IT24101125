import java.util.Scanner;
public class IT24101125Lab4Q3
{
	public static void main(String[] args)
	{		
	Scanner values=new Scanner(System.in);
	int number;
	String result;

	System.out.print("Enter a number :");
	number=values.nextInt();

	result=(number > 0) ? "Positive":
		(number < 0) ? "Negative":
		"the number is Zero";

	System.out.print(result);
	}
 }