import java.util.Scanner;
public class CarPooling{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Total miles driven per day: ");
		double miles = input.nextDouble();

		System.out.print("Cost per gallon of gasoline:$ ");
		double gasCost = input.nextDouble();

		System.out.print("Average miles per gallon: ");
		double mpg = input.nextDouble();

		System.out.print("Parking fees per day:$ ");
		double parking = input.nextDouble();

		System.out.print("Tolls per day:$ ");
		double tolls = input.nextDouble();

		double fuelCost = (miles / mpg) * gasCost;
		double totalCost = fuelCost + parking + tolls;

		System.out.print("Total driving cost per day:$ " + totalCost);
		}
	}

		
