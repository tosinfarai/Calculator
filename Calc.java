import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Calc extends JFrame{
	
	private JButton toAdd = new JButton ("+");
	private JButton toSubtract = new JButton ("-");
	private JButton toMultiply = new JButton ("*");
	private JButton toDivide = new JButton ("/");
	
	private JTextField t1 = new JTextField ("Insert 1st num");
	private JTextField t2 = new JTextField ("Insert 2nd num");
	private JTextField t3 = new JTextField ();
	
	public Calc() {
		setTitle ("Calculation");
		setSize (300,300);
		setLocation (new Point (300,200));
		setLayout (null);
		setResizable (false);
		
		initComponents();
		initEvents();
	}
	
	private void initComponents() {
		toAdd.setBounds(25, 50, 50, 50);
		toSubtract.setBounds(75, 50, 50, 50);
		toMultiply.setBounds(25, 100, 50, 50);
		toDivide.setBounds(75, 100, 50, 50);
		
		t1.setBounds(150, 50, 100, 25);
		t2.setBounds(150, 100, 100, 25);
		t3.setBounds(150, 150, 100, 25);
		
		add(toAdd);
		add(toSubtract);
		add(toMultiply);
		add(toDivide);
		
		add(t1);
		add(t2);
		add(t3);
	}
	
private void initEvents () {
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
		
		toSubtract.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				toSubtractClick (e);
			}
		});
		
		toAdd.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				toAddClick (e);
			}
		});
		
		toMultiply.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				toMultiplyClick (e);
			}
		});
		
		toDivide.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				toDivideClick (e);
			}
		});
	}
	
	private void toSubtractClick (ActionEvent evt) {
		Integer x,y,z;
		try {
			x = Integer.parseInt(t1.getText());
			y = Integer.parseInt(t2.getText());
			z = x - y;
			t3.setText(z.toString());
			
		}catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,
					e.toString(),
					"Error",
					JOptionPane.ERROR_MESSAGE);		
		}
	}
		
	private void toAddClick (ActionEvent evt) {
		Integer x,y,z;
		try {
			x = Integer.parseInt(t1.getText());
			y = Integer.parseInt(t2.getText());
			z = x + y;
			t3.setText(z.toString());
			
		}catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,
					e.toString(),
					"Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void toMultiplyClick (ActionEvent evt) {
		Integer x,y,z;
		try {
			x = Integer.parseInt(t1.getText());
			y = Integer.parseInt(t2.getText());
			z = x * y;
			t3.setText(z.toString());
			
		}catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,
					e.toString(),
					"Error",
					JOptionPane.ERROR_MESSAGE);		
		}
	}
	
	private void toDivideClick (ActionEvent evt) {
		Integer x,y,z;
		try {
			x = Integer.parseInt(t1.getText());
			y = Integer.parseInt(t2.getText());
			z = x / y;
			t3.setText(z.toString());
			
		}catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,
					e.toString(),
					"Error",
					JOptionPane.ERROR_MESSAGE);		
		}
	}

}
