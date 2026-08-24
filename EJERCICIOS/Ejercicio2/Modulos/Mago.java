package Modulos;

public class Mago extends PersonajeBase implements IAtaqueMagico{

    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar(PersonajeBase objetivo) {
        System.out.println(nombre + " ataca con magia.");
    }

    @Override
    public void ataqueMagico(PersonajeBase objetivo) {
        System.out.println(nombre + " realiza un ataque mágico.");
    }

    @Override
    public void usarHabilidad(PersonajeBase objetivo) {
        System.out.println(nombre + " lanza una Bola de Fuego.");
    }
}


