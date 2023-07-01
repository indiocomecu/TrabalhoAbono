package models;

import javax.swing.*;

public class CofrePedrinho {

//    Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais conseguiu
//    poupar. Faça um algoritmo para ler a quantidade de cada tipo de moeda, e imprimir o
//    valor total economizado, em reais. Considere que existam moedas de 1, 5, 10, 25 e 50
//    centavos, e ainda moedas de 1 real. Não havendo moeda de um tipo, a quantidade
//    respectiva ézero.

    private int qtdUmCentavo;
    private double umCentavo = 0.01;
    private int qtdCincoCentavos;
    private double cincoCentavos = 0.05;
    private int qtdDezCentavos;
    private double dezCentavos = 0.10;
    private int qtdCentavo25;
    private double centavo25 = 0.25;
    private int qtdCentavo50;
    private double centavo50 = 0.50;
    private int qtdUmReal;
    private double umReal = 1.00;
    private double total;

    public CofrePedrinho() {
    }

    public CofrePedrinho(int qtdUmCentavo, double umCentavo, int qtdCincoCentavos, double cincoCentavos,
                         int qtdDezCentavos, double dezCentavos, int qtdCentavo25, double centavo25, int qtdCentavo50,
                         double centavo50, int qtdUmReal, double umReal) {
        this.qtdUmCentavo = qtdUmCentavo;
        this.umCentavo = umCentavo;
        this.qtdCincoCentavos = qtdCincoCentavos;
        this.cincoCentavos = cincoCentavos;
        this.qtdDezCentavos = qtdDezCentavos;
        this.dezCentavos = dezCentavos;
        this.qtdCentavo25 = qtdCentavo25;
        this.centavo25 = centavo25;
        this.qtdCentavo50 = qtdCentavo50;
        this.centavo50 = centavo50;
        this.qtdUmReal = qtdUmReal;
        this.umReal = umReal;
    }

    public void totalEconomizado() {
        qtdUmCentavo = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de um centavo:"));
        qtdCincoCentavos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de cinco centavos:"));
        qtdDezCentavos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de dez cetavos:"));
        qtdCentavo25 = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe a quantidade de moedas de vinte e cinco centavos:"));
        qtdCentavo50 = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe a quantidade de moedas de cinquenta centavos:"));
        qtdUmReal = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de um real:"));

        total = (qtdUmCentavo * umCentavo) + (qtdCincoCentavos * cincoCentavos) + (qtdDezCentavos * dezCentavos) +
                (qtdCentavo25 + centavo25) + (qtdCentavo50 * centavo50) + (qtdUmReal * umReal);

        JOptionPane.showMessageDialog(null, "O total economizado foi de:" + "R$" + total);

    }

}
