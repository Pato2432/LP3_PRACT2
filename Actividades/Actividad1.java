class Coche{
    String marca;
    String modelo;
    int anofab;
    double precio;
    boolean enMarcha;
    public Coche(String marca,String modelo,int anofab,double precio,boolean enMarcha){
        this.marca=marca;
        this.modelo=modelo;
        this.anofab=anofab;
        this.precio=precio;
        this.enMarcha = false; 
    }
    public Coche(){
        this.marca="N.A";
        this.modelo="N.A";
        this.anofab=0;
        this.precio=0.0;
    }
    public void aplicarDescuento(double descuento){
        if(anofab<2010){
            precio=precio*descuento/100;
            System.out.println("Se aplico el descuento");
        }
        else{
            System.out.println("No se aplico el descuento");
        }
    }
    public void acelerar() {
        if (enMarcha) {
            System.out.println("El coche " + modelo + " esta acelerando.");
        } else {
            System.out.println("Primero enciende el coche.");
        }
    }
    public void frenar() {
        if (enMarcha) {
        System.out.println("El coche " + modelo + " esta frenando.");
    } else {
        System.out.println("El coche esta apagado, no se puede frenar.");
    }
    }
    public void encender() {
        enMarcha = true;
        System.out.println("El coche " + modelo + " se ha encendido.");
    }
    public void apagar() {
        enMarcha = false;
        System.out.println("El coche " + modelo + " se ha apagado.");
    }
}
class EjemploCoche{
    public static void main(String[] args){
        Coche C1=new Coche("DIO","DIOR",2009,1500.00,false);
        C1.encender();
        C1.acelerar();
        C1.frenar();
        C1.apagar();
}    
}
