import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int young = 0, adult = 0, elderly = 0;
        
        while (true) {
            System.out.print("Digite uma idade (ou 0 para encerrar): ");
            int age = input.nextInt();
            
            if (age == 0) {
                break;
            }
            
            if (age >= 0 && age <= 25) {
                young++;
            } else if (age >= 26 && age <= 60) {
                adult++;
            } else {
                elderly++;
            }
        }
        
        System.out.println("Quantidade de pessoas por faixa etária:");
        System.out.println("0 a 25 anos: " + young);
        System.out.println("26 a 60 anos: " + adult);
        System.out.println("Mais de 60 anos: " + elderly);
        
        input.close();
    }
}