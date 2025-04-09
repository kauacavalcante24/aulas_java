/*
Uma empresa possui três cargos e seus respectivos salários, sendo eles:
Gerente - R$ 8.500,00
Analista - R$ 5.000,00
Suporte - R$ 3.000,00
Será dado um reajuste de 12% nos salários do Gerente e Analista, e 15% no salário do Suporte.
Escreva um código que faça o reajuste e exiba os novos valores.
*/

public class Atv4 {
    public static void main(String[] args) {
        int salario_gerente = 8500;
        int salario_analista = 5000;
        int salario_suporte = 3000;

        double new_gerente = salario_gerente * 0.12;
        double new_analista = salario_analista * 0.12;
        double new_suporte = salario_suporte * 0.15;

        System.out.println(" ");
        System.out.println("Gerente, aumento de 12%:");
        System.out.println("Antigo salário: " + salario_gerente);
        System.out.println("Acréscimo: " + new_gerente);
        System.out.println("Salário atual: " + (new_gerente + salario_gerente));
        System.out.println(" ");

        System.out.println("Analista, aumento de 12%:");
        System.out.println("Antigo salário: " + salario_analista);
        System.out.println("Acréscimo: " + new_analista);
        System.out.println("Salário atual: " + (new_analista + salario_analista));
        System.out.println(" ");

        System.out.println("Suporte, aumento de 15%:");
        System.out.println("Antigo salário: " + salario_suporte);
        System.out.println("Acréscimo: " + new_suporte);
        System.out.println("Salário atual: " + (new_suporte + salario_suporte));
        System.out.println(" ");

    }
}