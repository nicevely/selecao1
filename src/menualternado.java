import java.beans.VetoableChangeListener;
import java.util.Scanner;
public class menualternado {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int[] vetorA = new int[50];
        int[] vetorB = new int[50];
        int[] vetorperfeito = new int[50];
        int qtdA = 0;
        int qtdB = 0;
        byte opcao;
        do {
            System.out.println("\n =========MENU=========");
            System.out.println("1.Inserir vetores \n" +
                    "2.Listar vetores \n" +
                    "3.Gerar vetor com os números primos dos vetores \n" +
                    "4.listar o maior e menor número de cada vetor \n" +
                    "5.Gerar vetor com os números alternados dos vetores \n" +
                    "6.listar números pares e impares de cada vetor \n" +
                    "7.Gerar vetor diferença \n" +
                    "8.Gerar vetor intercesão \n" +
                    "9.Eliminar números repetidos \n" +
                    "10.Exibir elementos com índice equidistantes \n" +
                    "11.Exibir a média dos vetores \n" +
                    "12.Gerar vetor de números perfeitos \n" +
                    "13.união dos vetores \n" +
                    "14.SAIR.");
            System.out.println("========ESCOLHA AS OPCÕES========");
            opcao = ler.nextByte();
            ;
            switch (opcao) {
                case 1:
                    do {
                        System.out.print("Digite a quantidade de números dentro do vetor A (máx 50): ");
                        qtdA = ler.nextInt();
                    } while (qtdA <= 0 || qtdA >= 50);
                    for (int i = 0; i < qtdA; i++) {
                        System.out.println("Entre com índice do primeiro vetor: " + i);
                        vetorA[i] = ler.nextInt();
                    }
                    do {
                        System.out.print("Digite a quantidade de números dentro do vetor B (máx 50): ");
                        qtdB = ler.nextInt();
                    } while (qtdB <= 0 || qtdB >= 50);
                    for (int i = 0; i < qtdB; i++) {
                        System.out.println("Entre com índice do segundo vetor: " + i);
                        vetorB[i] = ler.nextInt();
                    }
                    break;
                case 2:
                    for (int i = 0; i < qtdA; i++) {
                        System.out.print(vetorA[i] + " | ");
                    }
                    for (int i = 0; i < qtdB; i++) {
                        System.out.print(vetorB[i] + " | ");
                    }
                    break;
                case 3:
                    int[] vetorprimo = new int[qtdA + qtdB];
                    int contprimo = 0;

                    for (int i = 0; i < qtdA; i++) {
                        int num = vetorA[i];
                        if (num > 1) {
                            int cont = 0;
                            for (int j = 1; j <= num; j++) {
                                if (num % j == 0)
                                    cont++;
                            }
                            if (cont == 2) {
                                vetorprimo[contprimo++] = num;
                            }
                        }
                    }
                    for (int i = 0; i < qtdB; i++) {
                        int num = vetorB[i];
                        if (num > 1) {
                            int cont = 0;
                            for (int j = 1; j <= num; j++) {
                                if (num % j == 0)
                                    cont++;
                            }
                            if (cont == 2) {
                                vetorprimo[contprimo++] = num;
                            }
                        }
                    }
                    if (contprimo == 0) {
                        System.out.println("\n nenhum número primo nos vetores!");
                    } else {
                        System.out.println("\n Vetor com número primo!!");
                        for (int i = 0; i < contprimo; i++) {
                            System.out.println(vetorprimo[i] + " | ");
                        }
                    }
                    break;
                case 4:
                    int maiorA = vetorA[0];
                    for (int i = 1; i < qtdA; i++) {
                        if (vetorA[i] > maiorA) {
                            maiorA = vetorA[i];
                        }
                    }
                    System.out.println("O MAIOR NÚMERO DO VETOR: " + maiorA);
                    int menorA = vetorA[0];
                    for (int i = 1; i < qtdA; i++) {
                        if (vetorA[i] < menorA) {
                            menorA = vetorA[i];
                        }
                    }
                    System.out.println("O MENOR NÚMERO DO VETOR: " + menorA);
                    int maiorB = vetorB[0];
                    for (int i = 1; i < qtdB; i++) {
                        if (vetorB[i] > maiorB) {
                            maiorB = vetorB[i];
                        }
                    }
                    System.out.println("O MAIOR NÚMERO DO VETOR: " + maiorB);
                    int menorB = vetorB[0];
                    for (int i = 1; i < qtdB; i++) {
                        if (vetorB[i] < menorB) {
                            menorB = vetorB[i];
                        }
                    }
                    System.out.println("O MENOR NÚMERO DO VETOR: " + menorB);
                    break;
                case 5:
                    int[] vetoralternado = new int[qtdA + qtdB];
                    int iAlternado = 0, iA = 0, iB = 0;
                    while (iA < qtdA && iB < qtdB) {
                        vetoralternado[iAlternado++] = vetorA[iA++];

                        vetoralternado[iAlternado++] = vetorB[iB++];
                    }
                    while (iA < qtdA) {
                        vetoralternado[iAlternado++] = vetorA[iA++];
                    }
                    while (iB < qtdB) {
                        vetoralternado[iAlternado++] = vetorB[iB++];
                    }
                    System.out.println("\n Vetor Alternado");
                    for (int i = 0; i < (qtdA + qtdB); i++) {
                        System.out.println(vetoralternado[i]);
                    }

                    break;
                case 6:
                    int contpar = 0;
                    for (int i = 0; i < qtdA; i++) {
                        if (vetorA[i] % 2 == 0) {
                            contpar = vetorA[i];
                            System.out.println("números pares do vetor A: " + contpar);
                        } else {
                            if (vetorA[i] % 2 != 0) {
                                int contimpar = vetorA[i];
                                System.out.println("números impares do vetor A: " + contimpar);
                            }
                        }
                    }

                    for (int i = 0; i < qtdB; i++) {
                        if (vetorB[i] % 2 == 0) {
                            contpar = vetorB[i];
                            System.out.println("números pares do vetor B: " + contpar);
                        } else {
                            if (vetorB[i] % 2 != 0) {
                                int contimpar = vetorB[i];
                                System.out.println("números impares do vetor B: " + contimpar);
                            }
                        }
                    }
                    break;
                case 7:  //.Gerar vetor diferença
                    boolean existe = false;
                    int l = 0;
                    int[] vetordiferenca = new int[50];
                    for (int i = 0; i < qtdA; i++) {
                        existe = false;
                        for (int j = 0; j < qtdB; j++) {
                            if (vetorA[i] == vetorB[j]) {
                                existe = true;
                            }
                        }
                        if (!existe) {
                            vetordiferenca[l] = vetorA[i];
                            System.out.println(vetordiferenca[l] + " ");
                        }
                    }
                    break;
                case 8:  //Gerar vetor intercesão
                    int[] vetorintercesao = new int[50];
                    int k = 0;
                    boolean encontrou = false;
                    for (int i = 0; i < qtdA; i++) {
                        encontrou = false;
                        for (int j = 0; j < qtdB; j++) {
                            if (vetorA[i] == vetorB[j]) {
                                encontrou = true;
                                break;
                            }
                        }
                        if (encontrou) {
                            vetorintercesao[k] = vetorA[i];
                            System.out.println(vetorintercesao[k] + " ");
                        }
                    }
                    break;
                case 9:
                    //vetorA
                   int qtdauxA = 0;
                   int[] vetorAux1 = new int[qtdA];
                    for (int i = 0; i < qtdA; i++) {
                        boolean repetidos = false;
                        for (int j = 0; j < qtdauxA; j++) {
                           if(vetorA[i] == vetorAux1[j]) {
                               repetidos = true;
                           }
                        }
                        if(!repetidos){
                            vetorAux1[qtdauxA] = vetorA[i];
                            qtdauxA++;
                        }
                    }
                    for (int i = 0; i < qtdauxA; i++) {
                       vetorA[i] = vetorAux1[i];
                    }
                    qtdA = qtdauxA;
                    System.out.println("vetor A sem numeros repetidos: ");
                    for (int i = 0; i < qtdA; i++) {
                        System.out.println(vetorA[i] + " ");
                    }
                    //vetorB
                    int qtdauxB = 0;
                    int[] vetoraux2 = new int[qtdB];
                    for (int i = 0; i < qtdB; i++) {
                        boolean repetidos = false;
                        for (int j = 0; j < qtdauxB; j++) {
                            if(vetorB[i] == vetoraux2[j]){
                                repetidos = true;
                            }
                        }
                        if(!repetidos){
                            vetoraux2[qtdauxB] = vetorB[i];
                            qtdauxB++;
                        }
                    }
                    for (int i = 0; i < qtdauxB; i++) {
                       vetorB[i] = vetoraux2[i];
                    }
                    qtdB = qtdauxB;
                    System.out.println("vetor B sem numeros repetidos: ");
                    for (int i = 0; i < qtdB; i++) {
                        System.out.println(vetorB[i]);
                    }
                    break;
                case 10:
                    int j = qtdA - 1;
                    int i = 0;
                    int tempA;
                       while(i <= j){
                           tempA = vetorA[i];
                           vetorA[i] = vetorA[j];
                           vetorA[j] = tempA;
                           i++;
                           j--;
                       }
                    System.out.println("Velores equidistantes do vetor A: ");
                    for (int m = 0; m < qtdA; m++) {
                        System.out.println(vetorA[m]);
                    }

                    int jB = qtdB - 1;
                     i = 0;
                    int tempB;
                    while(i <= jB){
                        tempB = vetorB[i];
                        vetorB[i] = vetorB[jB];
                        vetorB[jB] = tempB;
                        i++;
                        jB--;
                    }
                    System.out.println("Velores equidistantes do vetor B: ");
                    for (int m = 0; m < qtdB; m++) {
                        System.out.println(vetorB[m]);
                    }
                    break;
                case 11:           //.Exibir a média dos vetores
                    int somaA = 0;
                    int mediaA = 0;
                    for ( i = 0; i < qtdA; i++) {
                        somaA = somaA + vetorA[i];
                    }
                    System.out.println("A soma do vetor A é: " + somaA);
                    mediaA = somaA/qtdA;
                    System.out.println("A média do vetor A é: " + mediaA);

                    int somaB = 0;
                    int mediaB = 0;
                    for ( i = 0; i < qtdB; i++) {
                        somaB = somaB + vetorB[i];
                    }
                    System.out.println("A soma do vetor B é: " + somaB);
                    mediaB = somaB/qtdB;
                    System.out.println("A média do vetor B é: " + mediaB);
                   break;
                case 12:    //Gerar vetor de números perfeito
                    int p = 0;
                    for (int m = 0; m < qtdA; m++) {
                        int somadivisores = 0;
                        for (int n = 1; n < vetorA[m] ; n++) {
                            if(vetorA[m] % n == 0) {
                                somadivisores += n;

                            }
                        }
                        if(vetorA[m] == somadivisores){
                            existe = false;
                            for ( k = 0; k < p; k++) {
                                if(vetorperfeito[k] == vetorA[m]){
                                    existe = true;
                                    break;
                                }
                            }
                            if(!existe){
                                vetorperfeito[p] = vetorA[m];
                                p++;
                            }
                        }
                    }
                    for (int m = 0; m < qtdB; m++) {
                      int somadivisores = 0;
                        for (int n = 1; n < vetorB[m]; n++) {
                            if(vetorB[m] % n == 0){
                               somadivisores += n; 
                            }
                        }
                        if(vetorB[m] == somadivisores){
                            existe = false;
                            for ( k = 0; k < p; k++) {
                                if(vetorperfeito[k] == vetorB[m]){
                                    existe = true;
                                }
                            }
                            if(!existe){
                               vetorperfeito[p] = vetorB[m];
                               p++;
                            }
                        }
                    }
                    System.out.println("vetor com números perfeitos:" );
                    for (int m = 0; m < p; m++) {
                        System.out.println(vetorperfeito[m] + "  ");
                    }
                   break;
                 case 13:   //uniao
                    int[] vetoruniao = new int[qtdA + qtdB];
                    k = 0;
                     for (int m = 0; m < qtdA; m++) {
                        vetoruniao[k] = vetorA[m];
                        k++;
                     }
                     for (int m = 0; m < qtdB; m++) {
                         vetoruniao[k] = vetorB[m];
                         k++;
                     }
                     System.out.println("vetor  uniao: ");
                     for (int m = 0; m < k; m++) {
                         System.out.println(vetoruniao[m] + " ");
                     }
                   break;
                 case 14:
                System.out.println("SAINDO...");
                   break;
                default:
                System.out.println("OPÇÃO INVÁLIDA!!");
                break;
           }
        }while(opcao != 14);
    }
}
