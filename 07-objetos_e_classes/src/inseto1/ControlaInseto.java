import java.util.Scanner;

/** Este programa testa a classe Inseto. */
public class ControlaInseto {
  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Inseto inseto = new Inseto();
    System.out.println("Comandos: gira, anda ou fim.");
    while ( true ) {
      System.out.println( inseto.toString() );
      String comando = in.next().trim().toLowerCase();
      if ( comando.equals("fim") ) break;
      else if ( comando.equals("gira") ) inseto.gira();
      else if ( comando.equals("anda") ) inseto.anda();
      else System.out.printf("\nERRO> Comando '%s' inválido!\n\n", comando);
    }
  }
}
