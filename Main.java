public class Main {
    public static void main(String[] args) {
        Forma circuloVerde = new Circulo(new Verde());
        Forma cuadradoAmarillo = new Cuadrado(new Amarillo());
        Forma trianguloVerde = new Triangulo(new Verde());
        Forma circuloAmarillo = new Circulo(new Amarillo());

        circuloVerde.dibujar();
        cuadradoAmarillo.dibujar();
        trianguloVerde.dibujar();
        circuloAmarillo.dibujar();
    }
}