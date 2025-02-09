package exercicios;

import java.util.Scanner;

public class Letra {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 'F' para feminino ou 'M' para masculino; ");
        String input = scan.next().toUpperCase();

        if (input.equalsIgnoreCase("m")){
            System.out.println(input + " = Masculino.");
        } else if (input.equalsIgnoreCase("f")) {
            System.out.println(input + " = Feminino.");
        } else {
            System.out.println("Sexo inválido.");
        }

        System.out.println("Digite um letra");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) {
            System.out.println("Vogal.");
        } else {
            System.out.println("Consoante.");
        }

        scan.close();
    }
}
