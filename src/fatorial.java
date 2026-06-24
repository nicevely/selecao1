import java.util.Scanner;
public class fatorial {
    static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("digite um numero inteiro: ");
        int num = ler.nextInt();
        double fat = 1;
        for (int i = 1; i < num; i++) {
          fat = fat * i;
        }
        System.out.println("o fatorial desse numero é: " + fat);
    }
}
