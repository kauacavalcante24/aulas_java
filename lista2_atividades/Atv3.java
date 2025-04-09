import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int user_choice = 1;
        while (user_choice == 1){
            System.err.println();
            System.out.println("Olá, Usuário!");
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.print("Digite: ");
            user_choice = input.nextInt();
            if ((user_choice != 1) && (user_choice != 2)){
                System.out.println("Resposta inválida!");
            }
        }
        System.out.println("Você saiu do sistema!");
        input.close();
    }
}
