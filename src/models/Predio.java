package models;

import javax.swing.*;

public class Predio {

    private int alturaPessoa;
    private int sombraPessoa;
    private int sombraPredio;
    private int alturaPredio;

    public void calcularAlturaPredio() {

        alturaPessoa = Integer.parseInt(JOptionPane.showInputDialog("Informe sua altura em cm:"));
        sombraPessoa = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento da sua sombra em cm:"));
        sombraPredio = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento da sombra do prédio em cm:"));

        alturaPredio = ((alturaPessoa * sombraPredio) / sombraPessoa) / 100;

        JOptionPane.showMessageDialog(null, "A altura do prédio aproximadamente é de: " +
                alturaPredio + " Metros");

    }


}
