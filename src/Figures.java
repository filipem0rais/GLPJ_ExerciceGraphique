import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Figures extends JComponent {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Figures figures = new Figures();
		frame.add(figures);
		frame.setVisible(true);
		frame.setSize(200,300);
		frame.setTitle("Figures");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(30, 30, 80, 40);
		g.drawOval(120, 30, 50, 50);
		g.setColor(Color.black);
		g.fillRect(30, 100, 80, 40);
		g.fillOval(120, 100, 50, 50);
		g.drawLine(30, 160, 130, 170);
		g.drawArc(30, 180, 50, 50, 60, 40);
		g.fillArc(120, 180, 50, 50, 60, 40);
	}
}
