/**
   Calcula o número de anos necessário para dobrar o valor inicial de um investimento.
   Adaptado de Horstmann (2013, p. 143).
*/
public class DobrandoInvestimento {
   public static void main(String[] args) {
      final double TAXA_DE_JUROS = 5.0;
      final double SALDO_INICIAL = 10000.00;
      final double OBJETIVO = 2.0 * SALDO_INICIAL;
      double saldo = SALDO_INICIAL;
      int ano = 0;
      // Conta o número de anos necessários para dobrar o valor inicialmente investido
      while (saldo < OBJETIVO) {
         ano++;
         double juros = saldo * TAXA_DE_JUROS / 100.0;
         saldo = saldo + juros;
      }
      System.out.println("O valor investido dobra após "+ ano + " anos.");
   }
}

