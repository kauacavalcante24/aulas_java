import java.util.Scanner;

public class Atv7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva um número inteiro para a sequência máxima de Fibonacci: ");
        int max_number = input.nextInt();
        input.close();

        int first = 0, second = 1;

        if (max_number >=1){
            System.out.print("Sequência de Fibonacci: " + first + ", 1");
        }

        int next = first + second;

        while (next<=max_number){
            System.out.print(", " + next);
            first = second;
            second = next;
            next = first + second;
        }
        System.out.println();
    }
}