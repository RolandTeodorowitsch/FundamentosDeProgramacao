/**
   Este programa simula o lançamento de um par de dados.
   Adaptado de Horstmann (2013, p. 177).
*/
public class Dados1 {
   public static void main(String[] args) {
      for (int i = 1; i <= 10; i++) {
         // Gera números aleatórios entre 1 e 6
         // usando Math.random()
         int d1 = (int) (Math.random() * 6) + 1;
         int d2 = (int) (Math.random() * 6) + 1;
         System.out.println(d1 + " " + d2);
      }
   }
}

