/**
   Este programa imprime 10 números aleatórios entre 0 e 1.
   Adaptado de Horstmann (2013, p. 176).
*/
public class RandomDemo {
   public static void main(String[] args) {
      for (int i = 1; i <= 10; i++) {
         double r = Math.random();
         System.out.printf("%.20f\n",r);
      }
   }
}
