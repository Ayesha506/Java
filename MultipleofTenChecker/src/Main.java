import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		checkMultipleOfTen(num1,num2);
		
		scan.close();
		

	}
	
	public static void checkMultipleOfTen(int num1, int num2)

	{
		if(num1%num2==0)
			System.out.println("The number "+num1+" is a multiple of "+num2);
		else
			System.out.println("The number is "+num1+" NOT multiple of "+num2);
			

	}

}
