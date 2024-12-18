package ClaseAbstracta;

public abstract class FiguraGeometrica {
    
    public abstract double calcularArea();

    
    public boolean mayorQue(FiguraGeometrica otraFigura) {
        return this.calcularArea() > otraFigura.calcularArea();
    }

    @Override
    public String toString() {
        return "FiguraGeometrica con área: " + this.calcularArea();
    }
}