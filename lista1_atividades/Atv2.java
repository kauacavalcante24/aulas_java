//Escreva um código que receba a sua idade e retorne o ano do seu nascimento 

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int current_year = 2025;
        int current_month = 3;

        System.out.print("Cálculo de Idade");

        System.out.print("Digite a sua idade: ");
        int user_age = scanner.nextInt();

        System.out.println("Em qual mês você nasceu? (1 ao 12)");
        int month_birth = scanner.nextInt();

        int user_birth = current_year - user_age;

        //Cálculo para deixar o ano de nascimento mais preciso
        if (month_birth > current_month) {
            user_birth -= 1;
        }

        System.out.println("Você nasceu no ano de: " + user_birth);

        scanner.close();
    }
}