package fundamentos_de_programacao;
/*Faça um programa que leia 10 números inteiros e armazene em um vetor. Em
seguida, leia um número X. Verifique e mostre uma mensagem indicando quantos
números do vetor são maiores que X, menores que X e iguais a X.*/
import java.util.Scanner;
public class igual_maior_menor {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
          int[] vetor = new int[10];
          int num;
          int cont =0;
        for (int i = 0; i < 10; i++) {
            System.out.println("entre com os indices do vetor: " + i);
            vetor[i] = ler.nextInt();
        }
            System.out.println("entre com um número para ser verificado e indicando quantos\n" +
                "números do vetor são maiores que X, menores que X e iguais a X: ");
             num = ler.nextInt();
              for(int i = 0; i < 10; i++){
                 if(vetor[i] > num) {
                     cont = cont + 1;
                 }
              }
            System.out.println("números maiores que x: " + cont);
              cont = 0;
              for (int i = 0; i < 10; i++) {
                if(num > vetor[i]) {
                    cont = cont + 1;
                }
              }
            System.out.println("números menores que x: " + cont);
              cont =0;
              for (int i = 0; i < 10; i++) {
                  if (num == vetor[i]) {
                      cont = cont + 1;
                  }
              }
            System.out.println("números iguais a x: " + cont);
    }
}
