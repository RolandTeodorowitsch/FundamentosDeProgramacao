import java.util.Scanner;
/**
   Este programa simula um painel de elevador que pula o andar 13, verificando erros de digitação.
 */
public class SimuladorDeElevador2 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Andar: ");
      if ( in.hasNextInt() ) {  // hasNextInt() testa se o usuário digitou um valor inteiro
         int andar = in.nextInt();  // nextInt() será executado com a certeza de que há um inteiro válido na entrada
         if (andar == 13) {
            System.out.println("Erro: NÃO há décimo terceiro andar.");
         }
         else if (andar <= 0 || andar > 20) {
            System.out.println("Erro: O número do andar deve variar de 1 a 20.");
         }
         else { // Agora se tem certeza de que o número de andar é válido
            int novoAndar = andar;
            if (andar > 13) { novoAndar = andar - 1; }
            System.out.printf("O elevador se deslocará para o andar real %d.\n", novoAndar);
         }
      }
      else
         System.out.println("Erro: Nenhum valor inteiro encontrado.");
      in.close();
   }
}

