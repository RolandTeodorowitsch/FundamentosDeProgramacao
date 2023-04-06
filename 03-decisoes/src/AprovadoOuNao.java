import java.util.Scanner;
import java.util.Locale;

public class AprovadoOuNao {
   public static void main(String[] args) {
      Locale.setDefault(Locale.ENGLISH);
      Scanner in = new Scanner(System.in);
      System.out.print("g1: ");
      double g1 = in.nextDouble();
      if (g1 >= 7.0) {
         System.out.println("Aprovado");
      }
      else {
         System.out.println("G2 ou Reprovado");
      }
      in.close();
   }
}
