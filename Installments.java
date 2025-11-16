public class Installments{
	public static void main(String [] args){
		double loan = 1200000;
		System.out.println("Loan amount is: " + loan);

		double interestRate = 0.12;
		System.out.println("Interest rate  is: " + interestRate);

		int years = 5;
		int months = years * 12;
		System.out.println("Total months are: " + months);

		double monthlyInterestRate = interestRate / 12;
		System.out.println("Monthly interest rate is: " + monthlyInterestRate);

		double monthlyInstallment = (loan * monthlyInterestRate) / (1- Math.pow(1 + monthlyInterestRate, -months));
		System.out.printf("Monthly installment is:%.2f%n " , monthlyInstallment);
		}
	}
		
		