package models;

import javax.swing.*;

public class FrangoTech {
//    A granja Frangotech possui um controle automatizado de cada frango da sua produção.
//    No pédireito do frango háum anel com um chip de identificação; no péesquerdo são
//    dois anéis para indicar o tipo de ali- mento que ele deve consumir. Sabendo que o anel
//    com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo para
//    calcular o gasto total da granja para marcar todos os seus frangos.

    private int quantidadeFrangos;
    private double custoChip = 4.00;
    private double custoAlimento = 3.50;
    private double gastoTotal;

    public void calculadoraFrango() {
        quantidadeFrangos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de frangos:"));
        gastoTotal = quantidadeFrangos * (custoChip + 2 * custoAlimento);
        JOptionPane.showMessageDialog(null, "O total gasto para marcar todos os frangos foi de:"
        + "R$:" + gastoTotal);
    }

}
