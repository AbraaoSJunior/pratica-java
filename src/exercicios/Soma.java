package exercicios;

import java.util.Scanner;

final class Soma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero1 = scan.nextInt();
        System.out.println("Informe outro número: ");
        int numero2 = scan.nextInt();

        System.out.println("A soma dos números informados é: " + (numero1 + numero2));
        if (numero1 > numero2){
            System.out.println(numero1 + " é o maior número.");
        } else {
            System.out.println(numero2 + "é o maior número.");
        }

        scan.close();
    }
}
