import java.util.Scanner;

public class ImpostoEUA {
   public static void main(String[] args) {
      final double PERCENTUAL1 = 0.10, PERCENTUAL2 = 0.25;
      final double LIMITE_SOLTEIRO = 32000, LIMITE_CASAL = 64000;
      Scanner in = new Scanner(System.in);
      System.out.print("Informe a sua renda: ");
      double imposto, renda = in.nextDouble();
      System.out.print("Digite S para solteiro ou C para casado: ");
      String estadoCivil = in.next().toUpperCase();
      if (estadoCivil.equals("S")) {
         if (renda <= LIMITE_SOLTEIRO)
            imposto = PERCENTUAL1 * renda;
         else
            imposto = PERCENTUAL1 * LIMITE_SOLTEIRO + PERCENTUAL2 * (renda - LIMITE_SOLTEIRO);
      }
      else {
         if (renda <= LIMITE_CASAL)
            imposto = PERCENTUAL1 * renda;
         else
            imposto = PERCENTUAL1 * LIMITE_CASAL + PERCENTUAL2 * (renda - LIMITE_CASAL);
      }
      System.out.printf("O imposto é de $%.2f\n", imposto);
      in.close();
   }
}
