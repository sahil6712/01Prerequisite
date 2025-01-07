import java.util.Scanner;

class AddTwoNumbers{

	public static void main(String args[]){

		//Scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers for addition");

		//input numbers
		int a = sc.nextInt();
		int b = sc.nextInt();

		//Final Output
		System.out.println(a+b);
	
	}

}