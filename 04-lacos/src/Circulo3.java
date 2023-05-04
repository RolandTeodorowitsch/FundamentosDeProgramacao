import java.util.Scanner;
/**
   Programa que lê o raio de um círculo e mostra a sua área e a sua circunferência,
   repetindo esses passos enquanto o raio lido for maior do que zero.
*/
public class Circulo3 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int i = 0;
      System.out.print("Raio do círculo? ");
      double raio = in.nextDouble();
      while ( raio > 0.0 ) {
            double area = Math.PI * raio * raio;
            System.out.printf("Área=%f\n", area);
            double circ = 2.0 * Math.PI * raio;
            System.out.printf("Circunferência=%f\n", circ);
            System.out.print("Raio do círculo? ");
            raio = in.nextDouble();  // raio NÃO deve ser redeclarado!
      }
   }
}
