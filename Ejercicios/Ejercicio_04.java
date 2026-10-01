import java.util.ArrayList;
class Par<F, S> {
    private F primero;
    private S segundo;

    public Par(F primero, S segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }
    public F getPrimero() {
        return primero;
    }
    public S getSegundo() {
        return segundo;
    }
    public void setPrimero(F primero) {
        this.primero = primero;
    }
    public void setSegundo(S segundo) {
        this.segundo = segundo;
    }
    @Override 
    public String toString() {
        return "(Primero: " + primero + ", Segundo: " + segundo + ")";
    }
}

class Contenedor<F,S>{
    ArrayList<Par<F,S>> lista;
    public Contenedor(){
        lista=new ArrayList<Par<F,S>>();
    }
    public void agregarPar(F primero, S segundo){
        lista.add(new Par<F,S>(primero,segundo));
    }
    public Par<F,S> obtenerPar(int indice){
        return lista.get(indice);
    }
    
    public ArrayList<Par<F,S>> obtenerTodosLosPares() {
        return lista;
    }
    public void mostrarPares() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}

public class Ejercicio_04 {
    public static void main(String[] args) {

        Contenedor<String, Double> tienda = new Contenedor<>();
        tienda.agregarPar("Laptop", 3500.0);
        tienda.agregarPar("Mouse", 80.0);
        tienda.agregarPar("Teclado", 150.0);
        tienda.agregarPar("Monitor", 900.0);
        System.out.println("PRODUCTOS DE LA TIENDA ");
        tienda.mostrarPares();
        System.out.println("Producto en la posicion 1:");
        System.out.println(tienda.obtenerPar(1));
        System.out.println("Todos los productos:");
        System.out.println(tienda.obtenerTodosLosPares());
    }
}
