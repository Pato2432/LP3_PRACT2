package Modulos;

import java.util.ArrayList;

public class SistemaJuego {
    private final static String NOM_MUNDO = "TortillaLand";
    private final ArrayList<Personaje> listaPersonajes;

    public SistemaJuego() {
        this.listaPersonajes = new ArrayList<>();
    }
    public void iniciarPartida() {
        System.out.println("========================================");
        System.out.println("   PARTIDA INICIADA EN " + SistemaJuego.NOM_MUNDO);
        System.out.println("========================================");
    }

    public void registrarPersonaje(Personaje perso) {
        this.listaPersonajes.add(perso);
        System.out.println(perso.getNombre() + " registrado en el sistema.");
    }

    public void mostrarInformacionPersonajes() {
        System.out.println("--- INFORMACION DE PERSONAJES ---");
        if (listaPersonajes.isEmpty()) {
            System.out.println("No hay personajes registrados.");
        } else {
            for (Personaje p : listaPersonajes) {
                p.mostrarEstado();
                System.out.println("--------------------------------");
            }
        }
    }

    public void recolectarObjeto(Personaje p, Objeto obj) {
        p.recogerObjeto(obj);
    }

    public void mostrarEstadoJuego() {
        System.out.println("========================================\n");
        System.out.println("ESTADO DEL SISTEMA");
        System.out.println("Mundo actual: " + SistemaJuego.NOM_MUNDO);
        System.out.println("Total de personajes creados: " + Personaje.getContador());
        System.out.println("Personajes en esta partida: " + listaPersonajes.size());
        
        int vivos = 0;
        for (Personaje p : listaPersonajes) {
            if (p.getVida() > 0) {
                vivos++;
            }
        }
        System.out.println("Personajes con vida: " + vivos);
        System.out.println("========================================\n");
    }
}


