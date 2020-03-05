package day3GrundlagenGuis;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ErstesFrame

{

	public static void main(String[] args) 
	{

		JFrame x = new JFrame("BoB");
		JPanel y = new JPanel(new GridLayout(10, 10));
		x.add(y);

		for (int i = 0; i < 100; i++) 
		{
			JButton j = new JButton(i + "");
			y.add(j);
			j.addActionListener(new ActionListener() 
			{

				@Override
				public void actionPerformed(ActionEvent e) 
				{
//					System.out.println("Hallo Welt");

				}
			});
			j.addMouseListener(new MouseListener() 
			{

				@Override
				public void mouseReleased(MouseEvent e) {
					System.out.println("Dankeschön");
//					Matrix.this.x.setLocation(70, 100);
//					Matrix.this.y.setText("Hallo");

				}

				@Override
				public void mousePressed(MouseEvent e) {
					System.out.println("Lass los, du Irrer!");
					

				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub

				}
			});
		}

//	y.add(j);
		x.pack();
		x.setLocation(500, 400);
		x.setVisible(true);

	}

}
