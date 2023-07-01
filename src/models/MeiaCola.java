package models;

import javax.swing.*;

public class MeiaCola {

//    A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350
//    ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma
//    determinada quantidade de cada formato, faça um algoritmo para calcular quantos
//    litros de refrigerante ele comprou.

    private int qtdLata;
    private int qtdGarrafa;
    private int qtdGarrafa2;
    private int mlLata = 350;
    private int mlGarrafa = 600;
    private int mlGarrafa2 = 2000;
    private int somaLata;
    private int somaGarrafa;
    private int somaGarrafa2;
    private int somaTotal;
    private int somaLitros;

    public MeiaCola() {
    }

    public MeiaCola(int qtdLata, int qtdGarrafa, int qtdGarrafa2, int mlLata, int mlGarrafa, int mlGarrafa2, int somaLata, int somaGarrafa, int somaGarrafa2, int somaTotal, int somaLitros) {
        this.qtdLata = qtdLata;
        this.qtdGarrafa = qtdGarrafa;
        this.qtdGarrafa2 = qtdGarrafa2;
        this.mlLata = mlLata;
        this.mlGarrafa = mlGarrafa;
        this.mlGarrafa2 = mlGarrafa2;
        this.somaLata = somaLata;
        this.somaGarrafa = somaGarrafa;
        this.somaGarrafa2 = somaGarrafa2;
        this.somaTotal = somaTotal;
        this.somaLitros = somaLitros;
    }

    public void calcularLitros() {
        qtdLata = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de lata de 350ml que você comprou:"));
        qtdGarrafa = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de garrafa de 600 ml você comprou:"));
        qtdGarrafa2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de  garrafa de 2 litros você comprou"));

        somaLata = qtdLata * mlLata;
        somaGarrafa = qtdGarrafa * mlGarrafa;
        somaGarrafa2 = qtdGarrafa2 * mlGarrafa2;

        somaTotal = somaLata + somaGarrafa + somaGarrafa2;

        somaLitros = somaTotal / 1000;

        JOptionPane.showMessageDialog(null, "A quantidade de litros de refrigerante comprado é:"
        + somaLitros + "L");

    }


}
