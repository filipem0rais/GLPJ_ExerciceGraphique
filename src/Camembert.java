//
// Auteur : Filipe Dias Morais
// Projet : ExerciceGraphique
// Date   : 13.12.2022
// 


import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Camembert extends JComponent {

    private int i;
    private int i1;
    private int i2;

    public Camembert(int i, int i1, int i2) {
        this.i = i;
        this.i1 = i1;
        this.i2 = i2;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Camembert camembert = new Camembert(200, 100, 50);
        frame.add(camembert);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setTitle("Camembert");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int total = i + i1 + i2;

        g.setColor(Color.red);
        g.drawArc(100, 100, 200, 200, 0, 360 * i / total);
        g.fillArc(100, 100, 200, 200, 0, 360 * i / total);
        g.setColor(Color.blue);
        g.drawArc(100, 100, 200, 200, 360 * i / total, 360 * i1 / total);
        g.fillArc(100, 100, 200, 200, 360 * i / total, 360 * i1 / total);
        g.setColor(Color.green);
        g.drawArc(100, 100, 200, 200, 360 * i / total + 360 * i1 / total, 360 * i2 / total);
        g.fillArc(100, 100, 200, 200, 360 * i / total + 360 * i1 / total, 360 * i2 / total);


    }
}

