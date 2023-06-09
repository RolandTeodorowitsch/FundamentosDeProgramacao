import java.util.Scanner;

/** Este programa testa a classe ContaBancaria. */
public class GerenciaContaBancaria {
  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ContaBancaria conta = new ContaBancaria(1234,"Fulano de Tal");
    System.out.println("Comandos: deposita <valor>, saca <valor> ou fim.");
    while ( true ) {
      System.out.printf( "[%d] %s => R$%.2f\n", conta.obtemNumero(), conta.obtemTitular(), conta.obtemSaldo() );
      String comando = in.next().trim().toLowerCase();
      if ( comando.equals("fim") ) break;
      else if ( comando.equals("deposita") ) {
         if ( in.hasNextDouble() ) conta.deposita( in.nextDouble() );
         else System.out.printf("\nERRO> Comando 'depositar' usado com valor inválido ('%s')!\n\n", in.next());
      }
      else if ( comando.equals("saca") ) {
         if ( in.hasNextDouble() ) conta.saca( in.nextDouble() );
         else System.out.printf("\nERRO> Comando 'sacar' usado com valor inválido ('%s')!\n\n", in.next());
      }
      else System.out.printf("\nERRO> Comando '%s' inválido!\n\n", comando);
    }
  }
}
