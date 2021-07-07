	/**.
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
import javax.swing.JOptionPane;
public class Ejercicio5App {
	public static void main(String[] args) {
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
