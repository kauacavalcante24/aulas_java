import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println();
         System.out.print("Escreva um número inteiro: ");
         int user_number = input.nextInt();
         input.close();

         if (user_number % 2 == 0){
            for(int i=0;i<=user_number;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
         }
         else{
            for(int i=0;i<=user_number;i++){
                if(i%2!=0){
                    System.out.println(i);
                }
            }
         }
    }
}