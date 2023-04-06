import java.util.Scanner;

/**
   Este programa simula um painel de elevador que pula o andar 13.
*/
public class SimuladorDeElevador {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Andar: ");
      int andar = in.nextInt();
      // Ajusta o andar se for necessário
      int novoAndar;
      if (andar > 13) {
         novoAndar = andar - 1;
      }
      else {
         novoAndar = andar;
      }
      System.out.println("O elevador vai se deslocar até o andar " + novoAndar);
      in.close();
   }
}
