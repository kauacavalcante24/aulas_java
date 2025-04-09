import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user_account = "aluno@ulife.com.br";
        int user_password = 20251;

        System.out.println();
        System.out.print("Digite seu email: ");
        String email = input.nextLine();
        System.out.print("Digite sua senha: ");
        int password = input.nextInt();
        input.close();

        if ((email.equals(user_account)) && (password==user_password)){
            System.out.println("Você está logado!");
        }
        else{
            System.out.println("Usuário ou senha inválidos!");
        }
    }
}
