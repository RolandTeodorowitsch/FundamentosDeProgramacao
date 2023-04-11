import java.util.Scanner;

public class Classificacao {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Código do produto? ");
      int codigo = in.nextInt();
      String classificacao = "";
      if (codigo==1) { classificacao = "Alimento não perecível"; }
      else if (codigo==2 || codigo==3 || codigo==4) { classificacao = "Alimento perecível"; }
      else if (codigo==5 || codigo==6) { classificacao = "Vestuário"; }
      else if (codigo==7) { classificacao = "Higiene pessoal"; }
      else { classificacao = "Inválido"; }
      System.out.printf("Classificacao: %s\n", classificacao);
   }
}
