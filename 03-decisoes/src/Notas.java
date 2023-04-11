import java.util.Scanner;

public class Notas {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("P1? "); double p1 = in.nextDouble();
      System.out.print("P2? "); double p2 = in.nextDouble();
      System.out.print("ME? "); double me = in.nextDouble();
      System.out.print("TF? "); double tf = in.nextDouble();
      double g1 = (p1 + 2*p2 + me + 2*tf) / 6.0;
      if (g1 >= 7.0) { System.out.printf("G1=%.1f APROVADO\n",g1); }
      else if (g1 >= 4.0) { 
         double g2Minimo = 10.0 - g1;
         System.out.printf("G1=%.1f ALUNO EM G2 (G2>=%.1f)\n", g1, g2Minimo);
      }
      else { System.out.printf("G1=%.1f REPROVADO\n",g1); }
      in.close();
   }
}
