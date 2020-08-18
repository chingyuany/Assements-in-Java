package assessment;
import java.util.*;
public class Lab3_sorting {

	public static void main(String[] args)
	{
		int [] size = {1000,2000,4000,8000,16000,32000,64000};
		ArrayList<Double> record = new ArrayList<Double>();
		System.out.println("Benchemark Time unit: ms");
		System.out.println("Size     Selection Sort      Bubble Sort      Insertion Sort  ArraysSort");
		for(int N : size)
		{
			record.clear();
		System.out.print( N+"\t");
		
		int [] list = new int [N] ;
		for (int i = 0; i < list.length; i++)
		{
			list[i] = i;
		}
		 for (int index = 0 ; index < list.length -1; index++)
			{
		    	int  j  =  (int)  (Math.random() * (N - index))  +  index;
		    	int k = list[index];
		    	list[index] = list[j];
		    	list[j] = k ;
			}
		 /*
		 for (int i : list)
		  	    System.out.printf("%3d, ",i);
		  	     System.out.println();
		 System.out.println("================================");
		 System.out.println("Selection Sort");
		  */
		
		 int [] selection = new int[list.length];
		 for (int i = 0; i <list.length;i++)
			 {selection[i] = list[i];}
		 /*
		 for (int i : selection)
		  	    System.out.printf("%3d, ",i);
		 */
		 double start = System.nanoTime();
		 for(int i = 0; i < selection.length; i++)
			 {int k = i;
			 for(int j = i+1; j < selection.length;j++)
			 {
				 if(selection[j] < selection[k])
				 {
					 k = j;
				 }
			 }
		    
			 swap(selection, k,i);
		}
		 double end = System.nanoTime();
		 double period = (end - start )  / 1000000;
	
		 //System.out.println("start time = "+start+ " end time is "+ end);
		// System.out.printf("period = %4.3f ", period);
	
		 record.add(period);
		 /*
		for (int l : selection)
		{System.out.print(l);}
		 System.out.println();
		  System.out.println("================================");
		 System.out.println("Bubble Sort");
		 */
		
		 int [] Bubble = new int[list.length];
		 for (int i = 0; i <list.length;i++)
			 {Bubble[i] = list[i];}
		 /*  
		 for (int i : Bubble)
		  	    {System.out.printf("%3d, ",i);}
			 System.out.println();
			 */
		 start = System.nanoTime();
		 for(int i = Bubble.length -1; i >0; --i)
			 {
			 for(int j = 0; j < i; ++j)
			 {
				 if(Bubble[j] > Bubble[j+1])
				 {
					 swap(Bubble,j,j+1);
				 }
			
			 }
			 }
		 end = System.nanoTime();
		 period = (end - start )  / 1000000;
		 record.add(period);
	       /*
			for (int l : Bubble)
			{System.out.print(l);}
			 System.out.println();
			  System.out.println("================================");
			 System.out.println("Insertion Sort");

				*/
			
			 int [] Insertion = new int[list.length];
		     System.arraycopy(list,0,Insertion,0, Insertion.length);
		     /*
		     for (int i : Insertion)
		     { System.out.printf("%3d, ",i);}
		     */
		     start = System.nanoTime();
		     int temp, j ;
		    
		     for (int i = 1; i < Insertion.length; ++i)
		     {
		    	  temp = Insertion[i];
		    	 
		    	 for ( j = i - 1; j >= 0 && Insertion[j] > temp; --j)
		    	  {Insertion[j + 1] = Insertion[j]; 
		    	   }
		    	 Insertion[j + 1] = temp;
		     }
		     end = System.nanoTime();
			 period = (end - start )  / 1000000;
			 record.add(period);
		/*
		 * for (int l : Insertion) {System.out.print(l);} System.out.println();
		 * 	 System.out.println("================================");
	System.out.println("Array Sort");	
		 */
 
	 int [] Arraysort = new int[list.length];
     System.arraycopy(list,0,Arraysort,0, list.length);
		/*
		 * for (int i : Arraysort) { System.out.printf("%3d, ",i);}
		 */
     start = System.nanoTime();
     Arrays.sort(Arraysort);
     end = System.nanoTime();
	 period = (end - start )  / 1000000;
	 record.add(period);
		/*
		 * System.out.println();
		 * for (int l : Arraysort) {System.out.print(l);}
		 */
	 for(double g : record)
	 {
		 System.out.printf("%13.3f \t", g);
	 }
	 System.out.println();
		}
	
	}
	public static void swap(int[] array, int a, int b) 
	{
		int temp = array[a];
		array[a] = array[b];
		array[b] =temp;
	}
}
