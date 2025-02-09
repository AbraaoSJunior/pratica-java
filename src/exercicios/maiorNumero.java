package exercicios;

import java.util.Scanner;

public class maiorNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o primeiro número: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o primeiro número: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " é o maior número.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " é o maior número.");
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " é o maior número.");
        }

        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1 + " é o menor número.");
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2 + " é o menor número.");
        } else if (num3 <= num1 && num3 <= num2) {
            System.out.println(num3 + " é o menor número.");
        }

        sc.close();
    }
}
