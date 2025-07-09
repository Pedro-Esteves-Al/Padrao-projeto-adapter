package org.example;

public class TemperaturaAdapter extends TemperaturaCelsius {
    private ITemperatura temperaturaKelvin;

    public TemperaturaAdapter(ITemperatura temperaturaKelvin) {
        this.temperaturaKelvin = temperaturaKelvin;
    }

    public double recuperarTemperaturaEmKelvin() {
        temperaturaKelvin.setTemperatura(this.getTemperatura()+273);
        return temperaturaKelvin.getTemperatura();
    }
    public void salvarTemperatura() {
        this.setTemperatura(temperaturaKelvin.getTemperatura()-273);
    }
}
