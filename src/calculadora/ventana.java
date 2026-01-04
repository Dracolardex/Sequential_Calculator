package calculadora;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class ventana extends JFrame {
	public JTextField textField;
	public JButton boton7;
	public JButton boton8;
	public JButton boton9;
	public JButton boton4;
	public JButton boton5;
	public JButton boton6;
	public JButton boton1;
	public JButton boton2;
	public JButton boton3;
	public JButton boton0;
	public JButton potencia;
	public JButton raiz;
	public JButton porcentaje;
	public JButton suma;
	public JButton multiplicar;
	public JButton dividir;
	public JButton resta;
	public JButton borrarMemoria;
	public JButton borrar;
	public JButton coma;
	public JButton igual;
	

	public ventana() {
		
		super();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(500, 500, 400, 500);
		getContentPane().setLayout(null);
		
		boton1 = new JButton("1");
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		boton1.setBounds(10, 311, 73, 68);
		getContentPane().add(boton1);
		
		boton0 = new JButton("0");
		boton0.setFont(new Font("Tahoma", Font.PLAIN, 23));
		boton0.setBounds(10, 382, 155, 68);
		getContentPane().add(boton0);
		
		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		boton2.setBounds(93, 311, 73, 68);
		getContentPane().add(boton2);
		
		boton3 = new JButton("3");
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		boton3.setBounds(176, 311, 73, 68);
		getContentPane().add(boton3);
		
		boton4 = new JButton("4");
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		boton4.setBounds(10, 238, 73, 68);
		getContentPane().add(boton4);
		
		boton5 = new JButton("5");
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 23));
		boton5.setBounds(93, 238, 73, 68);
		getContentPane().add(boton5);
		
		boton6 = new JButton("6");
		boton6.setFont(new Font("Tahoma", Font.PLAIN, 23));
		boton6.setBounds(176, 238, 73, 68);
		getContentPane().add(boton6);
		
		boton7 = new JButton("7");
		boton7.setFont(new Font("Tahoma", Font.PLAIN, 23));
		boton7.setBounds(10, 164, 73, 68);
		getContentPane().add(boton7);
		
		boton8 = new JButton("8");
		boton8.setFont(new Font("Tahoma", Font.PLAIN, 23));
		boton8.setBounds(93, 164, 73, 68);
		getContentPane().add(boton8);
		
		boton9 = new JButton("9");
		boton9.setFont(new Font("Tahoma", Font.PLAIN, 23));
		boton9.setBounds(176, 164, 73, 68);
		getContentPane().add(boton9);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(10, 11, 364, 81);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		potencia = new JButton("^");
		potencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		potencia.setFont(new Font("Tahoma", Font.PLAIN, 23));
		potencia.setBounds(10, 109, 73, 44);
		getContentPane().add(potencia);
		
		raiz = new JButton("√");
		raiz.setFont(new Font("Tahoma", Font.PLAIN, 23));
		raiz.setBounds(93, 109, 73, 44);
		getContentPane().add(raiz);
		
		porcentaje = new JButton("%");
		porcentaje.setFont(new Font("Tahoma", Font.PLAIN, 23));
		porcentaje.setBounds(176, 109, 73, 44);
		getContentPane().add(porcentaje);
		
		suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		suma.setFont(new Font("Tahoma", Font.PLAIN, 23));
		suma.setBounds(259, 224, 54, 68);
		getContentPane().add(suma);
		
		multiplicar = new JButton("x");
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		multiplicar.setFont(new Font("Tahoma", Font.PLAIN, 23));
		multiplicar.setBounds(320, 224, 54, 68);
		getContentPane().add(multiplicar);
		
		dividir = new JButton("/");
		dividir.setFont(new Font("Tahoma", Font.PLAIN, 23));
		dividir.setBounds(259, 303, 54, 68);
		getContentPane().add(dividir);
		
		resta = new JButton("-");
		resta.setFont(new Font("Tahoma", Font.PLAIN, 23));
		resta.setBounds(323, 303, 54, 68);
		getContentPane().add(resta);
		
		igual = new JButton("=");
		igual.setForeground(new Color(255, 255, 255));
		igual.setUI(new javax.swing.plaf.basic.BasicButtonUI());
		igual.setBackground(new Color(0, 128, 255));
		igual.setOpaque(true);
		igual.setContentAreaFilled(true);
		igual.setBorderPainted(true);
		igual.setFont(new Font("Tahoma", Font.PLAIN, 23));
		igual.setBounds(259, 382, 115, 68);
		getContentPane().add(igual);
		
		borrarMemoria = new JButton("CE");
		borrarMemoria.setForeground(new Color(255, 255, 255));
		borrarMemoria.setUI(new javax.swing.plaf.basic.BasicButtonUI());
		borrarMemoria.setBackground(new Color(255, 128, 64));
		borrarMemoria.setOpaque(true);
		borrarMemoria.setContentAreaFilled(true);
		borrarMemoria.setBorderPainted(true);
		borrarMemoria.setFont(new Font("Tahoma", Font.PLAIN, 23));
		borrarMemoria.setBounds(259, 157, 115, 56);

		borrarMemoria.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    }
		});
		getContentPane().add(borrarMemoria);
		
		borrar = new JButton("C");
		borrar.setForeground(new Color(255, 255, 255));
		borrar.setUI(new javax.swing.plaf.basic.BasicButtonUI());
		borrar.setBackground(new Color(255, 128, 64));
		borrar.setOpaque(true);
		borrar.setContentAreaFilled(true);
		borrar.setBorderPainted(true);
		borrar.setFont(new Font("Tahoma", Font.PLAIN, 23));
		borrar.setBounds(259, 109, 115, 44);

		borrar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    }
		});
		getContentPane().add(borrar);
		
		coma = new JButton(".");
		coma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		coma.setFont(new Font("Tahoma", Font.PLAIN, 23));
		coma.setBounds(175, 382, 74, 68);
		getContentPane().add(coma);
		
		
		setVisible(true);
		repaint();
		revalidate();
		
		
	}
}
