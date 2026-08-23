package Modulos;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    final private Cuenta cuenta;
    public Persona(int id, String nombre, String apellido, int numero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta(numero);
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre.isEmpty()){
            System.out.println("No puede estar el nombre vacio");
        }
        else{
            this.nombre = nombre;
        }
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        if(apellido.isEmpty()){
            System.out.println("No puede estar el apellido vacio");
        }
        else{
            this.apellido = apellido;
        }
    }

    public Cuenta getCuenta(){
        return cuenta;
    }

    @Override
    public String toString(){
        
        return "ID: " + this.id + "\n" +
           "Nombre: " + this.nombre + " " + this.apellido + "\n" +
           "Cuenta: " + this.cuenta;
    }
}

