package temperatureConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class temperatureConverterTest {
	
	@Test
	public void absoluteZeroTest() {
		assertEquals("-273.15°C", TemperatureConverter.toCelcius(-459.67));
		assertEquals("-459.67°F", TemperatureConverter.toFahrenheit(-273.15));
	}
	
	@Test
	public void parityTest() {
		assertEquals("-40°C", TemperatureConverter.toCelcius(-40));
		assertEquals("-40°F", TemperatureConverter.toFahrenheit(-40));
	}
	
	@Test
	public void zeroTest() {
		assertEquals("-17.78°C", TemperatureConverter.toCelcius(0));
		assertEquals("0°F", TemperatureConverter.toFahrenheit(-17.78));
	}
	
	@Test
	public void freezingPointTest() {
		assertEquals("0°C", TemperatureConverter.toCelcius(32));
		assertEquals("32°F", TemperatureConverter.toFahrenheit(0));
	}
	
	@Test
	public void bodyTemperatureTest() {
		assertEquals("37°C", TemperatureConverter.toCelcius(98.6));
		assertEquals("98.6°F", TemperatureConverter.toFahrenheit(37));
	}
	
	@Test
	public void boilingPointTest() {
		assertEquals("100°C", TemperatureConverter.toCelcius(212));
		assertEquals("212°F", TemperatureConverter.toFahrenheit(100));
	}
	
	@Test
	public void randomTest() {
		assertEquals("-30°C", TemperatureConverter.toCelcius(-22));
		assertEquals("-22°F", TemperatureConverter.toFahrenheit(-30));
	}
	
	@Test
	public void randomTest2() {
		assertEquals("70°C", TemperatureConverter.toCelcius(158));
		assertEquals("158°F", TemperatureConverter.toFahrenheit(70));
	}
	
	@Test
	public void randomTest3() {
		assertEquals("10°C", TemperatureConverter.toCelcius(50));
		assertEquals("50°F", TemperatureConverter.toFahrenheit(10));
	}

}
