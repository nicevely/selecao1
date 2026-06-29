import java.util.Scanner;
public class menusoma {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetorA = new int[50];
        int[] vetorB = new int[50];
        int qtdA = 0;
        int qtdB = 0;
        byte opcao;
        int somaA = 0;
        int somaB = 0;
        int num;
        boolean existe = false;
        do{
            System.out.println("=========MENU=========");
            System.out.print("1.Iserir os vetores \n" +
                             "2.Exibir os vetores \n" +
                             "3.somar os elementos dos vetores \n" +
                             "4.Verificar se um número existe nos vetores \n" +
                             "5.mostrar os números pares e ímpares \n" +
                             "6.mostrar a média dos vetores \n" +
                             "7.sair \n" );
            System.out.println("========ESCOLHA UMA OPÇÃO=========");
        opcao = ler.nextByte();
       switch (opcao){
           case 1:
               do{
                   System.out.println("entre com a quantidade do primeiro vetor: (máx 50)");
                   qtdA = ler.nextInt();
               }while(qtdA <= 0 || qtdA > 50);
                   for (int i = 0; i < qtdA; i++) {
                       System.out.println("entre com os indices do vetor A: " + i);
                       vetorA[i] = ler.nextInt();
                   }
               do{
                   System.out.println("entre com a quantidade do segundo vetor: (máx 50)");
                   qtdB = ler.nextInt();
               }while(qtdB <= 0 || qtdB > 50);
                   for (int i = 0; i < qtdB; i++) {
                       System.out.println("entre com os indices do vetor B: " + i);
                       vetorB[i] = ler.nextInt();
                   }
               break;
           case 2:
               for (int i = 0; i < qtdA; i++) {
                   System.out.print(vetorA[i] + "  \n");
               }
               for (int i = 0; i < qtdB; i++) {
                   System.out.print(vetorB[i] + "  \n");
               }
               break;
           case 3:
               for (int i = 0; i < qtdA; i++) {
                  somaA = somaA + vetorA[i];
               }
               System.out.println("===== O valor da SOMA A: " + somaA + " =====");

               for (int i = 0; i < qtdB; i++) {
                   somaB = somaB + vetorB[i];
               }
               System.out.println("===== O valor da SOMA B: " + somaB + " =====");
               break;
           case 4:
               System.out.println("Usuário, digite um número: ");
               num = ler.nextInt();
               for (int i = 0; i < qtdA; i++) {
                  if(num == vetorA[i]){
                      num = vetorA[i];
                      existe = true;
                  }
               }
               if(existe){
                   System.out.println("esse NÚMERO EXISTE no vetor A!! ");
               } else{
                   System.out.println("esse NÚMERO NÃO EXISTE no vetor A!! ");
               }

               System.out.println("Usuário, digite um número: ");
               num = ler.nextInt();
               for (int i = 0; i < qtdB; i++) {
                   if(num == vetorB[i]){
                       num = vetorB[i];
                       existe = true;
                   }
               }
               if(existe){
                   System.out.println("esse NÚMERO EXISTE no vetor B!! ");
               } else{
                   System.out.println("esse NÚMERO NÃO EXISTE no vetor B!! ");
               }
               break;
           case 5:
               int numparA = 0;
               int numimparA = 0;
               for (int i = 0; i < qtdA; i++) {
                  if(vetorA[i] % 2 == 0) {
                     numparA = vetorA[i];
                     System.out.println("números pares A: " + numparA);
                  }
                  if(vetorA[i] % 2 != 0){
                    numimparA = vetorA[i];
                      System.out.println("números impares A: " + numimparA);
                  }
               }
               int numparB = 0;
               int numimparB = 0;
               for (int i = 0; i < qtdB; i++) {
                   if(vetorB[i] % 2 == 0) {
                       numparB = vetorB[i];
                       System.out.println("números pares B: " + numparB);
                   }
                   if(vetorB[i] % 2 != 0){
                       numimparB = vetorB[i];
                       System.out.println("números impares B: " + numimparB);
                   }
               }
               break;
           case 6:
              float mediaA = 0;
              mediaA = somaA/qtdA;
              System.out.println("A MÉDIA DO VETOR A É: " + mediaA);

               float mediaB = 0;
               mediaB = somaB/qtdB;
               System.out.println("A MÉDIA DO VETOR b É: " + mediaB);
              break;
           case 7:
               System.out.println("SAINDO...");
              break;
           default:
               System.out.println("opção inválida!!");
       }
        }while(opcao != 7);
    }
}
