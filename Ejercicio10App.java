	/**.
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
import javax.swing.JOptionPane;
public class Ejercicio10App {

	public static void main(String[] args) {
		String textNum=JOptionPane.showInputDialog("Introduce un numero de ventas.");
		int ventas=Integer.parseInt(textNum);
		int total=0;
		for (int i=0;i<ventas;i++) {
			String textPrecio=JOptionPane.showInputDialog("Introduce el precio de la venta.");
			int precio=Integer.parseInt(textPrecio);
			total=total+precio;
		}
		JOptionPane.showMessageDialog(null, "El precio final seria de: "+total);
	}

}
