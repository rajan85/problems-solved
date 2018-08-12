package trials;

import java.util.Random;
import java.util.Scanner;

public class Craps4 {
	private static int totalNumOfWins;
	private static int totalNumOfLoses;
	private static int thePoint;
	
	public static void play()
	{
		int numOfWins=0;
		int numOfLoss=0;
		int comeOutRoll=0;
		
		
		
			for(int i=0;i<10000;i++)
			{
				comeOutRoll = throwTwoDies();
				String result = winOrLoss(comeOutRoll);
				if(result.equals("win"))
				{
					numOfWins++;
				}
				else if(result.equals("Loss"))
				{
					numOfLoss++;
				}
				else 
				{
					comeOutRoll = thePoint;
					result = keepRolling(thePoint);
					if(result.equals("seven"))
					{
						numOfLoss++;
					}
					else
					{
						numOfWins++;
					}
				}
			}
		
		
		totalNumOfWins = numOfWins;
		totalNumOfLoses = numOfLoss;
		
		description();
		
		
	}
	
	
	public static void description()
	{
		/*In the simulation we : 
			won 4905 times 
			lost 5095 times, 
			for a probability of 0.4905 
			Hit enter key to continue */
		System.out.println("In the simulation we :");
		System.out.println("won "+totalNumOfWins+" times");
		System.out.println("lost "+totalNumOfLoses+" times,");
		System.out.println("for a probability of "+winProbability());
	}
	
	
	public static String keepRolling(int point)
	{
		int throwsSum = throwTwoDies();
		if(throwsSum==7)
		{
			return "seven";
		}
		else if(throwsSum==point)
		{
			return "thePoint";
		}
		else
		{
			return keepRolling(point);
		}
	}
	
	
	public static double winProbability()
	{
		double total = (double)(totalNumOfWins+totalNumOfLoses);
		double totalw = (double)totalNumOfWins;
		System.out.println(total);
		
		return totalw/total;
	}
	
	
	public static String winOrLoss(int comeOutRoll)
	{
		if(comeOutRoll==7 || comeOutRoll==11)
			{
			return "win";
			}
		else if(comeOutRoll==2 || comeOutRoll==3 ||comeOutRoll==12)
			{
			return "Loss";
			}
		else 
		{
			thePoint = comeOutRoll;
			return "the point";
		}
	}
	
	//method returns single throw of dice
	public static int throwDie()
	{
		Random randonGenerator = new Random();
		int start = 1;
		int end = 6;
		long range = (long)end - (long)start +(long)1;
		long fraction = (long)(range*randonGenerator.nextDouble());
		return (int)(fraction+start);
	}
	
	//method returns sum to two throws of dice
	public static int throwTwoDies()
	{
		int firstThrow = throwDie();
		int secondThrow = throwDie();
		int sum = firstThrow+secondThrow;
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Let’s start playing");
		String userSays;
		Scanner scanner = new Scanner(System.in);
		boolean playAgain=true;
		do
		{
			play();
			System.out.println("Hit enter key to continue\n");
			scanner.nextLine();
			System.out.println("Would you like to play another game yes/no?");
			userSays = scanner.next();
			while( !(userSays.equals("yes") || userSays.equals("no")) )
			{
				System.out.println("Would you like to play another game yes/no?");
				userSays = scanner.next();
			}
			if(userSays.equals("yes"))
			{
				continue;
			}
			else if(userSays.equals("no"))
			{
				playAgain=false;
			}
		}
		while(playAgain);
		System.out.println("Have a nice day. GoodBye");
		scanner.close();
	}
	
	
	
	
	
	
	
	
	

}
