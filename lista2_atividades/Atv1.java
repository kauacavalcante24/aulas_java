import java.util.Scanner;

public class Atv1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Escreva o primeiro valor inteiro: ");
        int user_value1 = input.nextInt();
        System.out.print("Escreva o segundo valor inteiro: ");
        int user_value2 = input.nextInt();
        input.close();

        int sum_values = user_value1 + user_value2;

        if (sum_values % 2 == 0){
            System.out.println(user_value1 + " + " + user_value2 + " = " + sum_values);
            System.out.println("O resultado é par!");
        }
        else{
            System.out.println(user_value1 + " + " + user_value2 + " = " + sum_values);
            System.out.println("O resultado é ímpar!");
        }
    }
}