/** Classe para contagem de eventos, simulando um dispositivo de contagem.
    @version 1.0 */
public class Contador {
  private int valor;

  /** Construtor que inicializa o valor com 0. */
  public Contador() {      // Faz exatamente o que o construtor padrão
    valor = 0;             // gerado pelo compilador faria.
  }

  public int obtemValor() { return valor; }
  public void incrementaValor() { valor++; }
}
