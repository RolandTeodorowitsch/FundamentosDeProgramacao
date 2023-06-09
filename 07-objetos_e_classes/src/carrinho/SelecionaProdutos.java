import java.util.Scanner;
/** Este programa testa a classe CarrinhoDeCompras. */
public class SelecionaProdutos {
  /** Mostra um CarrinhoDeCompras.
      @param carrinho Carrinho de compras a ser mostrado. */
  public static void mostra(CarrinhoDeCompras c) {
    System.out.println("+--- Carrinho de Compras");
    for (int i=0; i<c.obtemNumItens(); ++i)
        System.out.println( "| " + (i+1)+") " + c.obtemItem(i) );
    System.out.println("+---");
  }
  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    System.out.println("Comandos: adiciona <nomeDoProduto> ou fim.");
    while ( true ) {
      mostra( carrinho );
      String comando = in.nextLine().trim();
      if ( comando.toLowerCase().equals("fim") ) break;
      else if ( comando.toLowerCase().indexOf("adiciona ") == 0 ) carrinho.adicionaItem( comando.substring(9).trim() );
      else System.out.printf("\nERRO> Comando '%s' inválido!\n\n", comando);
    }
  }
}
