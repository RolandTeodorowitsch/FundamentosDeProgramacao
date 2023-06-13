/** Classe para contagem de eventos, simulando um dispositivo de contagem.
    @version 3.0 */
class Contador {
  private int valor;
  public Contador() { valor = 0; }
  public Contador(int v) { valor = v; }
  public int obtemValor() { return valor; }
  public void defineValor(int v) { valor = v; }
  public void zeraValor() { valor = 0; }
  public void incrementaValor() { valor++; }
  public static String info() { return "Contador - Versão 3.0"; }
}

/** Classe para testar a classe Contador. */
public class TestaContador {
  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    System.out.println( Contador.info() );
    Contador c1 = new Contador(), c2 = new Contador(100);
    System.out.println( "c1: " + c1.obtemValor() );
    c1.incrementaValor();  System.out.println( "c1: " + c1.obtemValor() );
    for (int i=0; i<23; ++i) c2.incrementaValor();
    System.out.println( "c2: " + c2.obtemValor() );
    Contador c3 = c2;  System.out.println( "c3: " + c3.obtemValor() );
  }
}
