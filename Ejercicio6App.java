	/**.
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
import javax.swing.JOptionPane;
public class Ejercicio6App {

	public static void main(String[] args) {
		final double IVA=0.21;
		String textPrice=JOptionPane.showInputDialog("Introduce el precio.");
		
		double price=Double.parseDouble(textPrice);
		JOptionPane.showMessageDialog(null, "El precio del producto con IVA incluido seria: "+(price+(price*IVA)));
	}

}
