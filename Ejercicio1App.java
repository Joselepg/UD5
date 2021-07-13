	/**.
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
public class Ejercicio1App {
	public static void main(String[] args) {
		//Declaramos las dos variables int a y b, creamos un if para la opcion de que a es mayor que b, un else if para la opcion de a es mejor que b y un ultimo else para si a y b son iguales.
		int a=5;
		int b=2;
		if(a>b) {
			System.out.println(a+" es mayor que "+b);
		}
		else if(a<b) {
			System.out.println(a+" es menor que "+b);
		}
		else {
			System.out.println(a+" es igual que "+b);
		}
	}
}
