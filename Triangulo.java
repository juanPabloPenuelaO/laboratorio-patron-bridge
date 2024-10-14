class Triangulo extends Forma {
    public Triangulo(Color color) {
        super(color);
    }
    
    @Override
    public void dibujar() {
        System.out.print("Dibujando un triángulo. ");
        color.aplicarColor();
    }
}
