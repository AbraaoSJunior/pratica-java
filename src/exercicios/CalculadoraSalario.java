package exercicios;

import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double salHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        int hrMes = scan.nextInt();

        double salMes = salHora * hrMes;

        System.out.println("Seu salário no mês é de : " + salMes);
        scan.close();
    }

}
