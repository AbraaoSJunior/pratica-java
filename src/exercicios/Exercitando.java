package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercitando {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int[] num = new int[3];

        System.out.println("Digite um número: ");
        num[0] = sc.nextInt();
        System.out.println("Digite um número: ");
        num[1] = sc.nextInt();
        System.out.println("Digite um número: ");
        num[2] = sc.nextInt();

        Arrays.sort(num);

        for (int i = 2; i >=0; i--){
            System.out.println(num[i]);
        }
        sc.close();
    }
}
