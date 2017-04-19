import java.util.Scanner;
public class javagit
{
	private int cat;
	private int dog;
	public javagit()
	{
		cat = 0;
		dog = 0;
	}
	
	public javagit(int first, int second)
	{
		cat = first;
		dog = second;
	}

	public void printSomeStuff()
	{
		for (int i = 0; i < cat; i++)
		{
			for (int j = 0; j < dog; j++)
			{
				System.out.println("ONE A PENNY TWO A PENNY: " + (i * j) + " STOP");
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Hi");
		System.out.println("Enter numbers: ");
		Scanner sc = new Scanner(System.in);
		int red = sc.nextInt();
		int blue = sc.nextInt();
		javagit j = new javagit(red, blue);
		j.printSomeStuff();

	}
}
