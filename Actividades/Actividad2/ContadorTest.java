import Modulos.Contador;
public class ContadorTest {
    public static void main(String[] args) {
        Contador c1, c2, c3;
        System.out.println("Acumulador: " + Contador.acumulador());
        System.out.println("Contador: " + Contador.nContador());
        c1= new Contador (3);
        c2= new Contador(10);
        c3= new Contador();
        c1.inc();
        c2.inc();
        c3.inc();
        System.out.println(c1.getValor());
        System.out.println(c2.getValor());
        System.out.println(c3.getValor());
        System.out.println("Acumulador: " + Contador.acumulador());
        System.out.println("Contador: " + Contador.nContador());
        System.out.println("Valor del ultimo contador: " + c3.getUltimo());
    }
}
