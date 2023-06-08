/** Classe para gerenciar informações de um estudante. */
public class Estudante {
  private int matricula;
  private String nome;

  public Estudante(int m, String n) {
    matricula = m;
    nome = n;
  }

  public int obtemMatricula() { return matricula; }

  public String obtemNome() { return nome; }

  public void defineMatricula(int m) {
    matricula = m;
  }

  public void defineNome(String n) {
    nome = n;
  }
}	
