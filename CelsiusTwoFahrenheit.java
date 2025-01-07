import java.util.Scanner;

class CelsiusTwoFahrenheit{

	public static void main(String args[]){

		System.out.println("Enter value in Celsius");
		
		Scanner sc = new Scanner(System.in);

		//input in Celsius
		double celsius = sc.nextDouble();

		//convert Celsius to farenheit
		double fahrenheit = (celsius*(9/5)+32);

		//Output in Fahrenheit
		System.out.print(fahrenheit);

	}

}