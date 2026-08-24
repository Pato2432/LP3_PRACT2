package Modulos;

public abstract class PersonajeBase {

    protected String nombre;
    protected int vida;
    protected int nivel;

    public PersonajeBase(String nombre, int nivel) {
        this.nombre = nombre;
        this.vida = 100;
        this.nivel = nivel;
    }

    public abstract void atacar(PersonajeBase objetivo);

    public abstract void usarHabilidad(PersonajeBase objetivo);

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Nivel: " + nivel);
    }
}


