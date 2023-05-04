import java.util.Scanner;

/**
   Este programa imprime uma tabela mostrando o crescimento anual de um investimento.
*/
public class Investimento {
   public static void main(String[] args) {
      final double TAXA = 5.0;
      final double SALDO_INICIAL = 10000;
      double saldo = SALDO_INICIAL;

      System.out.print("Quantos anos? ");
      Scanner in = new Scanner(System.in);
      int numAnos = in.nextInt();

      for (int ano = 1; ano <= numAnos; ano++) {
         double juros = saldo * TAXA / 100.0;
         saldo = saldo + juros;
         System.out.printf("ano %d: %.2f\n", ano, saldo);
      }
   }
}
