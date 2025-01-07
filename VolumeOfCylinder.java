import java.util.Scanner;

class VolumeOfCylinder{

	public static void main(String args[]){

		System.out.println("Enter Radius of a Cylinder");
		
		Scanner sc = new Scanner(System.in);

		//input for radius
		double rad = sc.nextDouble();
		

		System.out.println("Enter Height of a Cylinder");	

		//imput for height
		double height = sc.nextDouble();

		//Calculate volume of a Cylinder
		double volume = Math.PI * Math.pow(rad,2) * height;

		//Output area
		System.out.print("Volume of Cylinder is => ");
		System.out.println(volume);

	}

}