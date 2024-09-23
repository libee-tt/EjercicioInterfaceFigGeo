
public class Trapecio implements FigGeo {
	private String nombre;
	private double baseMenor;
	private double baseMayor;
	private double altura;
	
//	CONSTRUCTOR
	public Trapecio(String nombre, double baseMenor, double baseMayor, double altura) {
		super();
		this.nombre = nombre;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.altura = altura;
	}//Constructor Trapecio
	
//	MÉTODOS
	public double calcPerimetro() {
		return getAltura()*2+getBaseMayor()+getBaseMenor();
	}//calcPerimetro
	
	public double calcArea() {
		return (getAltura()*(getBaseMayor()+getBaseMenor()))/2;
	}//calcArea


//	GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getBaseMayor() {
		return baseMayor;
	}

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

//	TOSTRING
	@Override
	public String toString() {
		return "Trapecio, nombre=" + nombre + ", baseMenor=" + baseMenor + ", baseMayor=" + baseMayor + ", altura="+ altura;
	}


	
	
}//class Trapecio
