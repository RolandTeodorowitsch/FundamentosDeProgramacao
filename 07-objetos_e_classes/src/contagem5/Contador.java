/** Classe para contagem de eventos, simulando um dispositivo de contagem.
    @version 3.0 */
public class Contador {
  private int valor;
  public Contador() { valor = 0; }
  public Contador(int v) { valor = v; }
  public int obtemValor() { return valor; }
  public void defineValor(int v) { valor = v; }
  public void zeraValor() { valor = 0; }
  public void incrementaValor() { valor++; }
  public static String info() { return "Contador - Versão 3.0"; }
}
