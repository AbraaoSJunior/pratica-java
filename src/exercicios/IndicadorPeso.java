package exercicios;

import java.util.Scanner;

public class IndicadorPeso {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println(" Informe sua altura (em metros):");
        double h = scan.nextDouble();

        System.out.println("Informe seu sexo com 'M' para masculino e 'F' para feminino: ");
        String sexo = scan.next().trim().toUpperCase();

        double pesoIdeal;

        if (sexo.equalsIgnoreCase("m")){
            pesoIdeal = (72.7 * h) - 58;
        } else if (sexo.equalsIgnoreCase("f")){
            pesoIdeal = (62.1 * h) - 44.7;
        } else {
            System.out.println("Sexo errado");
            return;
        }

        System.out.println("Informe seu peso: ");
        double peso = scan.nextDouble();

        if (peso > pesoIdeal) {
            System.out.println("Você está acima do peso.");
        } else if (peso < pesoIdeal) {
            System.out.println("Você está abaixo do peso.");
        } else {
            System.out.println("Você está no peso ideal.");
        }

        scan.close();

    }
}


























