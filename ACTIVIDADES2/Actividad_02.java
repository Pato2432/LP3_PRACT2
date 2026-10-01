class ExcepcionPilaLlena extends RuntimeException{
    public ExcepcionPilaLlena() {};
    public ExcepcionPilaLlena(String mensaje){
        super(mensaje);
    }
}
class ExcepcionPilaVacia extends RuntimeException{
    public ExcepcionPilaVacia(){};
    public ExcepcionPilaVacia(String mensaje){
        super(mensaje);
    }
}
class Pila< E > {
    private final int tamanio; 
    private int superior; 
    private E[] elementos; 
       
    public Pila(){
        this( 10 ); 
    } 
    
    public Pila( int s ) {
        tamanio = s > 0 ? s : 10; 
        superior = -1; 
        elementos = (E[]) new Object[tamanio]; 
    } 

    public void push( E valorAMeter ) {
        if ( superior == tamanio - 1 ) 
            throw new ExcepcionPilaLlena( String.format(
                "La Pila esta llena, no se puede meter %s", valorAMeter));
        elementos[++superior] = valorAMeter; 
    } 
    
    public E pop(){
        if ( superior == -1 ) 
            throw new ExcepcionPilaVacia( "Pila vacia, no se puede sacar");
        return elementos[superior--]; 
    }
    public boolean contains(E elemento){
        for (int i = superior; i >=0 ; i--){
            if (elementos[i].equals(elemento)){
               return true;
            }
        }
        return false;
    }

} 

public class Actividad_02 {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>(5);
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("¿Está el 20? " + pila.contains(20));
        System.out.println("¿Está el 50? " + pila.contains(50));
    }
}