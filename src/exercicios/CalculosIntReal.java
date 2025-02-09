package exercicios;

import java.util.Scanner;

public class CalculosIntReal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Digite um número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Digite um número real: ");
        double num = scan.nextDouble();

        int res1 = (num1 * 2) * (num2 / 2);
        double res2 = (num1 * 3) + num;
        double res3 = Math.pow(num, 3);

        System.out.println("O produto do dobro do primeiro número com a metade do segundo é igual a: " + res1);
        System.out.println("A soma do triplo do primeiro com o terceiro é igual a :" + res2);
        System.out.println("O terceiro elevado ao cubo é: " + res3);

        scan.close();
    }
}
