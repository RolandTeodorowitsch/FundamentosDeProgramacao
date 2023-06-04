import java.util.Arrays;

/** Inverte vetores de inteiros. */
public class Inverte {

  /** Inverte um vetor de valores do tipo <code>int</code>.
      @param v Vetor de inteiros a ser invertido. */
  public static void inverte(int[] v) {
    int i = 0, f = v.length-1;
    while ( i < f ) {
          int aux = v[i];  v[i] = v[f];  v[f] = aux;
          ++i;  --f;
    }
  }

  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    int[] v1 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    inverte(v1);
    System.out.println( Arrays.toString(v1) );
    int[] v2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    inverte(v2);
    System.out.println( Arrays.toString(v2) );
  }
}
