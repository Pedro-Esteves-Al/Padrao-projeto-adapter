package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SensorTest {
    @Test
    void deveRetornarTemperaturaEmKelvin() {
        Sensor sensor = new Sensor();
        sensor.setTemperatura(0);

        assertEquals(0, sensor.getTemperaturaEmKelvin());
    }
    @Test
    void deveRetornarTemperaturaEmCelsius() {
        Sensor sensor = new Sensor();
        sensor.setTemperatura(0);

        assertEquals(-273, sensor.getTemperaturaEmCelcius());
    }

}