import java.util.Scanner;
/**
   Programa que lê quantos círculos serão processados, e, a seguir,
   lê o raio de cada círculo, calculando a sua área e circunferência.
*/
public class Circulo2 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Número de círculos? ");
      int numCirculos = in.nextInt();
      int i = 0;
      while ( i < numCirculos ) {
            System.out.print("Raio do círculo? ");
            double raio = in.nextDouble();
            double area = Math.PI * raio * raio;
            System.out.printf("Área=%f\n", area);
            double circ = 2.0 * Math.PI * raio;
            System.out.printf("Circunferência=%f\n", circ);
            i = i + 1;
      }
   }
}
