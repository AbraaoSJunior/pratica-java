import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em Farenheit: ");
        double tempFarenheit = scan.nextDouble();
        double tempCelsius = 5 * (tempFarenheit - 32) / 9;

        System.out.println("A temperatura informada, em graus Celsius é: " + tempCelsius);

    }
}