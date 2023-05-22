/** Gera um vetor com os quadrados dos números naturais usando um método. */
public class Quadrados {

  /** Gera um vetor com os quadrados naturais de n números, retornando esse vetor.
      @param n Tamanho do vetor gerado, ou seja, número de quadrados gerados. */
  public static int[] quadrados(int n) {
    int[] resultado = new int[n];
    for (int i = 0; i < n; i++)
        resultado[i] = i * i;
    return resultado;
  }

  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    int[] numeros = quadrados(11);
    for (int i=0; i<numeros.length; ++i)
        System.out.println( numeros[i] );
  }
}
