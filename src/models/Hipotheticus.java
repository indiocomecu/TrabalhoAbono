package models;

import javax.swing.*;

public class Hipotheticus {

//    A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora
//    extra. Faça um algoritmo para calcular e imprimir o salário bruto e o salário líquido de
//    um determinado funcionário. Considere que o salário líquido éigual ao salário bruto
//    descontando-se 10% de impostos.

    private int hrNormal;
    private int hrExtra;
    private double salarioNormal;
    private double salarioExtra;
    private double salarioBruto;
    private double salarioLiquido;
    private double imposto = 0.10;

    public Hipotheticus() {
    }

    public Hipotheticus(int hrNormal, int hrExtra, double salarioNormal, double salarioExtra, double salarioBruto, double salarioLiquido) {
        this.hrNormal = hrNormal;
        this.hrExtra = hrExtra;
        this.salarioNormal = salarioNormal;
        this.salarioExtra = salarioExtra;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public int getHrNormal() {
        return hrNormal;
    }

    public void setHrNormal(int hrNormal) {
        this.hrNormal = hrNormal;
    }

    public int getHrExtra() {
        return hrExtra;
    }

    public void setHrExtra(int hrExtra) {
        this.hrExtra = hrExtra;
    }

    public double getSalarioNormal() {
        return salarioNormal;
    }

    public void setSalarioNormal(double salarioNormal) {
        this.salarioNormal = salarioNormal;
    }

    public double getSalarioExtra() {
        return salarioExtra;
    }

    public void setSalarioExtra(double salarioExtra) {
        this.salarioExtra = salarioExtra;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public void calcularSalario() {
        hrNormal = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas horas normais foram trabalhadas:"));
        hrExtra = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas horas extras forma trabalhadas"));
        salarioNormal = hrNormal * 10.00;
        salarioExtra = hrExtra * 15.00;
        salarioBruto = salarioNormal + salarioExtra;
        imposto = salarioBruto * imposto;
        salarioLiquido = salarioBruto - imposto;

        JOptionPane.showMessageDialog(null, "O seu salario bruto é de:" + "R$" + salarioBruto);
        JOptionPane.showMessageDialog(null, "O seu salario liquido é de:" + "R$:" +
                salarioLiquido);

    }

}
