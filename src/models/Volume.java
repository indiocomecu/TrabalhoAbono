package models;

import javax.swing.*;

public class Volume {
    private int altura;
    private int raio;
    private double volume;

    public void calcularVolume() {
        altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura da caixa de água:"));
        raio = Integer.parseInt(JOptionPane.showInputDialog("Informe o raio da caixa de água:"));
        volume =  3.141592653589793 * raio * raio * altura;

        JOptionPane.showMessageDialog(null, "O volume da caixa de água é de: " + volume + "Metros");
    }
}
