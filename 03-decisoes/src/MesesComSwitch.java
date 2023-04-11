import java.util.Scanner;
public class MesesComSwitch {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Digite um nome de mês: ");
      String strMes = in.next().toLowerCase();
      int mes;
      switch ( strMes ) {
             case "janeiro":   mes =  1; break;
             case "fevereiro": mes =  2; break;
             case "março":     mes =  3; break;
             case "abril":     mes =  4; break;
             case "maio":      mes =  5; break;
             case "junho":     mes =  6; break;
             case "julho":     mes =  7; break;
             case "agosto":    mes =  8; break;
             case "setembro":  mes =  9; break;
             case "outubro":   mes = 10; break;
             case "novembro":  mes = 11; break;
             case "dezembro":  mes = 12; break;
             default:          mes = -1;
      }
      System.out.printf("Número do mês = %d\n", mes);
      in.close();
   }
}
