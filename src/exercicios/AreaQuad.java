package exercicios;

import java.util.Scanner;

public class AreaQuad {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um lado de um quadrado: ");
        double lado1 = scan.nextDouble();

        double areaQuad = Math.pow(lado1, 2);

        System.out.println("O dobro da área do quadrado informado é de: " + (areaQuad * 2));

        scan.close();
    }
}
