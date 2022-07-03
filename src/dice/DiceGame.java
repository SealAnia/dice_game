package dice;

public class DiceGame {
	
	Player one;
	Player two;
	
	public void startGame() {
		one = new Player();
		two = new Player();
		
		int result1 = 0;
		int result2 = 0;
		
		int sum1 = 0;
		int sum2 = 0;
		
		int attempt = 0;
		
		while(attempt < 3) {
			attempt++;
			one.roll();
			two.roll();
			
			result1 = one.num;
			System.out.println("Player's one result is: " + result1);
			
			result2 = two.num;
			System.out.println("Player's two result is: " + result2);
			
			sum1 = sum1 = result1;
			sum2 = sum2 + result2;
		}
		
		System.out.println("Player's one sum is: " + sum1);
		System.out.println("Player's two result is: " + sum2);
		
		if(sum1 > sum2) {
			System.out.println("Player one wins!");
		} else if (sum2 > sum1) {
			System.out.println("Player two wins!");
		} else if (sum1 == sum2) {
			System.out.println("Draw!");
		}
	}

}
