
public class Rectangulo implements FigGeo {
	private String nombre;
	private double base;
	private double altura;

//	CONSTRUCTOR
	
	public Rectangulo (String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}//constructor Rectangulo
	
//	MÉTODOS
	public double calcArea() {
		return getAltura()*getBase();
	}//calcArea
	
	public double calcPerimetro() {
		return 2*getBase()+2*getAltura();
	}//calcPerimetro
	
//	GETTERS AND SETTERS
	
	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public double getBase() {
		return base;
	}//getBase

	public void setBase(double base) {
		this.base = base;
	}//setBase

	public double getAltura() {
		return altura;
	}//getAltura

	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura

//	TOSTRING
	@Override
	public String toString() {
		return "Rectángulo, nombre="+nombre+", base="+base+", altura="+altura;
	}//toString
	
	
	
}//class Rectangulo
