//Codigo final de la clase Contador después de las modificaciones
package Modulos;
public class Contador {
    static int acumulador = 0; 
    final static int VALOR_INICIAL = 10; // Parte E: constante que establece el valor inicial
    private int valor;
    static int nContador = 0;           //Parte J.1: almacena la cantidad de objetos creados
    static int ultimoContador = 0;      //Parte J.2: almacela el valor inical del último contador creado
    
    public static int acumulador(){
        return acumulador;
    }
    
    public static int nContador(){         //Parte J.1: permite consultar cantidad de contadores creados
        return nContador;
    }

    public Contador(int valor) {
        this.valor = valor;
        Contador.acumulador += valor;      // Parte A.2: acceso explícito a la variable estática de la clase
        Contador.nContador++;               //Parte J.1: incrementa la cantidad de contadores creados
        ultimoContador = valor;             //Parte J.2: guarda el valor inicial del último contador creado
    }

    public Contador() {                
        this(Contador.VALOR_INICIAL);       //Parte E: utiliza el valor inicial definido en la constante  
    }

    public void inc() {
        this.valor++;                       //Parte A.3: incrementa el valor del objeto actual.
        acumulador++;
    }

    public int getValor() {
        return this.valor;
    }

    public int getUltimo() {
        return Contador.ultimoContador;     //J.2: permite obtener el valor inicial del último contador creado.
    }
}



