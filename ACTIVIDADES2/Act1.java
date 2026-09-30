class InvalidSubscriptException extends Exception{
    public InvalidSubscriptException(String mensaje){
        super(mensaje);
    }
}
public class Act1 {
    public static <T> void imprimirArreglo(T[] arreglo) {
        for (T dato : arreglo) {
            System.out.println(dato);
        }
    }
    public static <T> int imprimirArreglo(T[] arreglo, int inicio, int fin) throws InvalidSubscriptException {
        int cantidad = 0;
        if (inicio < 0 || fin < 0 || inicio >= arreglo.length || fin >= arreglo.length || fin <= inicio) {
            throw new InvalidSubscriptException("NO se admite numeros negativos ");
        }
        for (int i = inicio; i <= fin; i++) {
            System.out.println(arreglo[i]);
            cantidad++;
        }
        return cantidad;
    }
    public static void main(String[] args) {
        Integer[] numeros = {10, 20, 30, 40};
        Double[] decimales = {1.1, 2.2, 3.3, 4.4};
        Character[] letras = {'H', 'O', 'L', 'A'};
        imprimirArreglo(numeros);
        imprimirArreglo(decimales);
        imprimirArreglo(letras);
        try {
            System.out.println("PARTE DE INTEGER:");
            int cantidad1 = imprimirArreglo(numeros, 1, 3);
            System.out.println("Cantidad: " + cantidad1);
            System.out.println("PARTE DE DOUBLE:");
            int cantidad2 = imprimirArreglo(decimales, 1, 3);
            System.out.println("Cantidad: " + cantidad2);
            System.out.println("PARTE DE CHARACTER:");
            int cantidad3 = imprimirArreglo(letras, 1, 3);
            System.out.println("Cantidad: " + cantidad3);
        }
        catch (InvalidSubscriptException e) {
            System.out.println(e.getMessage());
        }
    }
}