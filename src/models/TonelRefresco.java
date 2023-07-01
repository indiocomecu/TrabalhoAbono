package models;

import javax.swing.*;

public class TonelRefresco {

    private int qtdLitrosRef;
    private int qtdAgua;
    private int qtdSuco;

    public void calcularTonelRefresco() {

        qtdLitrosRef = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe a quantidade em litros de Refresco que serão feitos:"));
        qtdAgua = (qtdLitrosRef * 8) / 10;
        qtdSuco = (qtdLitrosRef * 2) / 10;

        JOptionPane.showMessageDialog(null, "Quantidade de água necessaria para ser feito " +
                qtdLitrosRef + "Litros de refresco é de: " + qtdAgua);
        JOptionPane.showMessageDialog(null, "Quantidade de suco necessario para ser feito " +  +
                               qtdLitrosRef + "Litros de refresco é de: " + qtdSuco);

    }

}
