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
    
    public boolean esIgual(Pila<E> otraPila) {
        if (superior != otraPila.superior) {
            return false;
        }
        for (int i = superior; i >= 0; i--) {
            if (!elementos[i].equals(otraPila.elementos[i])) {
                return false;
            }
        }
        return true;
    }
} 

public class Actividad_04 {
    public static void main(String[] args) {
        Pila<Integer> pila1 = new Pila<>(5);
        Pila<Integer> pila2 = new Pila<>(5);
        pila1.push(10);
        pila1.push(20);
        pila1.push(30);

        pila2.push(10);
        pila2.push(20);
        pila2.push(30);
        System.out.println("Las pilas son iguales? "+ pila1.esIgual(pila2));

        Pila<Integer> pila3 = new Pila<>(5);
        Pila<Integer> pila4 = new Pila<>(5);
        pila3.push(14);
        pila3.push(26);
        pila3.push(33);
        
        pila4.push(14);
        pila4.push(28);
        pila4.push(33);
        System.out.println("Las pilas son iguales? "+ pila3.esIgual(pila4));
    }
}
