	/**.
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
import javax.swing.JOptionPane;
public class Ejercicio4App {
	public static void main(String[] args) {
		//Hacemos una pregunta por pantalla para preguntar por el radio, luego calculamos el radio y lo mostramos por pantalla.
		String radio=JOptionPane.showInputDialog("Introduce el radio.");
		double r=Double.parseDouble(radio);
		System.out.println(Math.PI*Math.pow(r, 2));
	}

}
