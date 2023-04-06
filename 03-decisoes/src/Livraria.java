import java.util.Scanner;
import java.util.Locale;

public class Livraria {
   public static void main(String[] args) {
      Locale.setDefault(Locale.ENGLISH);
      Scanner in = new Scanner(System.in);
      System.out.print("Preço original: ");
      double precoOriginal = in.nextDouble();
      double taxaDesconto;
      if ( precoOriginal < 128.0 )
         taxaDesconto = 0.92;
      else
         taxaDesconto = 0.84;
      double precoComDesconto = taxaDesconto * precoOriginal;
      System.out.printf("Preço com desconto: %.2f\n", precoComDesconto);
      in.close();
   }
}
