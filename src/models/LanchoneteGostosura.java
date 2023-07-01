package models;

import javax.swing.*;

public class LanchoneteGostosura {

    private double qtdSanduiche;
    private double qtdQueijo;
    private double qtdPresunto;
    private double qtdHamburguer;

    public LanchoneteGostosura() {}

    public LanchoneteGostosura(double qtdSanduiche, double qtdQueijo, double qtdPresunto, double qtdHamburguer) {
        this.qtdSanduiche = qtdSanduiche;
        this.qtdQueijo = qtdQueijo;
        this.qtdPresunto = qtdPresunto;
        this.qtdHamburguer = qtdHamburguer;
    }

    public double getQtdSanduiche() {
        return qtdSanduiche;
    }

    public void setQtdSanduiche(double qtdSanduiche) {
        this.qtdSanduiche = qtdSanduiche;
    }

    public double getQtdQueijo() {
        return qtdQueijo;
    }

    public void setQtdQueijo(double qtdQueijo) {
        this.qtdQueijo = qtdQueijo;
    }

    public double getQtdPresunto() {
        return qtdPresunto;
    }

    public void setQtdPresunto(double qtdPresunto) {
        this.qtdPresunto = qtdPresunto;
    }

    public double getQtdHamburguer() {
        return qtdHamburguer;
    }

    public void setQtdHamburguer(double qtdHamburguer) {
        this.qtdHamburguer = qtdHamburguer;
    }

    public void calcularQtd(){
        qtdSanduiche = Integer.parseInt(JOptionPane.showInputDialog
                ("Informe a quantidade de sanduiches a serem feitos:"));
        qtdQueijo = (qtdSanduiche * 2 * 50) / 1000;
        qtdPresunto = (qtdSanduiche * 1 * 50) / 1000;
        qtdHamburguer = (qtdSanduiche * 1 * 100) / 1000;

        JOptionPane.showMessageDialog(null, "A quantidade de queijo necessaria é:" + qtdQueijo
        + "Kg");
        JOptionPane.showMessageDialog(null, "A quantidade de presunto necessaria é:" +
                qtdPresunto + "Kg");
        JOptionPane.showMessageDialog(null, "A quantidade de hamburguer necessaria é:" +
                qtdHamburguer + "Kg");

    }
}
