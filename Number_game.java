package task1;
import java.util.*;
public class Number_game {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		boolean play=true;
		int Score =0;
		int rounds=0;
		while(play)
		{
			int max=5;
			int attempts=0;
			boolean find=false;
			System.out.println("~~~~~~~WELCOME TO PRO\'s GAME ARENA~~~~~~~");
			int n=r.nextInt(101);
			while(attempts<max && !find)
			{
				System.out.print("Enter Your Guess: ");
				int guess=s.nextInt();
				attempts++;
				if(guess<n)
					System.out.println("Your Guess is Too Low");
				else if(guess>n)
					System.out.println("Your Guess is Too high");
				else
				{
					System.out.println("Congratualtions! You Guessed right");
					Score++;
					find=true;
				}
			}
			if(!find)
			System.out.println("You are failed to Guess the number: "+n);
			rounds++;
			System.out.print("Do you want to Play Again: ");
			String ans=s.next().toLowerCase();
			if(ans.equals("yes"))
				play=true;
			else
				play=false;
		}
		System.out.println("------------------------------------");
		System.out.println(" TOTAL SCORE AFTER "+rounds+" ROUNDS ARE :"+Score);
		System.out.println("------------------------------------");
	}
}
