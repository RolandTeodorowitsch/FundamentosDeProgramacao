import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

/** Este programa desenha duas linhas de quadrados. */
public class LinhasDeQuadrados {
   public static void draw(Graphics g) {
      final int TAMANHO = 20;
      g.setColor(Color.BLUE);
      int x = 0, y = 0;          // Linha do topo. O canto esquerdo superior tem as coordenadas (0,0)
      for (int i = 0; i < 10; i++) { g.fillRect(x + 2 * TAMANHO * i, y, TAMANHO, TAMANHO); }
      x = TAMANHO; y = TAMANHO;  // Segunda linha, com deslocamento a partir da primeira
      for (int i = 0; i < 10; i++) { g.fillRect(x + 2 * TAMANHO * i, y, TAMANHO, TAMANHO); }
   }

   public static void main(String[] args) {
      JFrame frame = new JFrame();      // O código que implementa o desenho está no método draw
      final int FRAME_WIDTH = 400, FRAME_HEIGHT = 400;
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JComponent component = new JComponent() { public void paintComponent(Graphics graph) { draw(graph); } };
      frame.add(component);
      frame.setVisible(true);
   }
}

