import java.util.Scanner;
 /*Faça um algoritmo para ler três valores reais e informar se estes podem ou não formar os lados de
um triângulo e qual tipo de triângulo seria: Equilátero 3 lados iguais, isósceles 2 lados iguais ou Escaleno lados
diferentes*/
public class trangulo10 {
     static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         System.out.println(" entre com os valores de um triangulo: ");
         float a = ler.nextFloat();
         float b = ler.nextFloat();
         float c = ler.nextFloat();
          if(a == b){
              if(b == c){
                  System.out.println("É UM TRIÂNGULO EQUILÁTERO!!");
              }
              if(b != c){
                  System.out.println("É UM TRIÂNGULO ISÓSCELES!!");
              }
          }
         if(a != b) {
             if (b != c) {
                 System.out.println("É UM TRIÂNGULO ESCALENO!!");
             }
         }
     }
}
