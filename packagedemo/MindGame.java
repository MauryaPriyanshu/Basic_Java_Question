package game.mind;

import numbers.game.NumberGame;

public class MindGame{
	
	public static void main(String[] mnd){
		NumberGame games = new NumberGame();
		int num = 123;
		boolean isPrime = games.checkPrime(num);
		
		System.out.println(num + " isPrime - " + isPrime);
		
		
		boolean Even = games.isEven(num);
		System.out.println(num + " isEven - " + isPrime);
		
		int MaxNumber = games.maxNumber(num);
		System.out.println(num + "is MaxNumber - " + isPrime);
		
	}
}