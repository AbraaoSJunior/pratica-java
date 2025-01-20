package exercicios;

import java.util.Scanner;

public class MediaBimestral {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a nota do primeiro bimestre: ");
        double nota1 = scan.nextDouble();

        System.out.println("Informe a nota do segundo bimestre: ");
        double nota2 = scan.nextDouble();

        System.out.println("Informe a nota do terceiro bimestre: ");
        double nota3 = scan.nextDouble();


        System.out.println("Informe a nota do quarto bimestre: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Sua media é: " + media + ". Você está aprovado. Parabéns!");
        }else {
            System.out.println("Sua media é: " + media + ". Você está reprovado.");
        }

        scan.close();
    }
}
