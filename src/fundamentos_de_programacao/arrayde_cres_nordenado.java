package fundamentos_de_programacao;
 import java.util.Scanner;
 /*Construa um programa que leia 5 números inteiros e armazene em um vetor. Em
seguida, verifique e mostre uma mensagem indicando se o vetor está em ordem
crescente, decrescente ou não ordenado.*/
 public class arrayde_cres_nordenado {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
      int[] vetorA = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("entre com valor do indce do vetor " + i + ":");
            vetorA[i] = ler.nextInt();
        }
        boolean crescente = true;
        boolean decrescente = true;
        for (int i = 0; i < 4; i++) {
            if (vetorA[i] > vetorA[i + 1]) {
                crescente = false;
            }
            if(vetorA[i] < vetorA[i + 1]) {
                decrescente = false;
            }
        }
        if(crescente){
            System.out.println("######o vetor esta em ordem crescente#######");
        }else  if(decrescente){
                System.out.println("######o vetor esta em ordem decrescente########");
            }else{

            System.out.println("###### o vetor não esta em ordenado########");
        }
    }
}
