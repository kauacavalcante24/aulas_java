import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int looping_value = 1;

        while (looping_value==1){
            System.out.println();
            System.out.print("Valor 1 (inteiro): ");
            int num1 = input.nextInt();
            System.out.print("Valor 2 (inteiro): ");
            int num2 = input.nextInt();
            System.out.print("Valor 3 (inteiro): ");
            int num3 = input.nextInt();
            System.out.print("Valor 4 (inteiro): ");
            int num4 = input.nextInt();
            System.out.print("Valor 5 (inteiro): ");
            int num5 = input.nextInt();
            System.out.print("Valor 6 (inteiro): ");
            int num6 = input.nextInt();

            int sum = num1+num2+num3+num4+num5+num6;
            System.out.println("A soma dos seis valores é: " + sum);
            double division = sum / 6;
            System.out.println("A média dos valores é: " + division);

            System.out.println();
            System.out.println("Deseja realizar outro cálculo? ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int user_choice = input.nextInt();
            if (user_choice == 2){
                System.out.println();
                System.out.println("Encerrando programa");
                looping_value = 2;
            }
        }
        input.close();
    }
}
