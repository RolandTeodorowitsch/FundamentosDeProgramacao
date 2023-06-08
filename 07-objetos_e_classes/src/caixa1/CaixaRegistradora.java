/** Simula uma caixa registradora.
    @version 1.0 */
public class CaixaRegistradora {
  private int numItens;
  private double total;

  public void adicionaItem(double preco) { 
    numItens++;
    total = total + preco;
  }

  public double obtemTotal() {
    return total;
  }

  public int obtemNumItens() {
    return numItens;
  }

  public void limpa() {
    numItens = 0;
    total = 0.0;
  }
}
