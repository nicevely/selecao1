import java.util.Scanner;
public class calculadora {    //faça um programa que o usuario possa esoljer entre os operadores +, -,/, *
    static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        System.out.println("entre com um desses operadores (+, -, /, *): ");
        System.out.println("entre com o primeiro número: ");
        System.out.println("entre com o segundo número: ");
        char opcao = ler.next().charAt(0);
        float num1 = ler.nextFloat();
        float num2 = ler.nextFloat();
        double resultado;
        switch(opcao) {
            case '+':
              resultado = num1 + num2;
                System.out.println(resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println(resultado);
                break;
            case '/':
                resultado = num1 / num2;
                System.out.println(resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println(resultado);
                break;
            default:
                System.out.println("opção inválida");
                break;
        }
    }
}
