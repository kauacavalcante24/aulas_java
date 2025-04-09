/*
Escreva um código que receba 3 valores inteiro (a, b e c). Utilize  esses valores para encontrar o valor de delta. 
Caso o valor de delta seja menor que zero, informar que a equação não possui raízes reais. Se for maior ou igual a zero, encontre e informe os valores de x1 e x2. 
Para raiz quadrada precisaremos importar a biblioteca “math” e usar o comando math.sqrt(). 
*/
import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = input.nextInt();

        input.close();

        int b2 = b * b;
        double delta = b2 - (4*a*c);
        System.out.println("Valor de Delta: "+ delta);
        if (delta<0){
            System.out.println("A equação não possui raízes reais!");
        }
        else{
            double x1 = (-b2 + Math.sqrt(delta)) / (2*a);
            System.out.println("O valor de x1 é: " + x1);

            double x2 = (-b2 - Math.sqrt(delta)) / (2*a);
            System.out.println("O valor de x2 é: " + x2);
        }
    }
}