import java.util.Scanner;
public class prova1 {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("entre com um numero inteiro (para sair digite -1): ");
       int numero = ler.nextInt();
        int cont;
        int qtd = 0;
        while(numero != -1) {
            cont = 0;
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    cont++;
                }                     //refazer sozinhaaaaaaa!!!!!
            }
            if(cont == 3) {
                qtd = qtd + 1;
        }
            System.out.println("o número tem três divisores ");
            System.out.println("entre com um numero inteiro (para sair digite -1): ");
            numero = ler.nextInt();
        }
        System.out.println("entre com a quantidade de numeros com exatos 3 divisores " + qtd);
    }
}

