import java.util.Arrays;
/** Verifica se um vetor de inteiros aparece dentro de outro. */
public class ContemVetor {
  /** Verifica se um vetor de valores do tipo <code>int</code> está contido em outro vetor de <code>int</code>.
      @param v1 Vetor de inteiros dentro do qual o segundo vetor será procurado.
      @param v2 Vetor de inteiros a ser procurado dentro do primeiro vetor.
      @return <code>true</code> se <code>v1</code> contiver <code>v2</code>, ou <code>false</code> em caso contrário. */
  public static boolean contem(int[] v1, int[] v2) {
    int t1 = v1.length, t2 = v2.length;
    if ( t2  > t1 ) return false;
    for (int i1=0; i1 < t1-t2+1; ++i1) {
        boolean achou = true;
        for (int i2=0; i2 < t2; ++i2)
            if ( v1[i1+i2] != v2[i2] ) { achou = false; break; }
        if ( achou ) return true;
    }
    return false;
  }
  /** Metodo inicial.
      @param args Argumentos da linha de comandos (NÃO utilizado). */
  public static void main(String[] args) {
    int[] vet1 = { 1, 2, 3, 4, 5, 2, 3, 4, 5, 3, 4, 6 }, vet2 = { 3, 4, 5 }, vet3 = { 3, 5 };
    if ( contem(vet1, vet2) ) System.out.println ("OK");
    if ( !contem(vet1, vet3) ) System.out.println ("OK");
  }
}
