import java.util.Scanner;
import java.util.Locale;

public class AprovadoG2OuReprovado {
   public static void main(String[] args) {
      Locale.setDefault(Locale.ENGLISH);
      Scanner in = new Scanner(System.in);
      System.out.print("g1: ");
      double g1 = in.nextDouble();
      if (g1 >= 7.0) {
         System.out.println("Aprovado");
      }
      else {
         if (g1 >= 4.0)
            System.out.println("G2");
         else
            System.out.println("Reprovado");
      }
      in.close();
   }
}
