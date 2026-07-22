import java.util.Scanner;
public class VTparimpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorpar = new int[10];
        int[] vetorimpar = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("entre com os valores do vetor A: " + i);
            vetorA[i] = ler.nextInt();
        }
        int contpar = 0;
        int num;
        for (int i = 0; i < 10; i++) {
            num = vetorA[i];
            if (num % 2 == 0) {
                vetorpar[contpar] = num;
                contpar++;
            }
        }
        System.out.println("vetor com numeros pares");
        for (int j = 0; j < contpar; j++) {
            System.out.println(vetorpar[j] + " | ");
        }
        int contimpar = 0;
        int numA;
        for (int i = 0; i < 10; i++) {
            numA = vetorA[i];
            if (numA % 2 != 0) {
                vetorimpar[contimpar] = numA;
                contimpar++;
            }
        }
        System.out.println("vetor com numeros impares");
        for (int j = 0; j < contimpar; j++) {
            System.out.println(vetorimpar[j] + " | ");
        }
    }
}
