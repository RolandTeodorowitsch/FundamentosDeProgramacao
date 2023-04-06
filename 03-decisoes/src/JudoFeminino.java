import java.util.Scanner;
public class JudoFeminino {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("JUDO FEMININO\nQual o peso do atleta em Kg? ");
      double peso = in.nextDouble();
      System.out.print ("Categoria: ");
      if ( peso <= 44.0 ) { System.out.println("Superligeiro"); }
      else if ( peso <= 48.0 ) { System.out.println("Ligeiro"); }
      else if ( peso <= 52.0 ) { System.out.println("Meio-leve"); }
      else if ( peso <= 57.0 ) { System.out.println("Leve"); }
      else if ( peso <= 63.0 ) { System.out.println("Meio-médio"); }
      else if ( peso <= 70.0 ) { System.out.println("Médio"); }
      else if ( peso <= 78.0 ) { System.out.println("Meio-pesado"); }
      else { System.out.println("Pesado"); }
      in.close();
   }
}
