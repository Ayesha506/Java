import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Product Code:");
		String productCode = scan.next();
		getProduct(productCode);
		
		scan.close();

	}
	
	public static void getProduct(String productCode)

	{
		switch(productCode)
		{
		case "p01":System.out.println("COCO COLA");
		break;
		case "p02":System.out.println("SPRITE");
		break;
		case "p03":System.out.println("MIRINDA");
		break;
		case "p04":System.out.println("FANTA");
		break;
		case "p05":System.out.println("CHARGED");
		break;
		default:System.out.println("BINDU.....");
		}
	}

}
