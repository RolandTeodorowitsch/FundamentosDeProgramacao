import java.util.Scanner;
/** Lê valores inteiros, mostrando-os e marcando o maior valor lido. Adaptado de: Horstmann (2013, p. 265-266). */
public class MaiorDoVetor {
  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    double[] valores = new double[100];
    int tamanhoAtual = 0;
    // Le entradas
    System.out.println("Digite os valores, T para terminar:");
    Scanner in = new Scanner(System.in);
    while (in.hasNextDouble() && tamanhoAtual < valores.length) {
          valores[tamanhoAtual] = in.nextDouble();
          tamanhoAtual++;
    }
    // Encontra o maior valor
    double maior = valores[0];
    for (int i = 1; i < tamanhoAtual; i++)
        if (valores[i] > maior)  maior = valores[i];
    // Imprime os valores, marcando o maior valor
    for (int i = 0; i < tamanhoAtual; i++) {
        System.out.print(valores[i]);
        if (valores[i] == maior) System.out.print(" <== maior valor");
        System.out.println();
    }
  }
}

