import java.util.Scanner;

class PerimeterOfRectangle{

	public static void main(String args[]){

		Scanner sc  = new Scanner(System.in);

		//input Lenght and width
		System.out.println("Enter Length");
		int length = sc.nextInt();

		System.out.println("Enter Width");
		int width = sc.nextInt();

		//Calculate Perimeter
		int perimeter = (length+width)*0b10;
		
		//output
		System.out.print("Perimeter of Rectangle is => ");
		System.out.println(perimeter);

	}

}