import java.util.Scanner;
/**  Programa para calcular o desvio padrao de um conjunto de valores. */
public class DesvioPadrao {
  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     final int LIMITE = 100;
     double[] x = new double[LIMITE];
     int n = 0;
     double somatorio = 0.0;
     while ( in.hasNextDouble() && n<LIMITE ) {
           x[n] = in.nextDouble();
           somatorio += x[n];
           n++;
     }
     if ( n == 0 ) { System.out.println("NENHUM valor fornecido..."); System.exit(0); }
     double media = somatorio / n, desvioPadrao = 0.0;
     for (int i=0; i<n; ++i) {
         double dif = media - x[i];
         desvioPadrao += dif*dif;
     }
     desvioPadrao = Math.sqrt( desvioPadrao / n );
     System.out.printf("Media = %.4f\nDesvio Padrao = %.4f\n", media, desvioPadrao );
  }
}	
