package assessment;
import java.util.*;

public class lab2_friendgroup {
	public static void main(String[] args) {
	
		System.out.println("please input how many people");
	Scanner input = new Scanner(System.in);
	int N = input.nextInt();
	input.close();
	int [] relationship = new int [N] ;
	int [] finded = new int[N];
	for (int i = 0; i < relationship.length; i++)
	{
		relationship[i] = i;
	}
    for (int index = 0 ; index < relationship.length -1; index++)
	{
    	int  j  =  (int)  (Math.random() * (N - index))  +  index;
    	int k = relationship[index];
    	relationship[index] = relationship[j];
    	relationship[j] = k ;
	}
    for (int i = 0 ; i < N; i++)
    System.out.printf("%3d, ",i);
  	System.out.println();
  	 for (int i : relationship)
  	    System.out.printf("%3d, ",i);
 	System.out.println();
  	System.out.println("================================");
  	
  	 ArrayList<Integer> group = new ArrayList<Integer>();
  	 int count = 0;
    for(int person = 0; person < N ; person++)
    {
    	  
        group.clear();
        if(finded[person] != 1)
        {
        
        group.add(person);
        finded[person] = 1;
        Integer friend = relationship[person];
       
    	while(friend != person)
    	{
    		
    	    group.add(friend);
    	    finded[friend] = 1;
    	    friend = relationship[friend];
    		       	
    	}
    	
    	System.out.print("Group "+count+": "+ group);
   	    System.out.println();
   	    count++;
        }
        
    }
    System.out.println("group number = "+ count);
  
}
}