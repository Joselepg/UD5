import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		/**Declaramos una variable String con una contrase�a y un boolean, despues iniciamos un while que ejecutara una pregunta hasta que o bien el boolean sea true o llegue a repetirse 3 veces.
		 * dentro del while si la contrase�a guardada y el texto a�adido en la pregunta de confirmar contrase�a enviara un mensaje por pantalla diciendo Enhorabuena.
		 */
		String pass = "jose";
		boolean correcto = false;
		int i = 0;
		while (i < 3 && !correcto) {
			String textPass = JOptionPane.showInputDialog("Confirma tu contrase�a.");
			if (textPass.equals(pass)) {
				correcto = true;
				JOptionPane.showMessageDialog(null, "Enhorabuena.");
			} else {
				i++;
			}
		}
	}

}
