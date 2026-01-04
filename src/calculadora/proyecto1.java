package calculadora;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.ElementType;
import java.lang.invoke.StringConcatFactory;
import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class proyecto1 {

	
	private static char simbol='\0';
	
	//Vinculamos el archivo ventana con main
	public static ventana ventana;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		//Inicializamos el archivo ventana en el main
		ventana = new ventana();
		
		//volvemos ventana visible
		ventana.setVisible(true);
		
		//Definimos que hace cada boton de la calculadora
		ventana.boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+0);
			}
		});
		
		ventana.boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+1);
			}
		});
		
		ventana.boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+2);
			}
		});
		
		ventana.boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+3);
			}
		});
		
		ventana.boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+4);
			}
		});
		
		ventana.boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+5);
			}
		});
		
		ventana.boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+6);
			}
		});
		
		ventana.boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+7);
			}
		});
		
		ventana.boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+8);
			}
		});
		
		ventana.boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+9);
			}
		});
		ventana.coma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+".");
			}
		});
		
		ventana.suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+"+");
				
				simbol=ventana.suma.getText().charAt(0);
			}
		});
		
		ventana.resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+"-");
				
				simbol=ventana.resta.getText().charAt(0);
			}
		});
		
		ventana.dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+"/");
				
				simbol=ventana.dividir.getText().charAt(0);
			}
		});
		
		ventana.potencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+"^");
				
				simbol=ventana.potencia.getText().charAt(0);
			}
		});
		ventana.raiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+"√");
				
				simbol=ventana.raiz.getText().charAt(0);
			}
		});
		ventana.porcentaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+"%");
				
				simbol=ventana.porcentaje.getText().charAt(0);
			}
		});
		ventana.multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.textField.setText(ventana.textField.getText()+"x");
				
				simbol=ventana.multiplicar.getText().charAt(0);
			}
		});
		ventana.borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String texto=ventana.textField.getText();
				
				if (!texto.isEmpty()) {
		            texto = texto.substring(0, texto.length() - 1);
		            ventana.textField.setText(texto);
		        }
			}
		});
		ventana.borrarMemoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.textField.setText(null);
			}
		});
		
		//Operadores, calculos y resultado mostrados por pantalla
		ventana.igual.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {

		        String calculo = ventana.textField.getText();
		        BigDecimal resultado = BigDecimal.ZERO;

		        try {
		            if (simbol == '√') {
		                // Operación unaria: solo raíz cuadrada
		                if (calculo.length() < 2) {
		                    JOptionPane.showMessageDialog(null, "Debes escribir un número para la raíz");
		                    return;
		                }

		                String numRaiz = calculo.substring(1); // todo lo que sigue después de '√'
		                BigDecimal operadorRaiz = new BigDecimal(numRaiz);

		                if (operadorRaiz.compareTo(BigDecimal.ZERO) < 0) {
		                    JOptionPane.showMessageDialog(null, "No se puede calcular la raíz de un número negativo");
		                    return;
		                }

		                resultado = new BigDecimal(Math.sqrt(operadorRaiz.doubleValue()));

		            } else {
		                // Operaciones binarias: +, -, x, /, ^, %
		                int indiceSimbolo = calculo.indexOf(simbol);

		                if (indiceSimbolo == -1) {
		                    JOptionPane.showMessageDialog(null, "Operador no encontrado");
		                    return;
		                }

		                String num1 = calculo.substring(0, indiceSimbolo);
		                String num2 = calculo.substring(indiceSimbolo + 1);

		                // Limpiar posibles signos '+' al inicio de num2
		                num2 = num2.replaceFirst("^\\++", "");

		                BigDecimal operador1 = new BigDecimal(num1);
		                BigDecimal operador2 = new BigDecimal(num2);

		                switch (simbol) {
		                    case '+':
		                        resultado = operador1.add(operador2);
		                        break;
		                    case '-':
		                        resultado = operador1.subtract(operador2);
		                        break;
		                    case 'x':
		                        resultado = operador1.multiply(operador2);
		                        break;
		                    case '/':
		                        resultado = operador1.divide(operador2, 10, RoundingMode.HALF_UP);
		                        break;
		                    case '^':
		                        resultado = operador1.pow(operador2.intValue());
		                        break;
		                    case '%':
		                        resultado = operador1.multiply(operador2)
		                                    .divide(new BigDecimal("100"), 10, RoundingMode.HALF_UP);
		                        break;
		                    default:
		                        throw new IllegalArgumentException("Unexpected value: " + simbol);
		                }
		            }

		            // Limitar todos los resultados a 5 decimales
		            resultado = resultado.setScale(5, RoundingMode.HALF_UP);

		            // Mostrar resultado en pantalla
		            ventana.textField.setText(resultado.stripTrailingZeros().toPlainString());

		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Número inválido");
		        } catch (ArithmeticException ex) {
		            JOptionPane.showMessageDialog(null, "Error aritmético: " + ex.getMessage());
		        }
		    }
		});
		
		
	}

}
