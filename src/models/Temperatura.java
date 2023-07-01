package models;

import javax.swing.*;

public class Temperatura {

    private double tempCelcius;
    private double tempFar;

    public Temperatura() {}

    public Temperatura(double tempCelcius, double tempFar) {
        this.tempCelcius = tempCelcius;
        this.tempFar = tempFar;
    }

    public double getTempCelcius() {
        return tempCelcius;
    }

    public void setTempCelcius(double tempCelcius) {
        this.tempCelcius = tempCelcius;
    }

    public double getTempFar() {
        return tempFar;
    }

    public void setTempFar(double tempFar) {
        this.tempFar = tempFar;
    }

    public void calcularTemp() {
        tempCelcius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em celcius:"));
        tempFar = (tempCelcius * 1.8) + 32;

        JOptionPane.showMessageDialog(null, "A temperatura em fahrenheit é:" + tempFar + "ºF");
    }

}
