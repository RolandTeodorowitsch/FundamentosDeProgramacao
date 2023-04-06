import java.util.Scanner;
public class Bhaskara {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("a: ");  double a = in.nextDouble();
      System.out.print("b: ");  double b = in.nextDouble();
      System.out.print("c: ");  double c = in.nextDouble();
      if ( a == 0.0 ) { System.out.println("NAO eh uma equacao do segundo grau..."); }
      else {
         double delta = b*b - 4*a*c;
         if ( delta < 0.0 ) { System.out.println("NAO ha raizes reais..."); }
         else {
            if ( delta == 0.0 ) {
               double r = -b / (2*a);
               System.out.printf("Raiz: %f\n",r);
            }
            else { // delta > 0.0
               delta = Math.sqrt(delta);
               double r1 = (-b+delta)/(2*a);
               double r2 = (-b-delta)/(2*a);
               System.out.printf("Raizes: %f, %f\n",r1, r2);
            }
         }
      }
      in.close();
   }
}
