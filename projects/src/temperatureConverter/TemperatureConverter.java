package temperatureConverter;

public class TemperatureConverter {
	public static final void toCelcius(int tempFahrenheit) {

		int tempInCelcius = (int) ((tempFahrenheit - 32) * 0.5556);
		System.out.println(tempInCelcius + "°C");
	}

	public static final void toFahrenheit(int celcius) {

		int tempInFahrenheit = (int) ((celcius * 1.8) + 32);  
		System.out.println(tempInFahrenheit + "°F");
	}
}
