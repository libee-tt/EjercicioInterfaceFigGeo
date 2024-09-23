
public class Romboide implements FigGeo{
	private String nombre;
	private double base;
	private double altura;
	
	
//		CONSTRUCTOR
	public Romboide(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}//constructor Romboide 
	
//	MÉTODOS
	public double calcPerimetro() {
		return 2*getBase()+2*getAltura();
	}//calcPerimetro
	
	public double calcArea() {
		return getAltura()*getBase();
	}//calcArea
		

//	GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

//		TOSTRING
	@Override
	public String toString() {
		return "Romboide, nombre=" + nombre + ", base=" + base + ", altura=" + altura;
	}//toString
	
	
	

	
	
	
	
}//class Romboide
