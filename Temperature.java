public class Temperature{
	public static void main (String [] args){
		int Celsius = 32;
		double Fahrenheit = (9 / 5 * Celsius) + 32;
		System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);

		double kelvin = Celsius + 273.15;
		System.out.println("Temperature in kelvin is: " + kelvin);
		}
	}