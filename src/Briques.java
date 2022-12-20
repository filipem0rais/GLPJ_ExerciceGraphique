//
// Auteur : Filipe Dias Morais
// Projet : ExerciceGraphique
// Date   : 13.12.2022
// 


import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Briques extends JComponent {


       static int WINDOW_HEIGHT = 500;
       static int WINDOW_WIDTH = 500;

        public static void main(String[] args) {
            JFrame frame = new JFrame();
            Briques briques = new Briques();
            frame.add(briques);
            frame.setVisible(true);
            frame.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
            frame.setTitle("Briques");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Dimension size = frame.getSize();
            frame.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    Dimension size = e.getComponent().getSize();
                    WINDOW_WIDTH = size.width;
                    WINDOW_HEIGHT = size.height;
                    frame.repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int nombreLignes = 0;
            int nombreColonnes = 0;

            nombreColonnes = WINDOW_HEIGHT / 20 - 3;
            nombreLignes = WINDOW_WIDTH / 40 - 1;

            for (int i = 0; i < nombreLignes; i++) {
                for (int j = 0; j < nombreColonnes; j++) {
                    g.setColor(Color.black);
                    if (j % 2 == 0) {
                        g.drawRect( 5 +i * 40, 5 + j * 20, 40, 20);
                    } else {
                        g.drawRect(25 + i * 40,  5 + j * 20, 40, 20);
                    }

                }
            }
        }

}
