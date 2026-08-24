package Modulos;

public class Arquero extends PersonajeBase implements IAtaqueFisico {

    public Arquero(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar(PersonajeBase objetivo) {
        System.out.println(nombre + " dispara una flecha.");
    }

    @Override
    public void ataqueFisico(PersonajeBase objetivo) {
        System.out.println(nombre + " realiza un ataque fisico con su arco.");
    }

    @Override
    public void usarHabilidad(PersonajeBase objetivo) {
        System.out.println(nombre + " utiliza Flecha Explosiva.");
    }
}

