/**
   Este programa calcula uma estimativa do valor de pi
   simulando o lançamento de dados em um quadrado.
   Adaptado de Horstmann (2013, p. 178-179).
*/
public class MonteCarlo {
   public static void main(String[] args) {
      final int LANCAMENTOS = 10000;
      int acertos = 0;
      for (int i = 1; i <= LANCAMENTOS; i++) {
          // Gera dois números aleatórios entre -1 e 1
          double x = -1 + 2 * Math.random();
          double y = -1 + 2 * Math.random();
          // Verifica se (x,y) estão dentro do círculo unitário
          if (x * x + y * y <= 1)
             acertos++;
      }
      // A razão acertos / LANCAMENTOS é aproximadamente igual a
      // área do círculo / área do quadrado, que é pi/4
      double piEstimado = 4.0 * acertos / LANCAMENTOS;
      System.out.println("Estimativa de pi: " + piEstimado);
   }
}

