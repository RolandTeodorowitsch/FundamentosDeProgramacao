import java.util.Scanner;

/** Este programa testa a classe Peixe. */
public class ControlaPeixe {
  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Peixe peixe = new Peixe();
    System.out.println("Comandos: nada, come ou fim.");
    while ( true ) {
      System.out.println( "Nível de fome do peixe: " + peixe.obtemFome() );
      String comando = in.next().trim().toLowerCase();
      if ( comando.equals("fim") ) break;
      else if ( comando.equals("nada") ) peixe.nada();
      else if ( comando.equals("come") ) peixe.come();
      else System.out.printf("\nERRO> Comando '%s' inválido!\n\n", comando);
    }
  }
}
