import java.util.Scanner;

class KilometreToMiles{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		//Input Kilometre numbers
		System.out.println("Enter distance in kilometre");
		int km = sc.nextInt();

		//Convert kilometer to miles
		double miles =  km*0.621371;

		//Output
		System.out.println("kilometer to miles conversion => "+miles);

	}

}