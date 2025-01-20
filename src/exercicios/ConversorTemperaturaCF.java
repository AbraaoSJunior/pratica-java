package exercicios;

import java.util.Scanner;

public class ConversorTemperaturaCF {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");
        double tempCelsius = scan.nextDouble();

        double tempF = (tempCelsius * 1.8) + 32;

        System.out.println("A temperatura informada, em graus Farenheig é: " + tempF);

        scan.close();
    }
}
