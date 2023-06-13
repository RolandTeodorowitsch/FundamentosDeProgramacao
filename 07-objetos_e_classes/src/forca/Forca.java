public class Forca {
  private String palavra;
  private char[] incognita;
  private int erros, totalLetras, letrasResolvidas;
  private boolean[] letrasChutadas;
  public static final String[] palavras = { "ADAPTADOR", "ALFABETO", "BIBLIOTECA", "BENCHMARK", "BUFFER", "BIT",
    "BOOT", "BYTE", "CONTEXTO", "LINGUAGEM", "ESCOPO", "PROCESSO", "PROCEDIMENTO", "HARDWARE", "SOFTWARE", "FIRMWARE",
    "INTERFACE", "SOBRECARGA", "SOBRESCRITA", "JAVA","MODELO", "MODELAGEM", "PESQUISA", "PALAVRA", "STRING",
    "CLASSE", "OBJETO", "PROTOCOLO","RECURSIVIDADE", "REGISTRO", "TIPO", "PRIMITIVO", "VALOR" };
  public static String info() { return "Forca - Versão 1.0"; }

  public Forca() {
    palavra = palavras[ (int)(Math.random() * palavras.length) ].toUpperCase();
    erros = letrasResolvidas = 0;
    totalLetras = palavra.length();
    letrasChutadas = new boolean[26];
    incognita = new char[totalLetras];
    for (int i=0; i<totalLetras; ++i) incognita[i] = '_';
  }
  
  public boolean naoTerminou() { return erros < 6 && letrasResolvidas < totalLetras; }
  public String obtemPalavra() { return ( erros == 6 || letrasResolvidas == totalLetras ) ? palavra : "?"; }
  public int obtemErros() { return erros; }
  
  public String mostraIncognita() {
    String res = ""+incognita[0];
    for (int i=1; i<palavra.length(); ++i)
        res += " "+incognita[i];
    return res;
  }

  public boolean chutaLetra(char letra) {
    int indLetra = 0;
    if ( letra>='A' && letra <='Z' ) {
       indLetra = letra - 'A';
    }
    else if ( letra >='a' && letra <='z' ) {
       indLetra = letra - 'a';
    }
    else return false;
    if ( letrasChutadas[indLetra] ) return false;
    letrasChutadas[indLetra] = true;
    int acertos = 0;
    for (int i=0; i<totalLetras; ++i)
        if (letra == palavra.charAt(i)) { ++acertos; incognita[i] = letra; }
    if ( acertos == 0 ) ++erros;
    letrasResolvidas += acertos;
    return true;
  }
  
  public String mostraLetrasChutadas() {
    String res = "";
    for (int i=0; i<letrasChutadas.length; ++i)
        if ( letrasChutadas[i] ) res += (char)('A'+i); else res+= "_";
    return res;
  }
}
