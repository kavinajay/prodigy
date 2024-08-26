package pat;
import java.util.Random;
import java.util.*;
public class guess {

	public static void main(String[] args) {
		Random a=new Random();
		Scanner sc=new Scanner(System.in);
		int b=a.nextInt(10);
		int c,at=0;
		System.out.println("Guess the number from 0 to 10:");
		c=sc.nextInt();
		do {
			if(c==b) {
				at++;
				System.out.println("you find it..!");
				break;
			}
			else {
				at++;
				if(c>b) {
					System.out.println("that's was bigger, try again");
					c=sc.nextInt();

				}
				else {
					System.out.println("that's was smaller, try again");
					c=sc.nextInt();

				}
			}
		}while(true);
		System.out.println("Attempt you made to find:"+at);
	}

}
