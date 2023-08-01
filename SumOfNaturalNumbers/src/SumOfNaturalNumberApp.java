import java.util.Scanner;

public class SumOfNaturalNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter range:");
		int num = scan.nextInt();
		System.out.println(SumOfNaturalNumber.sum(num));
scan.close();
	}

}
