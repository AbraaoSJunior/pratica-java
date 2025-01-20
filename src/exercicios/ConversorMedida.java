package exercicios;

import java.util.Scanner;

public class ConversorMedida {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma medida em Metros: ");
        double metro = scan.nextDouble();

        double conversao = metro * 100;

        System.out.println("A medida informada convertida para centimetros é: " + conversao);

        scan.close();
    }
}
