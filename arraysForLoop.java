import java.util.*;
public class p
	{
		public static void main(String [] args)
			{
				int abc = 0;
				Scanner keyboard = new Scanner(System.in);
				int[] x = new int[5];

				for(int y = 1; y < 6; y++)
					{
						System.out.println("Type a number here: ");
						x[y-1] = keyboard.nextInt();
					}
				for(int a = 1; a < 6; a++)
					{
						System.out.println(x[a-1]);
						abc = abc + x[a-1];
					}
					System.out.println("Your total is: ");
					System.out.println(abc);
			}
	}