package ClaseAbstracta;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica rectangulo = new Rectangulo(5, 10);
        FiguraGeometrica triangulo = new Triangulo(5, 10);
        FiguraGeometrica circulo = new Circulo(7);

        System.out.println("=== Información de Figuras Geométricas ===");
        System.out.println(rectangulo);
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println("==========================================");

        System.out.println("\n=== Comparaciones de Áreas ===");
        System.out.printf("¿El rectángulo tiene un área mayor que el triángulo? %s\n", 
                          rectangulo.mayorQue(triangulo) ? "Sí" : "No");
        System.out.printf("¿El círculo tiene un área mayor que el rectángulo? %s\n", 
                          circulo.mayorQue(rectangulo) ? "Sí" : "No");
        System.out.println("================================");
    }
}
