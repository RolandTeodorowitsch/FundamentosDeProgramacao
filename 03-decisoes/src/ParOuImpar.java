import java.util.Scanner;

public class ParOuImpar {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Digite um valor inteiro: ");
      int n = in.nextInt();
      String res;
      if (n % 2 == 1) {
         res = "IMPAR";
      }
      else {
         res = "PAR";
      }
      System.out.printf("%d eh %s!\n",n,res);
      in.close();
   }
}
