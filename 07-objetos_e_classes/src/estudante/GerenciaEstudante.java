import java.util.Scanner;

/** Este programa testa a classe Estudante. */
public class GerenciaEstudante {
  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Estudante estudante = new Estudante(1234,"Fulano de Tal");
    System.out.println("Comandos: nome <novoNome>, matricula <novaMatricula> ou fim.");
    while ( true ) {
      System.out.printf( "[%d] %s\n", estudante.obtemMatricula(), estudante.obtemNome() );
      String comando = in.nextLine().trim();
      if ( comando.toLowerCase().equals("fim") ) break;
      else if ( comando.toLowerCase().indexOf("nome ") == 0 )
         estudante.defineNome( comando.substring(5).trim() );
      else if ( comando.toLowerCase().indexOf("matricula ") == 0 )
         estudante.defineMatricula( Integer.parseInt( comando.substring(10).trim() ) );
      else System.out.printf("\nERRO> Comando '%s' inválido!\n\n", comando);
    }
  }
}
