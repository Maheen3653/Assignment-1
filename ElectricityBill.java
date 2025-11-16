import java.util.*;
public class ElectricityBill{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int solarPrice = 7;
		int electricityPrice = 60;
		System.out.println("Enter the number of units consumed from solar energy: ");
		int solarUnits = input.nextInt();
		System.out.println("Enter the number of units consumed from electricity company: ");
		int electricityUnits = input.nextInt();

		double total_solarBill = solarUnits * solarPrice;
		System.out.println("Bill from solar energy is: " + total_solarBill);
		double total_electricityBill = electricityUnits * electricityPrice;
		System.out.println("Bill from electricity company is: " + total_electricityBill);
		
		double totalBill = total_solarBill + total_electricityBill;
		System.out.println("Total bill is: " + totalBill);	
		
		double totalSavings = total_electricityBill - total_solarBill;
		System.out.println("Total savings by using solar power are: " + totalSavings);
		}
	}