import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A number:");
		int n = scan.nextInt();
		int originalNo= n;
		Palindrome palindrome = new Palindrome();
		System.out.println("REVERSE OF NUMBER "+n+" is "+palindrome.findReverse(n));

	}

}
