import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		/**Declaramos una variable String con una contraseņa y un boolean, despues iniciamos un while que ejecutara una pregunta hasta que o bien el boolean sea true o llegue a repetirse 3 veces.
		 * dentro del while si la contraseņa guardada y el texto aņadido en la pregunta de confirmar contraseņa enviara un mensaje por pantalla diciendo Enhorabuena.
		 */
		String pass = "jose";
		boolean correcto = false;
		int i = 0;
		while (i < 3 && !correcto) {
			String textPass = JOptionPane.showInputDialog("Confirma tu contraseņa.");
			if (textPass.equals(pass)) {
				correcto = true;
				JOptionPane.showMessageDialog(null, "Enhorabuena.");
			} else {
				i++;
			}
		}
	}

}
