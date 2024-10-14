class Circulo extends Forma {
    public Circulo(Color color) {
        super(color);
    }
    
    @Override
    public void dibujar() {
        System.out.print("Dibujando un círculo. ");
        color.aplicarColor();
    }
}