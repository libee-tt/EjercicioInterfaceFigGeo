
public class Rombo implements FigGeo{

	private String nombre;
	private double lado;
	private double dMayor;
	private double dMenor;
//	CONSTRUCTOR
	public Rombo(String nombre, double lado, double dMayor, double dMenor) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		this.dMayor = dMayor;
		this.dMenor = dMenor;
	}//constructor Rombo
	
//	MÉTODOS
	public double calcPerimetro() {
		return 4*getLado();
	}//calcPerimetro
	
	public double calcArea() {
		return (getdMayor()*getdMenor())/2;
	}//calcArea
	
//	GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getdMayor() {
		return dMayor;
	}
	public void setdMayor(double dMayor) {
		this.dMayor = dMayor;
	}
	public double getdMenor() {
		return dMenor;
	}
	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}
	

//	TOSTRING
	@Override
	public String toString() {
		return "Rombo, nombre=" + nombre + ", lado=" + lado + ", dMayor=" + dMayor + ", dMenor=" + dMenor;
	}//toString
		
}//class Rombo
