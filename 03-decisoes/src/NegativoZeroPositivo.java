import java.util.Scanner;

public class NegativoZeroPositivo {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Digite um valor real: ");
      double n = in.nextDouble();
      if ( n < 0.0 ) {
         System.out.printf("%f eh NEGATIVO.\n",n);
      }
      else { // n >= 0.0
         if ( n == 0.0 ) {
            System.out.printf("%f eh ZERO.\n",n);
         }
         else { // n > 0.0
            System.out.printf("%f eh POSITIVO.\n",n);
         }
      }
      in.close();
   }
}
