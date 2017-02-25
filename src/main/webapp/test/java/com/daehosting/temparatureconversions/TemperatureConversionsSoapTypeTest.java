package com.daehosting.temparatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Punitha Anandan on 2/24/2017.
 */
public class TemperatureConversionsSoapTypeTest {
    @Test
    public void celsiusToFahrenheit() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The celsius To Fahrenheit conversion failed",celsiusToFahrenheitResult, BigDecimal.valueOf(32) );
    }

    @Test
    public void fahrenheitToCelsius() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitTocelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(0.0));
        assertEquals("The celsius To Fahrenheit conversion failed",fahrenheitTocelsiusResult, BigDecimal.valueOf(-17.77777775) );
    }

    @Test
    public void windChillInCelsius() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInCelsius = service.windChillInCelsius(BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.4));
        assertEquals("The celsius To Fahrenheit conversion failed",windChillInCelsius, BigDecimal.valueOf(0.947184) );
    }

}