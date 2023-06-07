/** Classe para contagem de eventos, simulando um dispositivo de contagem.
    @version 2.0 */
public class Contador {
  private int valor;

  /** Construtor que inicializa o valor com 0. */	
  public Contador() { valor = 0; }

  /** Construtor que inicializa o valor com um valor específico.
      @param v Valor inicial do contador que será criado. */
  public Contador(int v) { valor = v; }

  public int obtemValor() { return valor; }
  public void incrementaValor() { valor++; }
}
