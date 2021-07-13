	/**.
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
import javax.swing.JOptionPane;
public class Ejercicio3App {
	public static void main(String[] args) {
		//Hacemos una pregunta por pantalla para que la respuesta se añada al String name y luego envie un mensaje de Bienvenida junto al nombre añadido.
		String name=JOptionPane.showInputDialog("Como te llamas?");
		JOptionPane.showMessageDialog(null, "Bienvenido: "+name);
	}
}
