public class BMI{
	public static void main(String [] args){
		System.out.println("Sara's weight is 62 kg");
		System.out.println("Sara's height is 1.68 meters");

		double weight = 62;
		double height = 1.68;
		
		double bmi = weight / (height * height);
		System.out.printf("Sara's BMI is:%.2f%n " , bmi);
		}
	}