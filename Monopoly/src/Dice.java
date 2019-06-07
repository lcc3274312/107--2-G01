import java.util.Random;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int num;
		
		num = rand.nextInt(9)+1;
		System.out.printf("%d",num);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++) {
			Dice dice = new Dice();
		}
		
		
		
	}
}
