package exercicios;

import java.util.Scanner;

public class PositivoOuNegativo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();

        if (valor > 0) {
            System.out.println("Esse valor é positivo.");
        } else if (valor < 0){
            System.out.println("Esse valor é negativo.");
        } else {
            System.out.println("Digite um valor diferente de zero.");
        }


        scan.close();
    }
}
