import java.util.Arrays;
/** Gera matrizes transpostas. */
public class Transposta {
  /** Gera a mariz transposta de uma matriz de valores do tipo <code>int</code>.
      @param m Matriz de inteiros original.
      @return Matriz de inteiros correspondente à matriz transposta da matriz original. */
  public static int[][] transposta(int[][] m) {
    int lin_t = m[0].length, col_t = m.length;
    int[][] t = new int[lin_t][col_t];
    for (int i=0; i<lin_t; ++i)
        for (int j=0; j<col_t; ++j)
            t[i][j] = m[j][i];
    return t;
  }

  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    int[][] m1 = { {1,2,3}, {4,5,6} };
    int[][] t1 = transposta(m1);
    System.out.println( Arrays.toString(t1[0]) + "\n" + Arrays.toString(t1[1]) + "\n" + Arrays.toString(t1[2]) );
    int[][] m2 = { {1,5,9}, {2,6,10}, {3,7,11}, {4,8,12} };
    int[][] t2 = transposta(m2);
    System.out.println( Arrays.toString(t2[0]) + "\n" + Arrays.toString(t2[1]) + "\n" + Arrays.toString(t2[2]) );
  }
}
