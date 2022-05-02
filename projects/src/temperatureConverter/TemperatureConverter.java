package temperatureConverter;

public class TemperatureConverter {
	public static final String toCelcius(double tempFahrenheit) {

		double tempInCelcius = (tempFahrenheit - 32) * ((double) 5 / 9);
		String twoDeci = String.format("%.2f", tempInCelcius);
		tempInCelcius = Double.parseDouble(twoDeci);
		String output; 
		if (tempInCelcius % 1 == 0) { 
			output = Integer.toString((int) tempInCelcius) + "°C";
		} else {
			output = Double.toString(tempInCelcius) + "°C";
		}
		
		System.out.println(output);
		return output;
	}

	public static final String toFahrenheit(double celcius) {

		double tempInFahrenheit = ((celcius * 1.8) + 32);  
		String twoDeci = String.format("%.2f", tempInFahrenheit);
		tempInFahrenheit = Double.parseDouble(twoDeci);
		
		String output;
		if(tempInFahrenheit % 1 == 0) {
			output = Integer.toString((int) tempInFahrenheit) + "°F";
		} else {
			output = Double.toString(tempInFahrenheit) + "°F";
		}
		
		System.out.println(output);
		return output;
	}
}
