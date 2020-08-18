
import java.util.Scanner;
public class lab01 {

	public static void main(String[] args) {
		int secretno = (int)(Math.random() * 100 );
//		int secretno = 42;
		System.out.println("Please input an integer in (0 , 99) " + secretno);
		Scanner input = new Scanner(System.in);
		int g = input.nextInt();
		int max = 99;
		int min = 0;
	
		while ( g != secretno)
		{
			if (g > max || g < min)
			{
				System.out.println("Please input in correct range ("+min+" , "+max+") ");
				g = input.nextInt();
			}
			else if(g > secretno)
			{
				System.out.println("Too large");
				if( g == secretno + 1 && min == secretno)
				{
					System.out.println("GG");
					break;
				}
				else 
				{
			    max = g -1;
				System.out.println("("+min+" ," + max +") = ?");
				
				g = input.nextInt();
				}
			}
			else if (g < secretno)
			{
				System.out.println("Too small");
				if ( g == secretno -1 && max == secretno)
				{
					System.out.println("GG");
					break;
				}
				else
				{
				min = g + 1;
				System.out.println("("+ min + "," + max +") = ?");
				
				g = input.nextInt();
				}
			}
		}
	
		if( g == secretno)
			{System.out.println("you win!");}
		
		input.close();

	}

}
