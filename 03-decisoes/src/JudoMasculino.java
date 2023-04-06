import java.util.Scanner;
public class JudoMasculino {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("JUDO MASCULINO\nQual o peso do atleta em Kg? ");
      double peso = in.nextDouble();
      System.out.print ("Categoria: ");
      if ( peso <= 55.0 ) { System.out.println("Superligeiro"); }
      else if ( peso <= 60.0 ) { System.out.println("Ligeiro"); }
      else if ( peso <= 66.0 ) { System.out.println("Meio-leve"); }
      else if ( peso <= 73.0 ) { System.out.println("Leve"); }
      else if ( peso <= 81.0 ) { System.out.println("Meio-médio"); }
      else if ( peso <= 90.0 ) { System.out.println("Médio"); }
      else if ( peso <= 100.0 ) { System.out.println("Meio-pesado"); }
      else { System.out.println("Pesado"); }
      in.close();
   }
}
