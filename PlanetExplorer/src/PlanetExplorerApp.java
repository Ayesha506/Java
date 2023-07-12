import java.util.Scanner;

public class PlanetExplorerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius of the sphere:");
		double radius = scan.nextDouble();
		
		PlanetExplorer explorer = new PlanetExplorer();

		System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
		
		scan.close();

	}

}
