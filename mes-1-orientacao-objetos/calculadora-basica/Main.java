package Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int numero1;
        int numero2;
        int opcao = 0;

        while (opcao != 5){

            System.out.println("=====Calculadora=====");
            System.out.println("Escolha a operação a ser realizada: ");
            System.out.println("1- Adição (+)");
            System.out.println("2- Subtração (-)");
            System.out.println("3- Multiplicação x");
            System.out.println("4- Divisão (/)");
            System.out.println("5- Sair");
            System.out.println("Opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4){
                System.out.println("Digite o primeiro número: ");
                numero1 = scanner.nextInt();
                System.out.println("Digite o segundo número: ");
                numero2= scanner.nextInt();
            }else {
                continue;
            }


            switch (opcao){

                case 1:
                    System.out.println("Resultado: " + calc.soma(numero1, numero2));
                    break;
                case  2:
                    System.out.println("Resultado: " + calc.subtracao(numero1, numero2));
                    break;
                case 3:
                    System.out.println("Resultado: " + calc.multiplicacao(numero1,numero2));
                    break;
                case 4:
                    if (numero2 == 0) {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    } else {
                        System.out.println("Resultado: " + calc.divisao(numero1, numero2));
                    }
                    break;
                case 5:
                    System.out.println("Saindo ...");
                default:
                    System.out.println("Opção inválida!!");

            }

        }
    }
}
