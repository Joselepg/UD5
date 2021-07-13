	/**.
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
import javax.swing.JOptionPane;
public class Ejercicio10App {

	public static void main(String[] args) {
		/**Pedimos por pantalla un numero de ventas y lo guardamos en una variable int, despues hacemos un bucle for que se repita hasta que llegue a el numero de ventas repitiendo una pregunta sobre el precio y luego se sume al total.
		*Al final fuera del for devolvemos una respuesta por pantalla con un texto: El precio final seria de y añadimos el valor total del precio.
		**/
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
