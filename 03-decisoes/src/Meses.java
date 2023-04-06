import java.util.Scanner;
public class Meses {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Digite um nome de mês: ");
      String strMes = in.next().toLowerCase();
      int mes;
      if      ( strMes.equals("janeiro") )   { mes =  1; }
      else if ( strMes.equals("fevereiro") ) { mes =  2; }
      else if ( strMes.equals("março") )     { mes =  3; }
      else if ( strMes.equals("abril") )     { mes =  4; }
      else if ( strMes.equals("maio") )      { mes =  5; }
      else if ( strMes.equals("junho") )     { mes =  6; }
      else if ( strMes.equals("julho") )     { mes =  7; }
      else if ( strMes.equals("agosto") )    { mes =  8; }
      else if ( strMes.equals("setembro") )  { mes =  9; }
      else if ( strMes.equals("outubro") )   { mes = 10; }
      else if ( strMes.equals("novembro") )  { mes = 11; }
      else if ( strMes.equals("dezembro") )  { mes = 12; }
      else                                   { mes = -1; }
      System.out.printf("Número do mês = %d\n", mes);
      in.close();
   }
}
