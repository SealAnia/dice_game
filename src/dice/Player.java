package dice;

public class Player {
	
	int num;
	void roll() {
		num = (int)(Math.random() * 6 + 1);
		System.out.println(num);
	}

}
