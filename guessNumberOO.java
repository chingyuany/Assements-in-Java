package assessment;
import java.util.Scanner;
public class lab5_OO {

	public static void main(String[] args) {
		
		
		humanplayer a = new humanplayer();
		 goplay(a);
		 AIplayer b  = new AIplayer();
		 goplay(b);
	}
	public  static  void  goplay(Player  p) {
		
		
		p.play();
		
		}
}
class game
{
	//private int s = 42;
	 private int s = (int)(Math.random() * 100 );
	 private int upper = 99;
	 private int lower = 0;
	 private int g ;
	 
	 public void setguess(int g) {
			this.g = g;
		}
     public int getupper() {
			return this.upper;
		}
		
	 public int getlower() {
			return this.lower;
		}
	 public int gets()
	 {return this.s;}
	
public void run()
{
	
//System.out.println("secret no is " +s);
		
		if (g > upper || g < lower) {
			System.out.println("Out of range. Try again.");
			
		}
		
		if (g == s) {
			System.out.println("Bingo.");
			upper =99;
			lower = 0;
		} else if (g > s) {
			System.out.println("Too large.");
			upper = g - 1;
		} else {
			System.out.println("Too small.");
			lower = g + 1;
		}
		
		if (lower == upper) {
			System.out.println("GG.");
			upper =99;
			lower = 0;
		}

}
}

interface Player
{
	default void play() {System.out.println("(0, 99) = ?");}
	game game1 = new game();
	
}
class humanplayer implements Player
{
 void scanner()
 {
		Scanner input = new Scanner(System.in);
		
		
		while(true )
		{
		int g = input.nextInt();
		game1.setguess(g);
		game1.run();
		int lower = game1.getlower();
		int upper = game1.getupper();
		if (lower != upper && game1.gets()!= g)
		{		System.out.println("(" + lower + ", " 
                + upper + ") = ?");}
		else
			break;
		}
		
		input.close();
		
 }
 @Override
 public void play() {scanner();}
}


class AIplayer implements Player
{
	 void binary()
	 {
		
		 int g = 50;
		 while (true)
		 {
			 System.out.println("AI guess "+ g);
		 game1.setguess(g);
		 game1.run();
		int lower = game1.getlower();
		int upper = game1.getupper();
		if (lower != upper && game1.gets()!= g)
		{		System.out.println("(" + lower + ", " 
                + upper + ") = ?");}
		else
			break;
		g = (upper - lower)/2 +lower;;
		}
		
		
		 
	 }
	 
	 @Override
	 public void play() {binary();}
}