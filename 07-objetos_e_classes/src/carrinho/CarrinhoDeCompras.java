/** Gerencia um cacrrinho de compras em uma loja virtual,
    com até 50 itens, usando um vetor parcial. */
public class CarrinhoDeCompras {
  private static final int MAX_ITENS = 10;
  private String[] itens;
  private int numItens;

  public CarrinhoDeCompras() {
    itens = new String[MAX_ITENS];
    numItens = 0;
  }

  public void adicionaItem(String nome) {
    if (numItens < itens.length) {
      itens[numItens] = nome;
      numItens++;
    }
  }

  public int obtemNumItens() { return numItens; }

  public String obtemItem(int i) {
    if (i<0 || i>=numItens) return null;
    return itens[i];
  }
}

