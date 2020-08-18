package assessment;

import java.util.Scanner;

public class lab4 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入底數");
		double x = input.nextDouble();
		System.out.println("請輸入指數");
		int n = input.nextInt();
		input.close();
	double result = pow(x,n);
	System.out.println(result);
	}
	public static double pow(double x, int n)
	{
		if (n == 0)
			return 1;
		int a = n/2;
		double temp = pow(x, a);
		int r = n % 2;
		if (r == 1)
			return x* temp * temp;
		else
			return temp * temp;
		
		
	}

}
