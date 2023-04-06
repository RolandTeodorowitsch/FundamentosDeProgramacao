import java.util.Scanner;
public class DiasDaSemana {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Digite o valor do dia da semana: ");
      int diaDaSemana = in.nextInt();
      String resultado;
      if      ( diaDaSemana == 1 ) { resultado = "DESCANSO"; }
      else if ( diaDaSemana == 2 ) { resultado = "DIA ÚTIL"; }
      else if ( diaDaSemana == 3 ) { resultado = "DIA ÚTIL"; }
      else if ( diaDaSemana == 4 ) { resultado = "DIA ÚTIL"; }
      else if ( diaDaSemana == 5 ) { resultado = "DIA ÚTIL"; }
      else if ( diaDaSemana == 6 ) { resultado = "DIA ÚTIL"; }
      else if ( diaDaSemana == 7 ) { resultado = "DESCANSO"; }
      else                         { resultado = "INVÁLIDO"; }
      System.out.println(resultado);
      in.close();
   }
}
