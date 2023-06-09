/** Simula o comportamento de um peixe. */
public class Peixe {
  public static final int SEM_FOME        = 0;
  public static final int COM_ALGUMA_FOME = 1;
  public static final int COM_MUITA_FOME  = 2;
  private int fome;

  public Peixe() {
    fome = SEM_FOME;
  }

  public void come() {
    fome = SEM_FOME;
  }

  public void nada() {
    if ( fome < COM_MUITA_FOME )
      fome++;
  }

  public int obtemFome() {
    return fome;
  }
}

