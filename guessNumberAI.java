package assessment;


public class lab01_11 {
   
	public static void main(String[] args) {
		int runtime = 10000;
		int win = 0;
		int lose = 0;
		
		for (int i = 1; i <= runtime; i++)
	{
		int secretno = (int)(Math.random() * 100 );
		

//		System.out.println("Please input an integer in (0 , 99), Ans is " + secretno);
		int g = (int)(Math.random() * 100 );
//		System.out.println("AI guess "+ g);
		
		int max = 99;
		int min = 0;
		
		while ( g != secretno)
		{
			
			if(g > secretno)
			{
//				System.out.println("Too large");
				if( g == secretno + 1 && min == secretno)
				{
//					System.out.println("AI GG");
					lose += 1;
					break;
				}
				else 
				{
					max = g -1;
//				System.out.println("("+min+" ," + max +") = ?");
				
				g = (int)(Math.random() * ( max-min +1) +min );
//				System.out.println("AI guess "+ g);
				}
			}
			else if (g < secretno)
			{
//				System.out.println("Too small");
				if ( g == secretno -1 && max == secretno)
				{
//					System.out.println("GG");
					lose += 1;
					break;
				}
				else
				{
					 min = g +1;
//				System.out.println("("+ min + "," + max +") = ?");
				g = (int)(Math.random() * ( max-min + 1) +min );
//				System.out.println("AI guess "+ g);
				}
			}
		}
		
		if( g == secretno)
		
			{
//			System.out.println("AI win!");
			win +=1;
			}
	
		
	}
		double winningraterand =  ((double) win/runtime) * 100 ;
		System.out.println("During "+runtime +" times, Random AI won " +win +" times, and lose " +lose+ " times");
		System.out.printf("Random AI's wining rate is %3.2f percentage \n", winningraterand);
		
	    win = 0;
	    lose =0;
		for (int i = 1; i <= runtime; i++)
		{
			int secretno = (int)(Math.random() * 100 );
			

//			System.out.println("Please input an integer in (0 , 99), Ans is " + secretno);
			int g = 50;
//			System.out.println("AI guess "+ g);
			
			int max = 99;
			int min = 0;
			
			while ( g != secretno)
			{
				
				if(g > secretno)
				{
//					System.out.println("Too large");
					if( g == secretno + 1 && min == secretno)
					{
//						System.out.println("AI GG");
						lose += 1;
						break;
					}
					else 
					{
						max = g -1;
//					System.out.println("("+min+" ," + max +") = ?");
					g = (max - min)/2 +min;
				
//					System.out.println("AI guess "+ g);
					}
				}
				else if (g < secretno)
				{
//					System.out.println("Too small");
					if ( g == secretno -1 && max == secretno)
					{
//						System.out.println("GG");
						lose += 1;
						break;
					}
					else
					{
						 min = g +1;
//					System.out.println("("+ min + "," + max +") = ?");
						 g = (max - min)/2 +min;
//					System.out.println("AI guess "+ g);
					}
				}
			}
			
			if( g == secretno)
			
				{
//				System.out.println("AI win!");
				win +=1;
				}
		
			
		}
			System.out.println("During "+runtime +" times, Binary AI won " +win +" times, and lose " +lose+ " times");
			System.out.printf("Binary AI's wining rate is %3.2f percentage", ((double) win/runtime) * 100 );
		}
	}
	
