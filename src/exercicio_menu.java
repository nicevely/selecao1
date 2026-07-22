import java.util.Scanner;
public class exercicio_menu {
    static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
         int[] v1 = new int[50];
         int[] v2 = new int[50];
         int[] vr = new int[50];
         int[] vetorperfeito = new int[50];
         int num;
         int qtd1 = 0;
         int qtd2 = 0;
         int maior;
         byte opcao;
         int qtd_perfeitos = 0;
         int somaDivisores = 0;
         do {
             System.out.println("\n==========MENU============");
             System.out.print("Menu de opções:\n" +
                "1. Inserir dois Vetores \n" +
                "2. Listar Vetores \n" +
                "3. Imprime Maior Número\n" +
                "4. Imprime Quantidade de Números Perfeitos\n" +      //gerar vetor de numeros perfeitos
                "5. imprime quantidades de números primos \n" +
                "6. Imprime Elementos Acima da Média \n" +
                "7. Gerar Vetor Diferença \n" +
                "8. Gerar vetor números perfeitos \n" +
                "9. Sair \n");
             System.out.println("======ESCOLHA AS OPÇÇÕES!!======");
             opcao = ler.nextByte();
             switch (opcao) {
                case 1:
                    do {
                        System.out.println("insira o primeiro valor do primeiro vetor:(máximo 50) ");
                        qtd1 = ler.nextInt();
                    } while (qtd1 <= 0 | qtd1 > 50);
                    for (int i = 0; i < qtd1; i++) {
                        System.out.print("entre com o elementos do indice " + i + " do primeiro vetor: ");
                        v1[i] = ler.nextInt();
                    }
                    do {
                        System.out.println("insira o segundo valor do segundo vetor:(máximo 50) ");
                        qtd2 = ler.nextInt();
                    } while (qtd2 <= 0 | qtd2 > 50);
                    for (int i = 0; i < qtd2; i++) {
                        System.out.print("entre com o elementos do indice " + i + " do segundo vetor: ");
                        v2[i] = ler.nextInt();
                    }
                    System.out.println("VETORES PREENCHIDOS!!");
                    break;
                case 2:
                    for (int i = 0; i < qtd1; i++) {
                        System.out.print(v1[i] + " | ");
                        System.out.print("\n");
                    }
                    for (int i = 0; i < qtd2; i++) {
                        System.out.print(v2[i] + " | ");
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    maior = v1[0];
                    for (int i = 1; i < qtd1 ; i++) {
                        if(v1[i] > maior){
                          maior = v1[i];
                        }
                    }
                    System.out.println("o maior numero do primeiro vetor é: " + maior);
                    maior = v2[0];
                    for (int i = 1; i < qtd2 ; i++) {
                        if(v2[i] > maior){
                            maior = v2[i];
                        }
                    }
                    System.out.println("o maior numero do segundo vetor é: " + maior);
                    break;
                 case 4:
                     for (int i = 0; i < qtd1; i++) {
                         somaDivisores = 0;
                        for(int j = 1; j < qtd1; j++){
                            if(v1[i] % j == 0){
                                somaDivisores = somaDivisores + j;
                            }
                        }
                         if(somaDivisores == v1[i]) {
                             qtd_perfeitos++;
                         }
                     }
                     for (int i = 0; i < qtd2; i++) {
                         somaDivisores = 0;
                         for(int j = 1; j < qtd2; j++){
                             if(v2[i] % j == 0){
                                 somaDivisores = somaDivisores + j;
                             }
                         }
                         if(somaDivisores == v2[i]) {
                             qtd_perfeitos++;
                         }
                     }
                     System.out.println("quantidade de numeros perfeitos é: " + qtd_perfeitos);
                    break;
                 case 5:
                   int qtdprimos = 0;
                     for (int i = 0; i < qtd1; i++) {
                         if(v1[i] > 0){
                         int cont = 0;
                             for (int j = 1; j < v1[i]; j++) {
                                 if(v1[i] % j == 0){
                                     cont++;
                                 }
                             }
                             if(cont == 2){
                                 qtdprimos++;
                             }
                         }
                     }
                     for (int i = 0; i < qtd2; i++) {
                         if(v2[i] > 0){
                             int cont = 0;
                             for (int j = 1; j < v2[i]; j++) {
                                 if(v2[i] % j == 0){
                                     cont++;
                                 }
                             }
                             if(cont == 2){
                                 qtdprimos++;
                             }
                         }
                     }
                     System.out.println("Quantidade de números primos nos vetores é: " + qtdprimos);
                    break;
                 case 6:
                     int soma1 = 0;
                     float media1 = 0;
                     for (int i = 0; i < qtd1; i++) {
                         soma1 = soma1 + v1[i];
                     }
                     System.out.println(soma1);
                     media1 = soma1/qtd1;
                     System.out.println("a média do vetor 1 é: " + media1);
                     for(int i = 0; i < qtd1; i++){
                         if(media1 < v1[i]) {
                             System.out.print(v1[i] + " | ");
                         }
                     }

                     int soma2 = 0;
                     float media2 = 0;
                     for (int i = 0; i < qtd2; i++) {
                         soma2 = soma2 + v2[i];
                     }
                     System.out.println(soma2);
                     media2 = soma2/qtd2;
                     System.out.println("a média do vetor 2 é: " + media2);
                     for (int i = 0; i < qtd1; i++) {
                        if(media2 < v2[i]) {
                            System.out.print(v2[i] + " | ");
                         }
                     }
                 break;
                 case 7:
                     int l = 0;
                     boolean existe = false;
                     for (int i = 0; i < qtd1; i++) {
                         existe = false;
                         for (int j = 0; j < qtd2; j++) {
                             if (v1[i] == v2[j]) {
                                 existe = true;
                             }
                         }
                         if (!existe) {
                             vr[l] = v1[i];
                             System.out.print(vr[l] + " | ");
                         }
                     }

                 break;
                 case 8:
                     int p = 0;
                     for (int m = 0; m < qtd1; m++) {
                         int somadivisores = 0;
                         for (int n = 1; n < v1[m] ; n++) {
                             if(v1[m] % n == 0) {
                                 somadivisores += n;

                             }
                         }
                         if(v1[m] == somadivisores){
                             existe = false;
                             for (int k = 0; k < p; k++) {
                                 if(vetorperfeito[k] == v1[m]){
                                     existe = true;
                                     break;
                                 }
                             }
                             if(!existe){
                                 vetorperfeito[p] = v1[m];
                                 p++;
                             }
                         }
                     }
                     for (int m = 0; m < qtd2; m++) {
                         int somadivisores = 0;
                         for (int n = 1; n < v2[m]; n++) {
                             if(v2[m] % n == 0){
                                 somadivisores += n;
                             }
                         }
                         if(v2[m] == somadivisores){
                             existe = false;
                             for (int k = 0; k < p; k++) {
                                 if(vetorperfeito[k] == v2[m]){
                                     existe = true;
                                     break;
                                 }
                             }
                             if(!existe){
                                 vetorperfeito[p] = v2[m];
                                 p++;
                             }
                         }
                     }
                     System.out.println("vetor com números perfeitos:" );
                     for (int m = 0; m < p; m++) {
                         System.out.println(vetorperfeito[m] + "  ");
                     }
                     break;
                 case 9:
                     System.out.println("SAINDO...");
                     break;
                 default:
                     System.out.println("OPÇÃO INVÁLIDA!!");
            }
        }while (opcao != 9);
     }
}