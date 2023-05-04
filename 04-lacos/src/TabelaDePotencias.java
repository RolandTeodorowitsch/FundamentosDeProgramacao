/**
   Este programa imprime uma tabela com as potências de x.
   Adaptado de Horstmann (2013, p. 173-174).
*/
public class TabelaDePotencias {
   public static void main(String[] args) {
      final int NMAX = 4;
      final double XMAX = 10.0;
      // Imprime o cabeçalho da tabela
      for (int n = 1; n <= NMAX; n++) { System.out.printf("%10d", n); }
      System.out.println();
      for (int n = 1; n <= NMAX; n++) { System.out.printf("%10s", "x "); }
      System.out.println();
      // Imprime o corpo da tabela
      for (double x = 1; x <= XMAX; x++) {
         // Imprime uma linha
         for (int n = 1; n <= NMAX; n++) {
             System.out.printf("%10.0f", Math.pow(x, n));
         }
         System.out.println();
      }
   }
}

