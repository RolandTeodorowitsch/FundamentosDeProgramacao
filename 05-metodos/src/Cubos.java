/** Este programa calcula o volume de dois cubos. Adaptado de: Horstmann (2013, p. 206). */
public class Cubos {

   /** Calcula o volume de um cubo.
       @param lado Comprimento do lado do cubo.
       @return O volume do cubo. */
   public static double volumeCubo(double lado) {
      double volume = lado * lado * lado;
      return volume;
   }

   /** Programa principal para realizar o cálculo do volume de dois cubos.
       @param args Argumentos da linha de comando (NÃO utilizados). */
   public static void main(String[] args) {
      double lado1 = 2.0,  volume1 = volumeCubo(lado1);
      double lado2 = 10.0, volume2 = volumeCubo(lado2);
      System.out.printf("Um cubo com lado %.1f tem volume %.1f.\n",lado1,volume1);
      System.out.printf("Um cubo com lado %.1f tem volume %.1f.\n",lado2,volume2);
   }
}

