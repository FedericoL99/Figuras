import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String color;
        double lado,base,altura;
        Scanner x = new Scanner(System.in);
        System.out.printf("Ingrese el color del cuadrado: ");
        color = x.next();
        System.out.printf("Ingrese el lado del cuadrado: ");
        lado = x.nextDouble();
        Cuadrado cuadrado = new Cuadrado(color,lado);
        System.out.printf("El color del cuadrado es: "+color+"\n");
        System.out.println("El area del cuadrado es: "+cuadrado.calcularArea());
        System.out.println("Ingrese el color del triangulo: ");
        color = x.next();
        System.out.printf("Ingrese la base del triangulo: ");
        base = x.nextDouble();
        System.out.printf("Ingrese la altura del triangulo: ");
        altura = x.nextDouble();
        Triangulo triangulo = new Triangulo(color,base,altura);
        System.out.printf("El color del triangulo es: "+color+"\n");
        System.out.printf("El area del triangulo es: "+triangulo.calcularArea());


    }
}
