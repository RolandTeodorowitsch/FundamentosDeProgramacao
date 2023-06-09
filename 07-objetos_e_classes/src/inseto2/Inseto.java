/** Gerencia a movimentação de um inseto em uma grade.
    @version 2.0 */
public class Inseto {
  public static final int LESTE = 0, SUL = 1, OESTE = 2, NORTE = 3;
  public static final int LINHAS = 3, COLUNAS = 8;
  private int linha, coluna, direcao;
  public Inseto() { linha = coluna = direcao = 0; }
  public void anda() {
    switch (direcao) {
      case LESTE: if (coluna < COLUNAS-1) ++coluna; break;
      case OESTE: if (coluna > 0) --coluna; break;
      case SUL: if (linha < LINHAS-1) ++linha; break;
      case NORTE: if (linha > 0) --linha; break;
    }    
  }
  public void gira() { direcao = (direcao + 1) % 4; }
  public String toString() {
    String res = "";
    char[] inseto = { '>', 'v', '<', '^'};
    for (int i=0; i<LINHAS; ++i) {
        for (int j=0; j<COLUNAS; ++j)
            if ( i == linha && j == coluna ) res += inseto[direcao]; else res+= ".";
        res += "\n";
    }
    return res;
  }
}
