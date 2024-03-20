import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
	private JButton btn4;
	double numero1;
	double numero2;
	double resultado;
	String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(0, 0, 0));
		frmCalculadora.setTitle("calculadora");
		frmCalculadora.setBounds(100, 100, 288, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setForeground(Color.RED);
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Arial", Font.PLAIN, 18));
		txtField.setBounds(10, -1, 251, 26);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnNewButton.setForeground(new Color(204, 0, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(214, 36, 53, 41);
		frmCalculadora.getContentPane().add(btnNewButton);
		
		JButton btnsoma = new JButton("+");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
			}
		});
		btnsoma.setForeground(new Color(204, 0, 0));
		btnsoma.setFont(new Font("Arial", Font.BOLD, 18));
		btnsoma.setBounds(208, 82, 59, 41);
		frmCalculadora.getContentPane().add(btnsoma);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			}
		});
		btnsub.setForeground(new Color(204, 0, 0));
		btnsub.setFont(new Font("Arial", Font.BOLD, 18));
		btnsub.setBounds(208, 128, 59, 41);
		frmCalculadora.getContentPane().add(btnsub);
		
		JButton btnmult = new JButton("x");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "*";
			}
		});
		btnmult.setForeground(new Color(204, 0, 0));
		btnmult.setFont(new Font("Arial", Font.BOLD, 18));
		btnmult.setBounds(208, 173, 59, 41);
		frmCalculadora.getContentPane().add(btnmult);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn1.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 18));
		btn1.setBounds(10, 173, 59, 41);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 18));
		btn9.setBounds(146, 82, 59, 41);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 18));
		btn8.setBounds(77, 82, 59, 41);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 18));
		btn7.setBounds(10, 82, 59, 41);
		frmCalculadora.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn4.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 18));
		btn4.setBounds(10, 128, 59, 41);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 18));
		btn6.setBounds(146, 128, 59, 41);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 18));
		btn5.setBounds(77, 128, 59, 41);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 18));
		btn3.setBounds(146, 173, 59, 41);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 18));
		btn2.setBounds(77, 173, 59, 41);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn0.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 18));
		btn0.setBounds(10, 220, 59, 41);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btnponto = new JButton(".");
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btnponto.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btnponto.setForeground(new Color(204, 0, 0));
		btnponto.setFont(new Font("Arial", Font.BOLD, 18));
		btnponto.setBounds(77, 220, 59, 41);
		frmCalculadora.getContentPane().add(btnponto);
		
		JButton btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionar;
				numero2 = Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
					resultado = numero1+numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);
				}else if(operacao.equals("-")) {
					resultado = numero1-numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);
				}else if(operacao.equals("*")) {
					resultado = numero1*numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);
			}else if(operacao.equals("/")) {
				resultado = numero1/numero2;
				selecionar = String.format("%.0f", resultado);
				txtField.setText(selecionar);
			}
			}
		});
		btnigual.setForeground(new Color(204, 0, 0));
		btnigual.setFont(new Font("Arial", Font.BOLD, 18));
		btnigual.setBounds(146, 220, 59, 41);
		frmCalculadora.getContentPane().add(btnigual);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "/";
			}
		});
		btndiv.setForeground(new Color(204, 0, 0));
		btndiv.setFont(new Font("Arial", Font.BOLD, 18));
		btndiv.setBounds(208, 220, 59, 41);
		frmCalculadora.getContentPane().add(btndiv);
	}
}
