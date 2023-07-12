
public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subRes = subtractNumbers(20, 5);

		int mulRes = multiplyNumbers(4, 5);

		double divRes = divideNumbers(20, 4);

		int remRes = findRemainder(10, 3);
		System.out.println(subRes);
		System.out.println(mulRes);
		System.out.printf("%.2f\n",divRes);
		System.out.println(remRes);

	}
	public static int subtractNumbers(int num1, int num2)
	{
		return num1-num2;
	}

	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}

	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}

	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}

}
