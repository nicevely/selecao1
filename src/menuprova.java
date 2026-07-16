import java.util.Scanner;
public class menuprova {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetorA = new int[50];
        int[] vetorB = new int[50];
        int[] vetoracima = new int [50];
        int qtdA = 0;
        int qtdB = 0;
        Byte opcao;
        do {
            System.out.println("\n======MENU=======");
            System.out.print("1.Inserir dois vetores\n" +
                    "2.Listar vetores\n" +
                    "3.Imprimir os dois menores números\n" +
                    "4.Gerar vetor alternado\n" +
                    "5.Gerar vetor acima da média\n" +
                    "6.SAIR.\n");
            System.out.println("========ESCOLHA UMA OPÇÃO=========");
            opcao = ler.nextByte();
            switch(opcao) {
                case 1:
                    do {
                        System.out.println("Digite a quantidade do primeiro vetor: (máximo 50)");
                        qtdA = ler.nextInt();
                    } while(qtdA < 0 || qtdA >= 50);
                    for(int i = 0; i < qtdA; i++) {
                        System.out.println("entre com o índice do primeiro vetor: " + i);
                        vetorA[i] = ler.nextInt();
                    }
                    do {
                        System.out.println("Digite a quantidade do segundo vetor: (máximo 50)");
                        qtdB = ler.nextInt();
                    } while(qtdB < 0 || qtdB >= 50);
                    for(int i = 0; i < qtdB; i++) {
                        System.out.println("entre com o índice do segundo vetor: " + i);
                        vetorB[i] = ler.nextInt();
                    }
                    break;
                case 2:
                    for(int i = 0; i < qtdA; i++) {
                        System.out.println(vetorA[i] + " | ");
                    }
                    for(int i = 0; i < qtdB; i++) {
                        System.out.println(vetorB[i] + " | ");
                    }
                    break;

                case 3:
                    int menorA = vetorA[0];
                    for(int i = 1; i < qtdA; i++) {
                        if(menorA > vetorA[i]) {
                            menorA = vetorA[i];
                        }
                    }
                    System.out.println("o menor valor do vetor A: " + menorA);

                    int menorB = vetorB[0];
                    for(int i = 1; i < qtdB; i++) {
                        if(menorB > vetorA[i]) {
                            menorB = vetorB[i];
                        }
                    }
                    System.out.println("o menor valor do vetor B: " + menorB);
                    break;
                case 4:
                    int[] vetoralternado = new int[qtdA + qtdB];
                    int ialternado = 0, iA = 0, iB = 0;
                    while(iA < qtdA && iB < qtdB) {
                        vetoralternado[ialternado++] = vetorA[iA++];

                        vetoralternado[ialternado++] = vetorB[iB++];
                    }
                    while(iA < qtdA) {
                        vetoralternado[ialternado++] = vetorA[iA++];
                    }
                    while(iB < qtdB) {
                        vetoralternado[ialternado++] = vetorA[iB++];
                    }
                    System.out.println("vetor alternado: ");
                    for(int i = 0; i < qtdA + qtdB; i++)
                        System.out.println(vetoralternado[i] + " | ");
                    break;
                case 5:
                    int m = 0;
                    int somaA = 0;
                    float mediaA = 0;
                    for(int i = 0; i < qtdA; i++) {
                        somaA = somaA + vetorA[i];
                    }
                    System.out.println("A soma do vetor A: " + somaA);
                    mediaA = somaA/qtdA;
                    System.out.println("A media do vetor A: " + mediaA);
                    for(int i = 0; i < qtdA; i++) {
                        if(vetorA[i] > mediaA){
                            vetoracima[m] = vetorA[i];
                            m++;
                        }
                    }
                    int somaB = 0;
                    float mediaB = 0;
                    for(int i = 0; i < qtdB; i++) {
                        somaB = somaB + vetorB[i];
                    }
                    System.out.println("\n A soma do vetor B: " + somaB);
                    mediaB = somaB/qtdB;
                    System.out.println("A media do vetor B: " + mediaB);
                    for(int i = 0; i < qtdB; i++) {
                        if(vetorB[i] > mediaB){
                            vetoracima[m] = vetorB[i];
                            m++;
                        }
                    }
                    System.out.println("vetor com os numeros acima da media ");
                    for(int k = 0; k < m; k++) {
                        System.out.println(vetoracima[k] + " | ");
                    }
                    break;
                case 6:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        } while(opcao != 6);

    }
}