package exercicios;

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu salário/hora: ");
        double salHora = scan.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        double horaTrabMes = scan.nextDouble();

        double salBruto = salHora * horaTrabMes;
        double inss = (salBruto / 100) * 8;
        double ir = (salBruto / 100) * 11;
        double sindicato = (salBruto / 100) * 5;
        double totalDescontos = inss + ir + sindicato;
        double salLiquido = salBruto - totalDescontos;

        System.out.println("Seu salário bruto é R$" + salBruto);
        System.out.println("Você pagou R$" + inss + "de imposto do INSS");
        System.out.println("Sua contribuição sindical foi de R$" + sindicato);
        System.out.println("O valor pago ao IR foi de R$" + ir);
        System.out.println("O total de descontos é de R$" + totalDescontos);
        System.out.println("Seu salário líquido é de R$" + salLiquido);

        scan.close();
    }
}
