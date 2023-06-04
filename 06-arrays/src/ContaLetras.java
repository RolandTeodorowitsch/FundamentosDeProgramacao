import java.util.Arrays;
/** Contagem de letras em String. */
public class ContaLetras {

  /** Inverte um vetor de valores do tipo <code>int</code>.
      @param s String cujas letras serão verificadas.
      @return Vetor de 26 inteiros, com a contagem de ocorrência das 26 letras do alfabeto no String recebido. */
  public static int[] contaLetras(String s) {
    int[] c = new int[26];
    for (int i=0; i<s.length(); ++i) {
        char car = s.charAt(i);
        if ( car >= 'A' && car <= 'Z')
           c[ car-'A' ]++;
        else if ( car >= 'a' && car <= 'z')
           c[ car-'a' ]++;
    }
    return c;
  }

  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    int[] c1 = contaLetras("BCDEFGHIJKLMNOPQRSTUVWXYZcddeeeffffggggghhhhhhiiiiiiijjjjjjjjkkkkkkkkk");
    System.out.println( Arrays.toString(c1) );
  }
}
