import java.util.Scanner;
public class ReverseDigit {
	 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);

         System.out.print("Enter a five-digit number: ");
         int number = input.nextInt();

         int d1 = number / 10000;              
         int d2 = (number / 1000) % 10;        
         int d3 = (number / 100) % 10;         
         int d4 = (number / 10) % 10;          
         int d5 = number % 10;                 

         System.out.println("The reverse order number: " + d5 + " " + d4 + " " + d3 + " " + d2 + " " + d1);
	}
}
