package exercicios;

import java.util.Scanner;

public class FolhaPagamento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da hora trabalhada: ");
        double salHora = sc.nextDouble();

        System.out.println("Quantas horas trabalhadas no mês? ");
        int diasTrabalhos = sc.nextInt();

        double salBruto = salHora * diasTrabalhos;
        double inss = (salBruto / 100) * 10;
        double sindicato = (salBruto / 100) * 3;
        double fgts = (salBruto / 100) * 11;
        double ir = 0;

        if (salBruto <= 900) {
            ir = 0;
        } else if (salBruto > 900 && salBruto <= 1500) {
            ir = (salBruto / 100) * 5;
        } else if (salBruto > 1500 && salBruto <= 2500) {
            ir = (salBruto / 100) * 10;
        } else {
            ir = (salBruto / 100) * 20;
        }

        double totalDescontos = inss + ir + sindicato;
        double salLiquido = salBruto - totalDescontos;

        System.out.println("Salário bruto: " + salBruto);
        System.out.println("(-) Imposto de Renda: " + ir);
        System.out.println("(-) INSS: " + inss);
        System.out.println("FGTS: " + fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário líquido: " + salLiquido);

        sc.close();
    }
}
