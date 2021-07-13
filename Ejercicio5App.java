	/**.
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
import javax.swing.JOptionPane;
public class Ejercicio5App {
	public static void main(String[] args) {
		//Hacemos una pregunta por pantalla para preguntar por un numero y si es par respondera que es par y si no cumple esa condicion respondera que no lo es.
		String texto=JOptionPane.showInputDialog("Introduce un numero.");
		int numero=Integer.parseInt(texto);
		if(numero%2==0) {
			JOptionPane.showMessageDialog(null,  "El numero es par.");
		}
		else {
			JOptionPane.showMessageDialog(null, "El numero es inpar.");
		}
	}

}
