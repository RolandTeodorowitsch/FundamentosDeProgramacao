import java.util.Scanner;
/** Programa que lê o raio de 10 círculos e mostra a área e a circunferência de cada círculo. */
public class Circulo1 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int i = 0;          // Variável de controle/indução inicializada fora do laço
      while ( i < 10 ) {  // Teste para verificar se os comandos ainda devem ser executados
            System.out.print("Raio do círculo? ");    double raio = in.nextDouble();
            double area = Math.PI * raio * raio;      System.out.printf("Área=%f\n", area);
            double circ = 2.0 * Math.PI * raio;       System.out.printf("Circunferência=%f\n", circ);
            i = i + 1;    // Atualização da variável de controle
      }
   }
}
