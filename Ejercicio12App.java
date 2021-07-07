import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		String pass = "jose";
		boolean correcto = false;
		int i = 0;
		while (i < 3 && !correcto) {
			String textPass = JOptionPane.showInputDialog("Confirma tu contraseña.");
			if (textPass.equals(pass)) {
				correcto = true;
				JOptionPane.showMessageDialog(null, "Enhorabuena.");
			} else {
				i++;
			}
		}
	}

}
