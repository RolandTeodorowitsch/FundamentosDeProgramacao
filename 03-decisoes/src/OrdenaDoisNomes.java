import java.util.Scanner;
public class OrdenaDoisNomes {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Nome 1: ");   String nome1 = in.nextLine().trim();
      System.out.print("Nome 2: ");   String nome2 = in.nextLine().trim();
      if ( nome1.compareToIgnoreCase(nome2) < 0 ) {
         System.out.println(nome1);
         System.out.println(nome2);
      }
      else {
         System.out.println(nome2);
         System.out.println(nome1);
      }
      in.close();
   }
}
