
public class Main {

	public static void main(String[] args) {

		Triangulo t1 = new Triangulo("Bermudas",20,20,20);
		Triangulo t = new Triangulo("T", 87,121,110);
		
		Cuadrado c1 = new Cuadrado("Bob", 40);
		
		Rectangulo r1 = new Rectangulo("Recti", 40, 20);
		
		Rombo ro1 = new Rombo ("Rombis", 50, 20, 35);
		
		Romboide roe1= new Romboide ("Romboidis", 34, 29);
		
		Trapecio tr1 = new Trapecio ("Trapis", 31, 65, 20);
		
		
		
		imprimirCalc(t1);
		imprimirCalc(t);
		imprimirCalc(c1);
		imprimirCalc(r1);
		imprimirCalc(ro1);
		imprimirCalc(roe1);
		imprimirCalc(tr1);
		
		
		
	}//main

	public static void imprimirCalc(FigGeo t) {
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("| "+t);
		System.out.println("| El área de [" + t.getNombre()+ "] es: " + t.calcArea());
		System.out.println("| El perímetro de [" +t.getNombre() + "] es: "+t.calcPerimetro());
		System.out.println("+------------------------------------------------------------------+");
	}//imprimirCalc

}//class Main
