package models;

import javax.swing.*;

public class ConfecçãoBlusas {
//    Uma confecção produz X blusas de lãe para isto gasta uma certa quantidade de
//    novelos. Faça um algoritmo para calcular quantos novelos de lãela gasta por blusa.

    private double qtdBlusas;
    private double qtdNovelo;
    private double novelosGastos;

    public ConfecçãoBlusas() {
    }

    public ConfecçãoBlusas(double qtdBlusas, double qtdNovelo, double novelosGastos) {
        this.qtdBlusas = qtdBlusas;
        this.qtdNovelo = qtdNovelo;
        this.novelosGastos = novelosGastos;
    }

    public double getQtdBlusas() {
        return qtdBlusas;
    }

    public void setQtdBlusas(double qtdBlusas) {
        this.qtdBlusas = qtdBlusas;
    }

    public double getQtdNovelo() {
        return qtdNovelo;
    }

    public void setQtdNovelo(double qtdNovelo) {
        this.qtdNovelo = qtdNovelo;
    }

    public double getNovelosGastos() {
        return novelosGastos;
    }

    public void setNovelosGastos(double novelosGastos) {
        this.novelosGastos = novelosGastos;
    }

    public void calcularNovelos() {
        qtdBlusas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de blusas que você confecccionou:"));
        qtdNovelo = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de novelos de lâ que foram gastos:"));

        novelosGastos = (qtdBlusas / qtdNovelo);

        JOptionPane.showMessageDialog(null, "A quantidade de novelos usados foram de:" + novelosGastos);

    }
}

