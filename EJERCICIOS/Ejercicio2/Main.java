import Modulos.Arquero;
import Modulos.Guerrero;
import Modulos.Habilidad;
import Modulos.Mago;
import Modulos.Personaje;
import Modulos.PersonajeBase;

public class Main {

    public static void main(String[] args) {
        // POLIMORFISMO
        PersonajeBase personaje1 = new Guerrero("Kratos", 10);
        PersonajeBase personaje2 = new Mago("Merlin", 8);
        PersonajeBase personaje3 = new Arquero("Legolas", 9);

        System.out.println("---- ATAQUES -----");

        personaje1.atacar(personaje2);
        personaje2.atacar(personaje3);
        personaje3.atacar(personaje1);


        System.out.println("---- HABILIDADES -----");

        personaje1.usarHabilidad(personaje2);
        personaje2.usarHabilidad(personaje3);
        personaje3.usarHabilidad(personaje1);

        System.out.println("-----------------------------------------");
        // SOBRECARGA DE METODOS

        Personaje p1 = new Personaje("AuronPlay", 5);
        Personaje p2 = new Personaje("Perxitaa", 3);

        Habilidad habilidad = new Habilidad("Bola de Fuego", 20, 10, "Magico");

        System.out.println("--- Usando usarHabilidad(Personaje, Habilidad) ---");
        p1.usarHabilidad(p2, habilidad);
        System.out.println("--- Usando usarHabilidad(Personaje, int) ---");
        p1.usarHabilidad(p2, 1);

    }
}

