import java.util.Scanner;

class AverageOfThreeNumbers{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		//Input three numbers
		System.out.println("Enter three numbers on diffrent line");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		//Calculate Average
		double avg = (num1+num2+num3)/3;

		//Output
		System.out.println("Average of three numbers => "+avg);

	}

}