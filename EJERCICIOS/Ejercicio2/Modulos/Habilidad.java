package Modulos;

public class Habilidad {
    final private String nombre;
    final private int danio;
    final private int costMana;
    final private String tipo;

    public Habilidad(String nombre, int danio, int costMana, String tipo){
        this.nombre = nombre;
        this.danio = danio;
        this.costMana = costMana;
        this.tipo = tipo;
    }

    public void ataqueBasico(){
        System.out.println("Se utilizo habilidad");
    }

    public void curacion(){
        System.out.println("Se utilizo curacion");
    }

    public void atacaFuerte(){
        System.out.println("Se utilizo ataque");
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Danio: " + this.danio);
        System.out.println("Costo de mana: " + this.costMana);
        System.out.println("Tipo: " +  this.tipo);
    }

    public String getNombre(){
        return nombre;
    }
    public int getDanio(){
        return danio;
    }
}

