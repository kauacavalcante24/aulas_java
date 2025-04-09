//Escreva um código que receba um valor inteiro e diga se ele é divisível por cinco.

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num % 5 == 0){
            System.out.println(num + " é divisível por 5.");
        }
        else{
            System.out.println(num + " não é divisível por 5.");
        }
    }
}