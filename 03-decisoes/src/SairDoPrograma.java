import java.util.Scanner;

public class SairDoPrograma {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Sair do programa (SIM ou NÃO)? ");
      String resposta = in.nextLine().trim().toUpperCase();
      if ( resposta.equals("SIM") ) {
         System.out.println("Saindo do programa...");
         System.exit(0);
      }
      System.out.print("Digite seu nome: ");
      String nome = in.nextLine().trim();
      System.out.printf("Bom dia, %s!\n",nome);
      in.close();
   }
}
