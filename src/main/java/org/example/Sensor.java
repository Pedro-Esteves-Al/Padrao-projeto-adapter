package org.example;

public class Sensor {
    ITemperatura temperatura;
    TemperaturaAdapter persistencia;

    public Sensor() {
        temperatura = new TemperaturaKelvin();
        persistencia = new TemperaturaAdapter(temperatura);
    }

    public void setTemperatura(double grausKelvin) {
        temperatura.setTemperatura(grausKelvin);
        persistencia.salvarTemperatura();
    }

    public double getTemperaturaEmKelvin() {
        return persistencia.recuperarTemperaturaEmKelvin();
    }

    public double getTemperaturaEmCelcius() {
        return persistencia.getTemperatura();
    }
}
