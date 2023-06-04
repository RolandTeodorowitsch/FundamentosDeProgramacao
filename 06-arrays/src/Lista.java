/** Programa que mostra os elementos de uma lista em determinado formato. */
public class Lista {
  /**  Metodo inicial.
       @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    String[] frutas = {"ABACATE", "BANANA", "CARAMBOLA", "FIGO", "JABUTICABA"};
    for (int i=0; i<frutas.length; ++i) {
        if (i > 0) {
           if (i == frutas.length - 1)
              System.out.print(" e ");
           else
              System.out.print(", ");
        }
        System.out.print(frutas[i]);
    }
    System.out.println();
  }
}
