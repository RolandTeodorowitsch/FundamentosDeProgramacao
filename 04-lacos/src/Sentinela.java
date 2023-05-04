import java.util.Scanner;
/**
   Este programa imprime a média de um conjunto de salários terminados com um valor de sentinela.
   Adaptado de Horstmann (2013, p. 158-159).
*/
public class Sentinela {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      double soma = 0.0, salario = 0.0;
      int numSalarios = 0;
      System.out.print("Forneça um conjunto de salários (use -1 para terminar): ");
      while (salario != -1) { // Processa os dados até encontrar a sentinela
         salario = in.nextDouble();
         if (salario != -1) {
            soma = soma + salario;
            numSalarios++;
         }
      }
      if (numSalarios > 0) { // Cálculo e impressão
         double media = soma / numSalarios;
         System.out.printf("Salario médio: R$%.2f\n", media);
      }
      else { System.out.println("Sem dados..."); }
      in.close();
   }
}

