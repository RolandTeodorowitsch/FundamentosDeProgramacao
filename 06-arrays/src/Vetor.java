import java.util.Scanner;
import java.io.PrintStream;
/** Biblioteca de metodos para vetores de inteiros.
    @author Roland Teodorowitsch
    @version 22 maio 2023 */
public class Vetor {
    public static void   le          (Scanner in, int [] v)             { le(in,v,v.length); }
    public static void   le          (Scanner in, int [] v, int t)      { /* implementar */ }
    public static void   imprime     (PrintStream out, int [] v)        { imprime(out,v,v.length); }
    public static void   imprime     (PrintStream out, int [] v, int t) { /* implementar */ }
    public static void   preenche    (int[] v, int n)                   { preenche(v,v.length,n); }
    public static void   preenche    (int[] v, int t, int n)            { /* implementar */ }
    public static long   soma        (int[] v)                          { return soma(v,v.length); }
    public static long   soma        (int[] v, int t)                   { return 0L; /* substituir */ }
    public static double media       (int[] v)                          { return media(v,v.length); }
    public static double media       (int[] v,int t)                    { return 0.0; /* substituir */ }
    public static int    menor       (int[] v)                          { return menor(v,v.length); }
    public static int    menor       (int[] v, int t)                   { return -1; /* substituir */ }
    public static int    maior       (int[] v)                          { return maior(v,v.length); }
    public static int    maior       (int[] v, int t)                   { return -1; /* substituir */ }
    public static int    buscaLinear (int[] v, int n)                   { return buscaLinear(v,v.length,n); }
    public static int    buscaLinear (int[] v, int t, int n)            { return -1; /* substituir */ }
    public static int    conta       (int[] v, int n)                   { return conta(v,v.length,n); }
    public static int    conta       (int[] v, int t, int n)            { return -1; /* substituir */ }
}
