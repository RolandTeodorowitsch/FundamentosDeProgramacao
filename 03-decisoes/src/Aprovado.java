import java.util.Scanner;
import java.util.Locale;

public class Aprovado {
   public static void main(String[] args) {
      Locale.setDefault(Locale.ENGLISH);
      Scanner in = new Scanner(System.in);
      System.out.print("g1: ");
      double g1 = in.nextDouble();
      if (g1 >= 7.0) {
         System.out.println("Aprovado");
      }
      in.close();
   }
}
