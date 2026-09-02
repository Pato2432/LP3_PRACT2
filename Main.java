import java.util.ArrayList;
import java.util.Scanner;

public class Contacto {
    private int numero;
    private String nombreContacto;
    private String correo;
    
    public Contacto(int numero, String nombreContacto, String correo) {
        this.numero = numero;
        this.nombreContacto = nombreContacto;
        this.correo = correo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNombre(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void mostrarInfo() {
        System.out.println("CONTACTO: " + this.nombreContacto);
        System.out.println("NUMERO: " + this.numero);
        System.out.println("Correo: " + this.correo);
    }
}

public class GestorDeContacto {
    private ArrayList<Contacto> contactos = new ArrayList<>();
    Scanner leer = new Scanner(System.in);
    
    public void agregar() {
        System.out.println("Ingrese numero:");
        int numero = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese nombre:");
        String nombre = leer.nextLine();

        System.out.println("Ingrese correo:");
        String correo = leer.nextLine();

        Contacto contacto = new Contacto(numero, nombre, correo);
        contactos.add(contacto);

        System.out.println("Contacto agregado correctamente.");
    }

    public void eliminar() {
        System.out.println("Ingrese nombre para buscar");
        String nombreBuscar = leer.nextLine();

        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombreContacto().equals(nombreBuscar)) {
                contactos.remove(i);
                System.out.println("Se elimino el contacto");
                return;
            }
        }

        System.out.println("No se elimino el contacto");
    }

    public void modificarNombre(Contacto cont) {
        System.out.println("Ingrese nombre: ");
        String nuevoNombre = leer.nextLine();
        cont.setNombre(nuevoNombre);
    }

    public void mostrarContactos() {
        System.out.println("          CONTACTOS          ");

        for (Contacto cont : contactos) {
            System.out.println("- " + cont.getNombreContacto() + ", numero : " + cont.getNumero());
        }
    }

    public void buscarNombre() {
        System.out.println("Ingrese nombre para buscar");
        String nombreBuscar = leer.nextLine();

        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombreContacto().equals(nombreBuscar)) {
                contactos.get(i).mostrarInfo();
                return;
            }
        }

        System.out.println("No se encontro el contacto");
    }
}


