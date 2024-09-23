
public class Cuadrado implements FigGeo {
	private String nombre;
	private int lado;
	
	
//	CONSTRUCTOR
	public Cuadrado(String nombre, int lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}//constructor Cuadrado

//	MÉTODOS
	public double calcArea() {
		return getLado()*getLado();
	}//calcArea
	
	public double calcPerimetro() {
		return getLado()*4;
	}//calcPerimetro
	

//	GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}//getName


	public void setName(String nombre) {
		this.nombre = nombre;
	}//setName


	public int getLado() {
		return lado;
	}//getLado


	public void setLado(int lado) {
		this.lado = lado;
	}//setLado

//	TOSTRING
	@Override
	public String toString() {
		return "Cuadrado, nombre="+nombre+", lado="+lado;
	}//toString


}//class Cuadrado
