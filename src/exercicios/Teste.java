package exercicios;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String turno;

        System.out.println("Que turno você estuda? Responda: M para Matutino, V para Vespertino ou N para Noturno. ");
        turno = sc.next();

        if (turno.equalsIgnoreCase("m")) {
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("v")) {
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("n")) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido!");
        }

        sc.close();
    }
}
