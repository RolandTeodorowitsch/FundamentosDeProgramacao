import java.util.Scanner;
/**  Programa para calcular a divisão de despesas de uma festa entre amigos. */
public class DivisaoDeDespesas {
  /**
     Metodo inicial.
     @param args Argumentos da linha de comandos (NÃO utilizado).
  */
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Numero de pessoas? ");                    int numPes = in.nextInt();
     String[] nomes = new String[numPes];                        double[] gastos = new double[numPes];
     double racha = 0.0;
     for (int i=0; i<numPes; ++i) {
         System.out.print("-> Nome? ");                          nomes[i] = in.next();
         System.out.printf("-> Quanto %s gastou? ", nomes[i]);   gastos[i] = in.nextDouble();
         racha += gastos[i];
     }
     racha /= numPes;
     for (int i=0; i<numPes; ++i) {
         double dif = gastos[i] - racha;
         if ( dif == 0.0 ) System.out.printf("%s NAO precisa pagar nada!\n",nomes[i]);
         else if ( dif > 0.0 ) System.out.printf("%s deve receber R$%.2f!\n",nomes[i],dif);
         else System.out.printf("%s deve pagar R$%.2f!\n",nomes[i],-dif);
     }
  }
}	
