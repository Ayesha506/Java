import java.util.Scanner;

public class SquareNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number to be squared:");
		int num = scan.nextInt();
		System.out.println(SquareNumber.squareNumber(num));
      scan.close();
	}

}
