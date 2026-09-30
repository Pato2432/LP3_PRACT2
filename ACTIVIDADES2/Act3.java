class IgualGenerico{
    public static <T> boolean esIgualA(T dato1, T dato2) {
        return dato1.equals(dato2);
    }
}
public class Act3 {
    public static void main(String[] args) {
        System.out.println(IgualGenerico.esIgualA(10, 10));
        System.out.println(IgualGenerico.esIgualA("Hola", "Hola"));    
        System.out.println(IgualGenerico.esIgualA(true, true));    
        System.out.println(IgualGenerico.esIgualA(5.5, 5.5));         
        Object objeto1 = new Object();
        Object objeto2 = new Object();
        System.out.println(IgualGenerico.esIgualA(objeto1, objeto2));
        System.out.println(IgualGenerico.esIgualA(null, null));
    }
}