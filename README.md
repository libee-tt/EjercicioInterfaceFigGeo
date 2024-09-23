# Ejercicio de Interfaces en Java - FigGeo

## Descripción del Proyecto

Este proyecto tuvo como objetivo implementar una interfaz llamada `FigGeo` que representa figuras geométricas. A partir de esta interfaz, se crearon clases específicas para las figuras geométricas: Triángulo, Cuadrado, Rectángulo, Rombo, Romboide y Trapecio.

Cada clase implementó los métodos llamados en la interfaz `FigGeo` para calcular el área y el perímetro de la figura correspondiente. Este enfoque permite una forma organizada y reutilizable de trabajar con diferentes formas geométricas en un programa.

## Estructura del Proyecto

### Interfaz `FigGeo`

La interfaz `FigGeo` define los métodos que cada figura geométrica debe implementar. Estos métodos son:

- `getNombre()`: Retorna el nombre de la figura geométrica.
- `calcArea()`: Calcula y retorna el área de la figura geométrica.
- `calcPerimetro()`: Calcula y retorna el perímetro de la figura geométrica.

```java
public interface FigGeo {
    public String getNombre();
    public double calcArea();
    public double calcPerimetro();
}
