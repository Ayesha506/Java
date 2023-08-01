import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number Of Sides:");
		int sides = scan.nextInt();
		identifyPolygon(sides);
		
		scan.close();

	}
	public static void identifyPolygon(int sides)

	{
		switch(sides)
		{
		case 3:
			System.out.println("TRIANGLE");
			break;
		case 4:
			System.out.println("QUADRILATERAL");
			break;
		case 5:
			System.out.println("PENTAGON");
			break;
		case 6:
			System.out.println("HEXAGON");
			break;
		case 7:
			System.out.println("HEPTAGON");
			break;
		case 8:
			System.out.println("OCTAGON");
			break;
		case 9:
			System.out.println("NANOGON");
			break;
		case 10:
			System.out.println("DECAGON");
			break;
		default:
			System.out.println("No such Polygon exists with "+sides+" sides");
	
		}

	}

}
