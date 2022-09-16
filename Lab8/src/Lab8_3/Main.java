package Lab8_3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab8_3");
		frame.setSize(250,300);
		frame.setVisible(true);
		frame.setEnabled(true);
		JPanel center = new JPanel();
		
		//JButton1
		JButton jb1 = new JButton("+");
		center.add(jb1); //เพิ่มปุ่ม
		
		//JLabel
		JLabel lb = new JLabel();
		center.add(lb);
		
		//JButton2
		JButton jb2 = new JButton("-");
		center.add(jb2); //เพิ่มปุ่ม
		
		//Frame
		frame.getContentPane().add(center,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Add");
			}
		});
		
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Minus");
			}
		});

	}

}
