import java.util.Scanner;

public class HalveTheNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		double num = scan.nextDouble();
		System.out.printf("%.2f",HalveTheNumber.halveTheNumber(num));
		
		scan.close();


	}

}
