import java.awt.Graphics;
import javax.swing.*;

public class Hello extends JComponent {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(200,200);
		frame.setTitle("Hello");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Hello hello = new Hello();
		frame.add(hello);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Hello!", 50, 25);
	}

}
