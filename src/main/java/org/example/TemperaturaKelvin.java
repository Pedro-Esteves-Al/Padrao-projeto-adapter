package org.example;

public class TemperaturaKelvin implements ITemperatura {
    private double grausKelvin;

    @Override
    public double getTemperatura() {
        return grausKelvin;
    }

    @Override
    public void setTemperatura(double temperatura) {
        this.grausKelvin = temperatura;
    }
}
