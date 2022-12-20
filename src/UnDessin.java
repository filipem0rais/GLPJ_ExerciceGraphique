//
// Auteur : Filipe Dias Morais
// Projet : ExerciceGraphique
// Date   : 13.12.2022
// 


import javax.swing.*;
import java.awt.*;

public class UnDessin extends JComponent {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        UnDessin unDessin = new UnDessin();
        frame.add(unDessin);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setTitle("UnDessin");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawOval(100, 100, 200, 200);
        g.setColor(Color.magenta);
        g.drawOval(150, 150, 20, 20);
        g.drawOval(250, 150, 20, 20);
        g.setColor(Color.yellow);
        g.drawLine(150, 200, 250, 200);
        g.drawArc(150, 150, 100, 100, 180, 180);
        g.fillArc(150, 150, 100, 100, 180, 180);
    }

}
