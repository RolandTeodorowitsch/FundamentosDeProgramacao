import java.util.Scanner;

public class ClassificacaoComSwitch {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Código do produto? ");
      int codigo = in.nextInt();
      String classificacao = "";
      switch(codigo) {
         case 1:  classificacao = "Alimento não perecível"; break;
         case 2:
         case 3:
         case 4:  classificacao = "Alimento perecível"; break;
         case 5:
         case 6:  classificacao = "Vestuário"; break;
         case 7:  classificacao = "Higiene pessoal"; break;
         default: classificacao = "Inválido";
      }
      System.out.printf("Classificacao: %s\n", classificacao);
   }
}
