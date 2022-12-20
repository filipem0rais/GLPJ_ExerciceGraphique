//
// Auteur : Filipe Dias Morais
// Projet : ExerciceGraphique
// Date   : 13.12.2022
// 


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VariCamembert extends JComponent implements ActionListener {

    private int i;
    private int i1;
    private int i2;

    private JButton red;
    private JButton blue;
    private JButton green;

    public VariCamembert(int i, int i1, int i2) {
        this.i = i;
        this.i1 = i1;
        this.i2 = i2;

        setLayout(new FlowLayout());
        red = new JButton("Red");
        add(red);
        red.addActionListener(this);

        green = new JButton("Green");
        add(green);
        green.addActionListener(this);

        blue = new JButton("Blue");
        add(blue);
        blue.addActionListener(this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        VariCamembert camembert = new VariCamembert(200, 100, 50);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) {
            i += 10;
            repaint();
        }
        if (e.getSource() == blue) {
            i1 += 10;
            repaint();
        }
        if (e.getSource() == green) {
            i2 += 10;
            repaint();
        }
    }
}

