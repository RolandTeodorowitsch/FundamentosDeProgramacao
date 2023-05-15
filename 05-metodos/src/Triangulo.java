public class Triangulo {

   public static void triangulo(int tam) {
       if (tam < 1) return;
       triangulo(tam - 1);
       for (int i = 0; i < tam; i++)
           System.out.print("*");
       System.out.println();
   }

   public static void main(String[] args) {
       triangulo(4);
   }

}
