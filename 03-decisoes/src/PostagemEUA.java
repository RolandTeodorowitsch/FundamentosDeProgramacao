import java.util.Scanner;

public class PostagemEUA {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Envio para EUA (S/N)? ");
      String resp = in.next().toUpperCase();
      double custo;
      if (resp.equals("S")) {
         System.out.println("Alaska ou Hawaii (S/N)? ");
         resp = in.next().toUpperCase();
         if (resp.equals("S"))
            custo = 10.0;
         else
            custo = 5.0;
      }
      else
         custo = 20.0;
      System.out.printf("Custo de postagem: $%.2f\n", custo);
      in.close();
   }
}
