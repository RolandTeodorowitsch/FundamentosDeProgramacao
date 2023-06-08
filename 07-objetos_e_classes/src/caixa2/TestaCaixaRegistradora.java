/** Este programa testa a classe CaixaRegistradora. */
public class TestaCaixaRegistradora {
  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    CaixaRegistradora caixa = new CaixaRegistradora();
    if ( caixa.obtemNumItens()!=0 || caixa.obtemTotal()!=0.0 ) { System.err.println("ERRO"); System.exit(1); }
    caixa.adicionaItem(1.25);
    if ( caixa.obtemNumItens()!=1 || caixa.obtemTotal()!=1.25) { System.err.println("ERRO"); System.exit(1); }
    caixa.adicionaItem(0.65);
    if ( caixa.obtemNumItens()!=2 || caixa.obtemTotal()!=1.9) { System.err.println("ERRO");  System.exit(1); }
    caixa.adicionaItem(2.10);
    if ( caixa.obtemNumItens()!=3 || caixa.obtemTotal()!=4.0) { System.err.println("ERRO");   System.exit(1); }
    caixa.limpa();
    if ( caixa.obtemNumItens()!=0 || caixa.obtemTotal()!=0.0) { System.err.println("ERRO");  System.exit(1); }
    System.out.println( CaixaRegistradora.info() + " [OK]");
  }
}

