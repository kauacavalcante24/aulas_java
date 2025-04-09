import java.util.Scanner;
import java.util.Arrays;

public class Atv5v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Número 1: ");
        int num1 = input.nextInt();
        System.out.print("Número 2: ");
        int num2 = input.nextInt();
        System.out.print("Número 3: ");
        int num3 = input.nextInt();

        input.close();

        int[] numbers = {num1, num2, num3};

        Arrays.sort(numbers);

        for (int num : numbers){
            System.out.println(num);
        }
    }
}
