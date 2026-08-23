package Modulos;

public class Cuenta {
    private int numero;
    private double saldo;

    public Cuenta (int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public Cuenta (int numero) {
        this(numero,0);
    }

    public int getNumCuenta(){
        return numero;
    }
    public void setNumCuenta(int numCuenta){
        this.numero = numCuenta;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        if (saldo>=0){
            this.saldo = saldo;
        }
        else{
            System.out.println("No se puede ingresar un saldo negativo");
        }
    }

    @Override
    public String toString(){
        return "Numero de Cuenta: " + this.numero + "\n" + "Saldo: " + this.saldo; 
    }
}


