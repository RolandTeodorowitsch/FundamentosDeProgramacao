/** Multiplica todos os elementos de um vetor de valores reais por um fator usando um método. */
public class Multiplica {

  /** Multiplicca um vetor de valores reais do tipo <code>double</code> por um fator (também real).
      @param v Vetor de valores <code>double</code>, cujos itens serão alterados.
      @param fator Valor pelo qual cada item do vetor <code>v</code> será multiplicado. */
  public static void multiplica(double[] v, double fator) {
    for (int i=0; i<v.length; ++i) { v[i] *= fator; }
  }

  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    double[] valores = { 21, 48, 63, 30.5, 50, 18.5 };
    multiplica(valores, 10.0);
    for (int i=0; i<valores.length; ++i) { System.out.println( valores[i] ); }
  }
}
