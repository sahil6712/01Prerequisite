import java.util.Scanner;

class PowerCalculation{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		//Input Base and Exponentiation
		System.out.println("Enter Base");
		int base = sc.nextInt();

		System.out.println("Enter Exponentiation");
		int exponent = sc.nextInt();

		//Calculate power pow returns double
		int power = (int) Math.pow(base, exponent);

		//Output
		System.out.print(base+" raise to "+ exponent+" => "+power);

	}

}