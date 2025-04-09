//Escreva um código que receba o valor do raio de uma circunferência e retorne a área desta circunferência. 

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {

        double PI = 3.12159;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo da Área de Circunferência");
        System.out.println("Escreva o valor do raio: ");
        double user_raio = scanner.nextDouble();

        double raio_2 = user_raio * user_raio;
        double area = PI * raio_2;

        System.out.println("A área da circunferência é de aproximadamente: " + area);

        scanner.close();
    }
}