import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Número 1: ");
        int a = input.nextInt();
        System.out.print("Número 2: ");
        int b = input.nextInt();
        System.out.print("Número 3: ");
        int c = input.nextInt();

        input.close();

        if ((a<b) && (a<c)){
            System.out.println(a);
            if (b<c){
                System.out.println(b);
                System.err.println(c);
            }
            else{
                System.out.println(c);
                System.out.println(b);
            }
        }
        else if ((b<a) && (b<c)){
            System.out.println(b);
            if (a<c){
                System.out.println(a);
                System.out.println(c);
            }
            else{
                System.out.println(c);
                System.out.println(a);
            }
        }
        if ((c<a) && (c<b)){
            System.out.println(c);
            if (a<b){
                System.out.println(a);
                System.out.println(b);
            }
            else{
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}