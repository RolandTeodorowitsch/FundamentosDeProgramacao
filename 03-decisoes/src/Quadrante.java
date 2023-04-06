import java.util.Scanner;

public class Quadrante {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      double x = in.nextDouble();
      double y = in.nextDouble();
      if ( x == 0.0 ) {
         if ( y == 0.0 ) System.out.println("Origem");
         else            System.out.println("Eixo y");
      }
      else { // x != 0
         if ( x > 0 ) { // 1, Eixo X, 4
            if      ( y > 0.0 )  System.out.println("Quadrante 1");
            else if ( y == 0.0 ) System.out.println("Eixo X");
            else                 System.out.println("Quadrante 4");
         }
         else { // x < 0 ==> 2, Eixo X, 3
            if      ( y > 0.0 )  System.out.println("Quadrante 2");
            else if ( y == 0.0 ) System.out.println("Eixo X");
            else                 System.out.println("Quadrante 3");
         }
      }
      in.close();
   }
}
