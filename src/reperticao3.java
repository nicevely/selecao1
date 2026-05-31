import java.util.Scanner;
public class reperticao3 {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("entre com um numero inteiro ");
        double media;
        float soma;
        media = ler.nextDouble();
        soma = ler.nextFloat();
         for (int i = 1; i <= 100; i++) {
           soma = soma + 1;

         }
        media = soma/2;
        System.out.println("entre com a media " + media);

    }
}
