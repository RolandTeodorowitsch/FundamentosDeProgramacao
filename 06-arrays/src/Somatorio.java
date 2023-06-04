/** Calcula o somatório de um vetor de valores reais usando um método. */
public class Somatorio {

  /** Calcula o somatório de um vetor de valores reais do tipo <code>double</code>.
      @param vetor Vetor de valores <code>double</code>, cujos itens serão somados. */
  public static double somatorio(double[] vetor) {
    double soma = 0;
    for (int i=0; i<vetor.length; ++i)
        soma += vetor[i];
    return soma;
  }

  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    double[] valores = { 21, 48, 63, 30.5, 50, 18.5 };
    System.out.println( "somatorio = " + somatorio(valores) );
  }
}
