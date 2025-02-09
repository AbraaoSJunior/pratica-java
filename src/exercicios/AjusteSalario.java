package exercicios;

import java.util.Scanner;

public class AjusteSalario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu salário: ");
        double sal = sc.nextDouble();
        double ajuste;

        if (sal < 2800) {
            ajuste = (sal / 100) * 20;
            double novoSal = sal + ajuste;
            System.out.println("Salário inicial: " + sal + ". Aumento de 20%: " + ajuste + ". Novo salário: " + novoSal);
        } else if (sal >= 2800 && sal < 7000) {
            ajuste = (sal / 100) * 15;
            double novoSal = sal + ajuste;
        } else if (sal >= 7000 && sal < 15000) {
            ajuste = (sal / 100) * 10;
            double novoSal = sal + ajuste;
        } else if (sal >= 15000) {
            ajuste = (sal / 100) * 5;
            double novoSal = sal + ajuste;
        }

        sc.close();
    }
}
