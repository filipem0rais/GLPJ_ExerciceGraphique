import java.awt.Graphics;
import javax.swing.*;

public class Taille extends JComponent {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Taille taille = new Taille();
		frame.add(taille);
		frame.setVisible(true);
		frame.setSize(200,200);
		frame.setTitle("Taille");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString(getWidth() + "/" + getHeight(), 50, 25);
		System.out.println(getWidth() + "/" + getHeight());
	}

}
