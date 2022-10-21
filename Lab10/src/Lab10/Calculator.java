package calc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
	private JButton button_1;
	JPanel panel;
	JTextField tf;
	private double sum=0;
	private String x="";
	private String y="";
	private String op="";
	private String op2="";
	
	
	public Calculator(){
		
		Container pane = getContentPane();
		
		tf = new JTextField();
		Font font = new Font("Cordia New",Font.BOLD,50);
		tf.setFont(font);
		pane.add(tf,BorderLayout.NORTH);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(5,4));
		
		JButton b1 = new JButton("C");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		panel.add(b1);
		b1.addActionListener(this);
		
		JButton b2 = new JButton("CE");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		panel.add(b2);
		b2.addActionListener(this);
		
		JButton b3 = new JButton("/");
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setForeground(Color.white);
		panel.add(b3);
		b3.addActionListener(this);
		
		JButton b4 = new JButton("*");
		b4.setBackground(Color.LIGHT_GRAY);
		b4.setForeground(Color.white);
		panel.add(b4);
		b4.addActionListener(this);
		
		JButton b5 = new JButton("1");
		b5.setBackground(Color.white);
		b5.setForeground(Color.black);
		panel.add(b5);
		b5.addActionListener(this);
		
		JButton b6 = new JButton("2");
		b6.setBackground(Color.white);
		b6.setForeground(Color.black);
		panel.add(b6);
		b6.addActionListener(this);
		
		JButton b7 = new JButton("3");
		b7.setBackground(Color.white);
		b7.setForeground(Color.black);
		panel.add(b7);
		b7.addActionListener(this);
		
		JButton b8 = new JButton("+");
		b8.setBackground(Color.LIGHT_GRAY);
		b8.setForeground(Color.white);
		panel.add(b8);
		b8.addActionListener(this);
		
		JButton b9 = new JButton("4");
		b9.setBackground(Color.white);
		b9.setForeground(Color.black);
		panel.add(b9);
		b9.addActionListener(this);
		
		JButton b10 = new JButton("5");
		b10.setBackground(Color.white);
		b10.setForeground(Color.black);
		panel.add(b10);
		b10.addActionListener(this);
		
		JButton b11 = new JButton("6");
		b11.setBackground(Color.white);
		b11.setForeground(Color.black);
		panel.add(b11);
		b11.addActionListener(this);
		
		JButton b12 = new JButton("-");
		b12.setBackground(Color.LIGHT_GRAY);
		b12.setForeground(Color.white);
		panel.add(b12);
		b12.addActionListener(this);
		
		JButton b13 = new JButton("7");
		b13.setBackground(Color.white);
		b13.setForeground(Color.black);
		panel.add(b13);
		b13.addActionListener(this);
		
		JButton b14 = new JButton("8");
		b14.setBackground(Color.white);
		b14.setForeground(Color.black);
		panel.add(b14);
		b14.addActionListener(this);
		
		JButton b15 = new JButton("9");
		b15.setBackground(Color.white);
		b15.setForeground(Color.black);
		panel.add(b15);
		b15.addActionListener(this);
		
		JButton b16 = new JButton("=");
		b16.setBackground(Color.LIGHT_GRAY);
		b16.setForeground(Color.white);
		panel.add(b16);
		b16.addActionListener(this);
		
		JButton b17 = new JButton("");
		panel.add(b17);
		JButton b18 = new JButton("0");
		b18.setBackground(Color.white);
		b18.setForeground(Color.black);
		panel.add(b18);
		b18.addActionListener(this);
		JButton b19 = new JButton("");
		panel.add(b19);
		JButton b20 = new JButton("");
		panel.add(b20);

		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().add(panel, BorderLayout.CENTER);
	}
	
	public Calculator(String title){
		button_1 = new JButton("1");
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton) e.getSource();
		//tf.setText(jb.getText());
		
		String button = e.getActionCommand();
		final char ch;
		if(button=="CE") {
			ch = 'Q';
		}
		else {
			ch = button.charAt(0);
		}
        
		switch(ch){
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
        	if(op.equals("")){
        		x=x+button;
        		tf.setText(x);
        	}
        	else{
        		y=y+button;
        		tf.setText(y);
        	}
        	break;
        	
        case 'C':
        	x="";
        	y="";
        	op="";
        	tf.setText("");
        	break;
        	
        case 'Q':
        	if(x!=""&op=="") {
        		x="";
        		tf.setText("");
        	}
        	else if(x!=""&y!="") {
        		y="";
        		tf.setText("");
        	}
        	break;
        
        case '+':
        case '-':
        case '*':
        case '/':
        	if(op=="") {
        		op=button;
            	//tf.setText(op); do not show operation
            	if(x=="") {
            		x="0";
            	}
        	}
        	else if(op!=""&&y==""){
        		op=button;
        	}
        	else {
        		op2=button;
        	
        		if(x!=""&&y!="") {
        		
        			double num1 = Double.parseDouble(x);
        			double num2 = Double.parseDouble(y);
            	
        			
        			if(op=="+") sum = num1+num2;
        			else if(op=="-") sum = num1-num2;
        			else if(op=="*") sum = num1*num2;
        			else if(op=="/"){
        				if(num2==0) {
        					tf.setText("Cannot divide by zero");
        					break;
        				}
        				else sum = num1/num2;
        			}
        			String sumS = String.valueOf(sum);
        			x=sumS;
        			y="";
        			tf.setText(sumS);
        			op=op2;
        			op2="";
        		}
        		break;
        	}
        	
        case '=':
        	
        	if(op=="") {
        		if(x!="") {
        			double num1 = Double.parseDouble(x);
        			sum = num1;
        			String xS = String.valueOf(sum);
        			tf.setText(xS);
        		}
        		else if(x=="") {
        			tf.setText("0.0");
        		}
        		
        	}
        	else if(x!=""&&y!=""&&op!="") {
        		double num1 = Double.parseDouble(x);
            	double num2 = Double.parseDouble(y);
            	
            	
            	if(op=="+") sum = num1 + num2;
            	else if(op=="-") sum = num1 - num2;
            	else if(op=="*") sum = num1*num2;
            	else if(op=="/"){
            		if(num2==0) {
            			tf.setText("Cannot divide by zero");
            			break;
            		}
            		else sum = num1/num2;
            	}
            	String sumS = String.valueOf(sum);
            	x=sumS;
            	y="";
            	tf.setText(sumS);
    		}
        	}
        } 
	
	
	public static void main(String[] args){
		JFrame frame = new Calculator();
	}
}