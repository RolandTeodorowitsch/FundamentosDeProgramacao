/** Gerencia a movimentação de um inseto em uma grade */
public class Inseto {
  public static final int LESTE = 0, SUL = 1,
                          OESTE = 2, NORTE = 3;
  public static final int LINHAS = 3, COLUNAS = 8;
  private int linha, coluna, direcao;

  public Inseto() {
    linha = coluna = direcao = 0;
  }

  public void anda() {
    switch (direcao) {
      case LESTE: if (coluna < COLUNAS-1) ++coluna; break;
      case OESTE: if (coluna > 0) --coluna; break;
      case SUL: if (linha < LINHAS-1) ++linha; break;
      case NORTE: if (linha > 0) --linha; break;
    }    
  }

  public void gira() {
    if (direcao == NORTE) direcao = LESTE;
    else ++direcao;
  }
}

