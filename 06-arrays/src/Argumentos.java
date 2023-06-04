/** Programa que mostra os argumentos da linha de comandos. */
public class Argumentos {

  /**
     Programa principal: mostra os argumentos da linha de comandos.
     @param args Vetor de <code>String</code> com os argumentos fornecidos na linha de comandos. */
  public static void main(String[] args) {
    System.out.println("args.length = " + args.length);
    for (int i=0; i<args.length; ++i) {
        System.out.printf("args[%d] = \"%s\"\n", i, args[i]);
    }
  }

}
