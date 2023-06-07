/** Classe para contagem de eventos, simulando um dispositivo de contagem. */
public class Contador {
  private int valor;
  public Contador() { valor = 0; }
  public Contador(int v) { valor = v; }
  public int obtemValor() { return valor; }
  public void definevalor(int v) { valor = v; }
  public void zeraValor() { valor = 0; }
  public void incrementaValor() { valor++; }
  public static String info() { return "Contador versão 1.0"; }
}