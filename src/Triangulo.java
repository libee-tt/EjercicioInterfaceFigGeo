
public class Triangulo implements FigGeo {
	
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	
//	CONSTRUCTOR
	public Triangulo(String nombre, double base, double altura, double lado) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}//constructor Triángulo
	
//	MÉTODOS - Área y Perímetro
	public double calcArea() {
		return (getBase()*getAltura())/2;
	}//calcArea
	
	public double calcPerimetro() {
		return (getLado()+getLado()+getLado());
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

	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

//	TOSTRING
	@Override
	public String toString() {
		return "Triángulo, nombre= "+nombre+", base= "+base+", altura= "+altura+", lado= "+lado;
	}//toString
	
}//class Triangulo
