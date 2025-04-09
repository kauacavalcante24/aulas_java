import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Valor de 0 - 10: ");
        int value = input.nextInt();
        for(int i=0;i<=10;i++) {
             System.out.println(value + " x " + i + " = " + (value*i));
        }
        input.close();
    }
}
