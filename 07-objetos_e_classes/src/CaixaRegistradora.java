/** Simula uma caixa registradora, que controla o número de itens e o valor total dos itens registrados.
    Adaptado de HORSTMANN (2013, p. 377). */
public class CaixaRegistradora {
  private int numItens;
  private double total;

  /** Constrói um objeto sem qualquer item registrado. */
  public CaixaRegistradora() { numItens = 0; total = 0.0; }

  /** Adiciona um item na caixa registradora.
      @param preco Preço do item a ser registrado. */
  public void adicionaItem(double preco) {  numItens++; total = total + preco; }

  /** Obtém o valor total de todos os itens registrados.
      @return Valor total de todos os itens registrados. */
  public double obtemTotal() { return total; }

  /** Obtém o número de itens registrados.
      @return Número de itens registrados. */
  public int obtemNumItens() { return numItens; }

  /** Limpa a caixa registradora para iniciar uma nova venda. */
  public void limpa() { numItens = 0; total = 0.0; }
}
