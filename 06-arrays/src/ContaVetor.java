import java.util.Arrays;
/** Conta quantas vezes um vetor aparece dentro de outro. */
public class ContaVetor {
  /** Conta quantas vezes um vetor de valores do tipo <code>int</code> está contido em outro vetor de <code>int</code>.
      @param v1 Vetor de inteiros dentro do qual o segundo vetor será procurado e contado.
      @param v2 Vetor de inteiros a ser procurado e contado dentro do primeiro vetor.
      @return Número de vezes que o segundo vetor aparece dentro do primeiro vetor. */
  public static int conta(int[] v1, int[] v2) {
    int t1 = v1.length, t2 = v2.length, res = 0;
    if ( t2  > t1 ) return res;
    for (int i1=0; i1 < t1-t2+1; ++i1) {
        boolean achou = true;
        for (int i2=0; i2 < t2; ++i2)
            if ( v1[i1+i2] != v2[i2] ) { achou = false; break; }
        if ( achou ) ++res;
    }
    return res;
  }
  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    int[] vet1 = { 1, 2, 3, 4, 5, 2, 3, 4, 5, 3, 4, 6 }, vet2 = { 3, 4, 5 }, vet3 = { 3, 5 };
    System.out.println ( conta(vet1, vet2) );
    System.out.println ( conta(vet1, vet3) );
  }
}
