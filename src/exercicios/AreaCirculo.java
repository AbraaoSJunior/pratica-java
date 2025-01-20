package exercicios;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio de um círculo: ");
        double raioCirculo = scan.nextDouble();

        double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);

        System.out.println("A área do círculo é: " + areaCirculo);

        scan.close();
    }
}
