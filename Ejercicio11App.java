	/**.
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
import javax.swing.JOptionPane;
public class Ejercicio11App {

	public static void main(String[] args) {
		//Hacemos una pregunta por pantalla para que introduzca un String de el dia, despues hacemos un switch con ese String con casos para dias laborales, no laborales y un default para error.
		String dia=JOptionPane.showInputDialog("Introduce un d�a de la semana.");
		switch (dia) {
		case "Lunes":
			JOptionPane.showMessageDialog(null, dia+" es un d�a laboral.");
		break;
		case "Martes":
			JOptionPane.showMessageDialog(null, dia+" es un d�a laboral.");
		break;
		case "Miercoles":
			JOptionPane.showMessageDialog(null, dia+" es un d�a laboral.");
		break;
		case "Jueves":
			JOptionPane.showMessageDialog(null, dia+" es un d�a laboral.");
		break;
		case "Viernes":
			JOptionPane.showMessageDialog(null, dia+" es un d�a laboral.");
		break;
		case "Sabado":
			JOptionPane.showMessageDialog(null, dia+" no es un d�a laboral.");
		break;
		case "Domingo":
			JOptionPane.showMessageDialog(null, dia+" no es un d�a laboral.");
		break;
		default:
			JOptionPane.showMessageDialog(null, dia+" no es un d�a de la semana.");
		}
	}

}
