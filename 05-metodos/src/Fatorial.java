public class Fatorial {

   public static long fatorial(int n) {
      long res = 1;
      for (int i=2; i<=n; ++i) res = res * i;
      return res;
   }

   public static long fatorialRec(int n) {
      if (n <= 1) return 1L;
      return n * fatorialRec(n-1);
   }

   public static void main(String[] args) {
      System.out.printf("%d! = %d\n", 5, fatorial(5) );
      System.out.printf("%d! = %d\n", 5, fatorialRec(5) );
   }

}
