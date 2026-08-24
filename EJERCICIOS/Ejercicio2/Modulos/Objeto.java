package Modulos;

public class Objeto {
    final private String nombre;
    final private String tipo;
    final private int cantidad;
    final private double valor;

    public Objeto(String nombre, String tipo, int cantidad, double valor){
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public void recogido(){
        System.out.println("Se encontro "+ this.nombre + " del suelo");
    }

    public void utilizado(){
        System.out.println("El objeto "+ this.nombre + " fue utilizado");
    }
    
    public void mostrarInfo(){
        System.out.println("Informacion del objeto");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Valor: " +  this.valor);
    }

    public String getNombre(){
        return nombre;
    }
}


