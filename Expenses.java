public class Expenses{
	public static void main(String [] args){
		int monthlyPay  = 50000;
		int monthlyExpense = 37500;
		int laptopPrice = 100000;
		int monthlySavings = monthlyPay - monthlyExpense;
		System.out.println("Monthly savings are:" + monthlySavings);

		int months = laptopPrice / monthlySavings;
		System.out.println("Months required to dave money to buy laptop: " + months);
		}
	}