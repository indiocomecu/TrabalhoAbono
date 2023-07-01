import models.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            String[] opcoes = {"Exercicio 1", "Exercicio 2", "Exercicio 3", "Exercicio 4",
                    "Exercicio 5", "Exercicio 6", "Exercicio 7", "Exercicio 8", "Exercicio 9", "Exercicio 10"};

            int opcao = JOptionPane.showOptionDialog(null, "Selecione uma opção:", "Menu Interativo",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            switch (opcao) {
                case 0:
                    LanchoneteGostosura lg = new LanchoneteGostosura();
                    lg.calcularQtd();
                    break;
                case 1:
                    Temperatura temp = new Temperatura();
                    temp.calcularTemp();
                    break;
                case 2:
                    Hipotheticus hipo = new Hipotheticus();
                    hipo.calcularSalario();
                    break;
                case 3:
                    FrangoTech frango = new FrangoTech();
                    frango.calculadoraFrango();
                    break;
                case 4:
                    ConfecçãoBlusas confec = new ConfecçãoBlusas();
                    confec.calcularNovelos();
                    break;
                case 5:
                    MeiaCola cola = new MeiaCola();
                    cola.calcularLitros();
                    break;
                case 6:
                    CofrePedrinho cofre = new CofrePedrinho();
                    cofre.totalEconomizado();
                    break;
                case 7:
                    Predio predio = new Predio();
                    predio.calcularAlturaPredio();
                    break;
                case 8:
                    TonelRefresco ref = new TonelRefresco();
                    ref.calcularTonelRefresco();
                    break;
                case 9:
                    Volume vol = new Volume();
                    vol.calcularVolume();
                    break;
                case 10:
                    System.exit(0);
            }
        }
    }
}