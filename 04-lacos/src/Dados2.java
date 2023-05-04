import java.util.Random;

/** Este programa simula o lançamento de um par de dados. */
public class Dados2 {
   public static void main(String[] args) {
      Random r = new Random();
      for (int i = 1; i <= 10; i++) {
         // Gera números aleatórios entre 1 e 6
         // usando o método nextInt() da classe Random	
         int d1 = r.nextInt(6)+1;
         int d2 = r.nextInt(6)+1;
         System.out.println(d1 + " " + d2);
      }
   }
}

