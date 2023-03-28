package Figuras;
import java.util.Scanner;
public class Inicio {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int respuesta;
        System.out.println("De que figura quieres calcuar el area: \n1.Cuadrado \n2.Circulo \n3.Tringulo");
        respuesta=leer.nextInt();
        if (respuesta==1) {
            int lado;
            System.out.println("Digite la medida del lado ");
            lado=leer.nextInt();
                Cuadrado c1 = new Cuadrado(lado);
                c1.calcularArea();
        }
        else if (respuesta==2) {
            int radio;
            System.out.println("Digite la medida del radio ");
            radio=leer.nextInt();
                Circulo c1 = new Circulo(radio);
                c1.calcularArea();
        }
        else if (respuesta==3) {
            int base;
            int altura;
            System.out.println("Digite la medida de la base");
            base=leer.nextInt();
            System.out.println("Digite la medida de la altura");
            altura=leer.nextInt();
                Triangulo t1 = new Triangulo(base, altura);
                t1.calcularArea();
        }
leer.close();   
        

        
}
}
