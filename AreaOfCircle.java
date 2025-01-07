import java.util.Scanner;

class AreaOfCircle{

	public static void main(String args[]){

		System.out.println("Enter Radius of a circle");
		
		Scanner sc = new Scanner(System.in);

		//input for radius
		double rad = sc.nextDouble();

		//Calculate area of a Circle
		double area = Math.PI * Math.pow(rad,2);

		//Output area
		System.out.print("Area of Circle is => ");
		System.out.println(area);

	}

}