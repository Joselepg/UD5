	/**.
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
public class Ejercicio9App {

	public static void main(String[] args) {
		//Declaramos una variable n, despues la metemos en un while que ira creciendo hasta llegar a 100 y solo mostrara los numeros que cumplan una condicion para determinar si son primos
		int n=1;
		while(n<100) {
			n++;
			if(n%2==0 && n%3==0) {
				System.out.println(n);
			}
		}

	}

}
