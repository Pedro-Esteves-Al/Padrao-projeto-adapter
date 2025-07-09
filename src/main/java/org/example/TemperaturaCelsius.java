package org.example;

public class TemperaturaCelsius implements ITemperatura{
    private double grausCelcius;


    public double getTemperatura() {
        return grausCelcius;
    }

    public void setTemperatura(double temperatura) {
        this.grausCelcius = temperatura;
    }
}
