package exercicios;

import java.util.Scanner;

public class tempoDownload {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho do arquivo a ser baixado (em MB)?");
        double arquivo = scan.nextDouble();

        System.out.println("Qual a velocidade de download (em Mbps)?");
        double velDownload = scan.nextDouble();

        double tempo = arquivo / velDownload;

        System.out.println("O tempo de download é de: " + tempo);

        scan.close();
    }
}
