import java.util.Scanner;
public class prova3 {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("entre com um numero inteiro: ");
        int num = ler.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
                                //refazer sozinhaaaaaaaaa!!!  //1 12 123 1234 12345

    }
}

