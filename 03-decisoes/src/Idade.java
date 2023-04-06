import java.util.Scanner;

public class Idade {
   public static void main(String[] args) {
      final int ANO_ATUAL = 2023;
      Scanner in = new Scanner(System.in);
      System.out.print("Ano de nascimento: ");
      int nascimento = in.nextInt();
      int idade = ANO_ATUAL - nascimento;
      System.out.printf("Idade: %d anos em %d\n", idade, ANO_ATUAL);
      if (idade < 16)
         System.out.println("- NÃO pode votar");
      else if (idade < 18 || idade > 70)
         System.out.println("- pode votar");
      else
         System.out.println("- deve votar");
      if (idade >= 18)
         System.out.println("- tem idade para ter Carteira de Motorista");
      else
         System.out.println("- NÃO tem idade para ter Carteira de Motorista");
      in.close();
   }
}
