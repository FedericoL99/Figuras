public abstract class Figura {
    private String color;

    public Figura(String color) {   //Constructor
        this.color = color;
    }

    public String getColor() {    //Método getter - normal
        return color;
    }

    public abstract double calcularArea();

}
