import java.util.Scanner;

public class PesoIdeal {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Altura (em m)? ");
      double altura = in.nextDouble();
      System.out.print("Sexo (HOMEM ou MULHER)? ");
      String sexo = in.next().toUpperCase();
      double pesoIdeal;
      if ( sexo.equals("HOMEM") )
         pesoIdeal = (72.7 * altura) - 58.0;
      else
         pesoIdeal = (62.1 * altura) - 44.7;
      System.out.printf("Peso ideal: %.3f Kg\n", pesoIdeal);
      in.close();
   }
}

