import javax.swing.JOptionPane;

public class Proyecto4App {

	public static void main(String[] args) {
		
		System.out.println("Calculo de raizes:");
		// Pide los valores de A B y C de la ecuacion
		String aInput = JOptionPane.showInputDialog("Introduce el valor de la variable A:");
		String bInput = JOptionPane.showInputDialog("Introduce el valor de la variable B:");
		String cInput = JOptionPane.showInputDialog("Introduce el valor de la variable C:");
		// Cast de las variables
		double a = Double.parseDouble(aInput);
		double b = Double.parseDouble(bInput);
		double c = Double.parseDouble(cInput);
		// Crea un objeto raiz y muestra los valores introducidos por pantalla
		Raices r = new Raices(a,b,c);
		System.out.println(r.toString());
		// Resuelve la ecuacion y la imprime
		r.calcular();	
	}


	public static void print (Object o) {
		System.out.println(o);
	}
}