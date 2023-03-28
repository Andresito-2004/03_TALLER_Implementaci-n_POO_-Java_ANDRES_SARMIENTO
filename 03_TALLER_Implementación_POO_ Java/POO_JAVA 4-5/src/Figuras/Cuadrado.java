package Figuras;
public class Cuadrado extends Figuras{
    int area;
    private int lado;
    // Constructor
    public Cuadrado(int lado){ 
        this.lado=lado;
    }
    //Get
    public int getLado() {
        return lado;
    }
    //set
    public void setLado(int lado) {
        this.lado = lado;
    }
    //invocar metodo abstracto
    @Override
    public void calcularArea(){
       area=lado*lado;
       System.out.println("El area del cuadrado es: "+area);
    }
    
}
