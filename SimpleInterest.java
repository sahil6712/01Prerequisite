import java.util.Scanner;

class SimpleInterest{

	public static void main(String args[]){

		Scanner sc  = new Scanner(System.in);

		//input principal, Rate and Time
		System.out.println("Enter principal");
		int principal = sc.nextInt();

		System.out.println("Enter Rate");
		double rate = sc.nextDouble();

		System.out.println("Enter Time in Years");
		double time = sc.nextDouble();

		//Calculate simple interest
		int si = (int) (principal*rate*time)/100;
		
		//output
		System.out.print("Simple Interest is => ");
		System.out.println(si);

	}

}