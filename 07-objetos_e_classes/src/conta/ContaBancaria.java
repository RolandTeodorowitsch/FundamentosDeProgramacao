/** Classe que gerencia uma conta bancária. */
public class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public ContaBancaria(int n, String t, double s) {
    numero = n;  titular = t;  saldo = s;
  }
  public ContaBancaria(int n, String t) {
    numero = n;  titular = t;  saldo = 0.0;
  }
  public int obtemNumero() { return numero; }
  public String obtemTitular() { return titular; }
  public double obtemSaldo() { return saldo; }
  public void defineNumero(int n) { numero = n; }
  public void defineTitular(String t) { titular = t; }
  public void defineSaldo(double s) { saldo = s; }
  public void deposita(double v) { saldo += v; }
  public void saca(double v) {
    if (v < saldo) { saldo -= v; }
    else { saldo = 0.0; }
  }
  public String toString() { return numero + " - " + titular + ": R$"+ saldo; }
  public static String info() { return "ContaBancaria - Versão 1.0"; }
}
