import java.util.Scanner;

/** Programa que realiza o serviço de caixa registradora para uma fruteira. */
public class Fruteira {
  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Fruteira - " + CaixaRegistradora.info() );
    CaixaRegistradora caixa = new CaixaRegistradora();
    System.out.println("Digite os valores dos itens e FIM para encerrar: ");
    while ( in.hasNextDouble() ) {
        double p = in.nextDouble();
        caixa.adicionaItem( p );
    }
    System.out.println("TOTAL = " + caixa.obtemTotal() );
    System.out.println("ITENS = " + caixa.obtemNumItens() );
  }
}
