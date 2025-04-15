import java.util.ArrayList;
import java.util.Scanner;

public class MenuAddUser{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        int option = 0;

        System.out.println();
        System.out.println("SISTEMA DE GERENCIAMENTO DE USUÁRIOS ----------------------------");
        do{
            System.out.println();
            System.out.println("----MENU----");
            System.out.println();
            System.out.println("1 - Adicionar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Buscar Usuário");
            System.out.println("4 - Remover usuário");
            System.out.println("5 - Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case (1):
                    System.out.println();
                    System.out.println("----CADASTRO DE USUÁRIO----");
                    System.out.println();
                    System.out.print("Digite um nome: ");
                    String name = input.nextLine();
                    names.add(name);
                    System.out.println("Nome adicionado com sucesso!");
                    break;

                case (2):
                    System.out.println();
                    System.out.println("----LISTAR USUÁRIOS----");
                    System.out.println();
                    if (names.size() == 0){
                        System.out.println("Nenhum usuário cadastrado!");
                    }
                    else{
                        for (int i=0; i<names.size(); i++){
                            System.out.println("-> Usuário: " + names.get(i));
                        }
                    }
                    break;
                case (3):
                    System.out.println();
                    System.out.println("----BUSCAR USUÁRIO----");
                    System.out.println();
                    System.out.print("Digite o nome do usuário: ");
                    String searchUser = input.nextLine();
                    System.out.println();
                    if (names.contains(searchUser)){
                        System.out.println("Índice do Usuário: " + names.indexOf(searchUser));
                    }
                    else{
                        System.out.println("Usuário não encontrado!");
                    }
                    break;
                case (4):
                    System.out.println();
                    System.out.println("----DELETAR USUÁRIO----");
                    System.out.println();
                    System.out.print("Digite o nome do usuário:");
                    String deleteName = input.nextLine();
                    System.out.println();
                    if (names.contains(deleteName)){
                        names.remove(deleteName);
                        System.out.println("Usuário removido!");
                    }
                    else{
                        System.out.println("Usuário não encontrado!");
                    }
                    break;

                case (5):
                    System.out.println();
                    System.out.println("Saindo do gerenciador!");
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (option != 5);
        input.close();
    }
}