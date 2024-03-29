/** Classe para testar a classe Contador. */
public class TestaContador {
  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    System.out.println( Contador.info() );
    Contador c1 = new Contador();
    System.out.println( "c1: " + c1.obtemValor() );
    c1.incrementaValor();
    System.out.println( "c1: " + c1.obtemValor() );
    Contador c2 = new Contador(100);
    for (int i=0; i<11; ++i) c2.incrementaValor();
    System.out.println( "c2: " + c2.obtemValor() );
    Contador c3 = c2;
    System.out.println( "c3: " + c3.obtemValor() );
  }
}
