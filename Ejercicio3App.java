	/**.
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
import javax.swing.JOptionPane;
public class Ejercicio3App {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("Como te llamas?");
		JOptionPane.showMessageDialog(null, "Bienvenido: "+name);
	}
}
