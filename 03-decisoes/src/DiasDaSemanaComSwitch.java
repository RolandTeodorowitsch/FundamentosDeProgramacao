import java.util.Scanner;

public class DiasDaSemanaComSwitch {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Digite o valor do dia da semana: ");
      int diaDaSemana = in.nextInt();
      String resultado;
      switch ( diaDaSemana ) {
         case 1:
         case 7:  resultado = "DESCANSO"; break;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:  resultado = "DIA ÚTIL"; break;
         default: resultado = "INVÁLIDO";
      }
      System.out.println(resultado);
      in.close();
   }
}
