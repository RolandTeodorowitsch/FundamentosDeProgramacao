import java.util.Scanner;
public class App {
  public static void main(String[] args) { 
    String[] enforcado = { "+---+\n|   |\n|\n|\n|\n|\n|\n-------\n///////",
                           "+---+\n|   |\n|   O\n|\n|\n|\n|\n-------\n///////",
                           "+---+\n|   |\n|   O\n|   |\n|   |\n|\n|\n-------\n///////",
                           "+---+\n|   |\n|   O\n|  /|\n|   |\n|\n|\n-------\n///////",
                           "+---+\n|   |\n|   O\n|  /|\\\n|   |\n|\n|\n-------\n///////",
                           "+---+\n|   |\n|   O\n|  /|\\\n|   |\n|  /\n|\n-------\n///////",
                           "+---+\n|   |\n|   O\n|  /|\\\n|   |\n|  / \\\n|\n-------\n///////" };
    Scanner in = new Scanner(System.in);
    System.out.printf("%s\n", Forca.info() );
    Forca jogo = new Forca();
    while ( jogo.naoTerminou() ) {
      System.out.println("\n" + enforcado[jogo.obtemErros()] + "\nPalavra secreta: " + jogo.mostraIncognita() );
      System.out.print("Letras chutadas: "+jogo.mostraLetrasChutadas() + "\nLetra? ");
      String letra = in.next().trim().toUpperCase();
      if ( letra.equals("FIM") ) System.exit(0);
      jogo.chutaLetra( letra.charAt(0) );
    }
    if ( jogo.obtemErros() < 6 ) System.out.println("\nParabéns! Você conseguiu acertar a palavra!");
    else System.out.println("\nQue pena... Infelizmente você NÃO acertou a palavra. Tente novamente!");
    System.out.printf( "Palavra secreta: %s\n", jogo.obtemPalavra() );
    System.out.println( "\n" + enforcado[jogo.obtemErros()] );
  }
}
