package Modulos;

public class Personaje {
    private String nombre;
    private int vida;
    private int nivel;
    private Inventario inventario;
    private final Habilidad[] habilidades = new Habilidad[3];
    
    static int contador = 0;
    public static  int danioBase = 10;
    
    private final static  int MAX_VIDA = 100;
    private final static int MAX_NIVEL = 50;
    

    public Personaje(String nombre, int nivel, Inventario inventario){
        this.nombre = nombre;
        this.vida = MAX_VIDA;
        this.nivel = nivel;
        this.inventario = inventario;
        Personaje.contador++;
        habilidades[0] = new Habilidad("Ataque basico", 10, 0, "Fisico");
        habilidades[1] = new Habilidad("Golpe fuerte", 20, 10, "Fisico");
        habilidades[2] = new Habilidad("Defensa", 0, 5, "Defensivo");
    }

    public Personaje(String nombre, int nivel){
        this.nombre = nombre;
        this.vida = MAX_VIDA;
        this.nivel = nivel;
        this.inventario = new Inventario();
        Personaje.contador++;
        habilidades[0] = new Habilidad("Ataque basico", 10, 0, "Fisico");
        habilidades[1] = new Habilidad("Golpe fuerte", 20, 10, "Fisico");
        habilidades[2] = new Habilidad("Defensa", 0, 5, "Defensivo");
    }

    public Personaje(){
        this("PersonajeDefault",1, new Inventario());
    }

    public void atacar(Personaje perso){
        int danio = calcularDanio();
        System.out.println(this.nombre + " ataca con " + danio + " de danio a " + perso.nombre);
        perso.recibirDanio(danio);
    }

    public void mostrarHabilidades(){
        System.out.println("HABILIDADES");
        for (Habilidad h : habilidades) {
            if (h != null) {
                h.mostrarInfo();
                System.out.println("--------------------------------");
            }
        }
    }

    public void usarHabilidad(Personaje perso, Habilidad habi){
        System.out.println(this.nombre + " usa " + habi.getNombre() + " sobre " + perso.getNombre());
        perso.recibirDanio(habi.getDanio());
    }

    public void usarHabilidad(Personaje perso, int posicion ){
        if(posicion >= 0 && posicion < habilidades.length && habilidades[posicion] != null){
            Habilidad habi = habilidades[posicion];
            System.out.println(this.nombre + " usa " + habi.getNombre() + " sobre " + perso.getNombre());
            perso.recibirDanio(habi.getDanio());
        }
    }

    public void recogerObjeto(Objeto obj){
        obj.recogido();
        System.out.println(this.nombre + " recogio " + obj.getNombre());
        obj.mostrarInfo();
        this.inventario.agregarObjeto(obj);

    }

    private int calcularDanio(){
        int danioCalculado = danioBase *this.nivel;
        return danioCalculado;
    }

    protected void recibirDanio(int danio){
        this.vida -= danio;
        if(this.vida<=0){
            this.vida = 0;
            System.out.println(this.nombre + " ha muerto");
        }
        else{
            System.out.println(this.nombre + " ha recibido danio");
            System.out.println("Vida restante: " + this.vida);
        }
    }

    void mostrarEstado(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Vida: " + this.vida);
        System.out.println("Nivel: "+ this.nivel);
        System.out.println("Danio: "+ calcularDanio());
        mostrarHabilidades();
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre.isEmpty()){
            System.out.println("El nombre no puede estar vacio");
        }
        else {
            this.nombre = nombre;
        }
    }

    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        if(vida <= 0){
            this.vida = 0;
        }
        else if(vida > MAX_VIDA){
            this.vida = MAX_VIDA;
        }
        else{
            this.vida = vida;
        }
    }
    
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){    
        if(nivel>=1 && nivel<=MAX_NIVEL){
            this.nivel = nivel;
        }
        else{
            System.out.println("No se pudo subir nivel");
        }
    }

    public Inventario getInventario(){
        return inventario;
    }

    public static int getContador(){
        return contador;
    }
}
