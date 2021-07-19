import java.text.DecimalFormat;

public class Raices {
	
	// Atributos
	// Modificadores de acceso public y final para tener acceso libre pero no se pueda modificar su valor una vez creado el objeto
	public final double a;
	public final double b;
	public final double c;
	// Formato para las impresiones
	DecimalFormat df = new DecimalFormat("#.###");
	
	//Constructores
	public Raices() {
		this(1, 1, 1);
	}
	public Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// Métodos
	public void obtenerRaices() {
		double resultado1 = (-b + Math.sqrt(this.getDiscriminante())) / (2 * a);
		double resultado2 = (-b - Math.sqrt(this.getDiscriminante())) / (2 * a);;
		
		System.out.println("Resultados: " + df.format(resultado1) + " y " + df.format(resultado2));
	}
	
	public void obtenerRaiz() {
		double resultado = -b / (2 * a);
		
		System.out.println("Resultado: " + df.format(resultado));
	}
	
	public double getDiscriminante() {
		double discriminante = (Math.pow(b, 2)-(4*a*c));
		return discriminante;
	}
	
	// Devuelve true si tiene 2 soluciones y false si solo tiene 1
	public boolean tieneRaices() {
		boolean variosResultados = (this.tieneRaiz() && this.getDiscriminante() > 0) ? true : false;
		return variosResultados;
	}
	
	// Devuelve true si tiene solucion/es reales y false si no tiene una solucion real
	public boolean tieneRaiz() {
		boolean resultadoReal = (this.getDiscriminante() >= 0) ? true : false;
		return resultadoReal;
	}
	
	public void calcular() {
		if (this.tieneRaiz()) {
			if (this.tieneRaices()) {
				this.obtenerRaices();
			} else {
				this.obtenerRaiz();
			}
		} else {
			System.out.println("La raiz no tiene un resultado real");
		}
	}
	
	@Override
	public String toString() {
		return "Variables [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}
