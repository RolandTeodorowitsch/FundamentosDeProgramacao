/** Simula uma caixa registradora simples.
    @version 0.0 */
public class CaixaRegistradora {
  private double total;

  public void adicionaItem(double preco) {
    total += preco;
  }

  public void limpa() {
    total = 0;
  }

  public double obtemTotal() {
    return total;
  }
}
