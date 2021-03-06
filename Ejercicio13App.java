
/**.
 * @author Jose Luis Padilla Gonzalez
 * 07-07-2021
 */
import javax.swing.JOptionPane;

public class Ejercicio13App {

	public static void main(String[] args) {
		/* Haremos 3 preguntas para guardar las variables de los numeros que queremos meter en la operacion y un signo que defina que calculo quiere hacer
		 * y con ese signo lo utilizaremos en un switch con un caso para suma, resta, multiplicacion... y enviando una respuesta por pantalla para cada uno.
		 */
		String textA = JOptionPane.showInputDialog("Introduce el primer numero.");
		int a = Integer.parseInt(textA);
		String textB = JOptionPane.showInputDialog("Introduce el segundo numero.");
		int b = Integer.parseInt(textB);
		String ari = JOptionPane.showInputDialog("Introduce el signo aritmético.");
		switch (ari) {
		case "+":
			JOptionPane.showMessageDialog(null, "La suma de "+a+" + "+b+" = "+(a+b));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, "La resta de "+a+" - "+b+" = "+(a-b));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, "La multiplicacion de "+a+" * "+b+" = "+(a*b));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, "La division de "+a+" / "+b+" = "+(a/b));
			break;
		case "^":
			JOptionPane.showMessageDialog(null, +a+" elevado a "+b+" = "+Math.pow(a, b));
			break;
		case "%":
			JOptionPane.showMessageDialog(null, "El resto de "+a+" / "+b+" = "+(a%b));
			break;
		}
	}

}
