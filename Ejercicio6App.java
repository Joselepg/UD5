	/**.
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
import javax.swing.JOptionPane;
public class Ejercicio6App {

	public static void main(String[] args) {
		//Declaramos una variable final para el IVA, preguntamos por pantalla el precio y lo guardamos en una variable Double y le sumamos el precio con IVA.
		final double IVA=0.21;
		String textPrice=JOptionPane.showInputDialog("Introduce el precio.");
		
		double price=Double.parseDouble(textPrice);
		JOptionPane.showMessageDialog(null, "El precio del producto con IVA incluido seria: "+(price+(price*IVA)));
	}

}
