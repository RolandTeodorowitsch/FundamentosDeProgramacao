import java.util.Scanner;

public class IguaisOuDiferentes {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Palavra 1? ");
      String palavra1 = in.next();
      System.out.print("Palavra 2? ");
      String palavra2 = in.next();
      if ( palavra1.equals(palavra2) ) {
         System.out.println("IGUAIS");
      }
      else {
         System.out.println("DIFERENTES");
      }
      in.close();
   }
}
