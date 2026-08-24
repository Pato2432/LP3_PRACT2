package Modulos;

public class Guerrero extends PersonajeBase implements IAtaqueFisico {

    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar(PersonajeBase objetivo) {
        System.out.println(nombre + " ataca con su espada.");
    }

    @Override
    public void ataqueFisico(PersonajeBase objetivo) {
        System.out.println(nombre + " realiza un ataque fisico con su espada.");
    }

    @Override
    public void usarHabilidad(PersonajeBase objetivo) {
        System.out.println(nombre + " utiliza Golpe Poderoso.");
    }
}


