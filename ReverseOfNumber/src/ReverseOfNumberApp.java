import java.util.Scanner;

public class ReverseOfNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A number:");
		int n = scan.nextInt();
		ReverseNumber reverseNumber = new ReverseNumber();
		System.out.println("REVERSE OF NUMBER "+n+" is "+reverseNumber.findReverse(n));
		
		scan.close();

	}

}
