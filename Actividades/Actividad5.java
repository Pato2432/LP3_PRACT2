import java.util.Scanner;
class Cuenta{
    String nombre;
    int numeroCuenta;
    double saldo;
    public Cuenta(String nombre, double saldo,int numeroCuenta){
        this.nombre=nombre;
        this.saldo=saldo;
        this.numeroCuenta=numeroCuenta;
    }
    public void depositar(double monto){
        saldo+=monto;
        System.out.println("Se deposito el dinero..");
        System.out.println("Saldo actual: " + saldo);
    }
    public void retirar(double monto){
        if(monto<=saldo){
            saldo-=monto;
            System.out.println("Se retiro el dinero soliticitado...");
            System.out.println("Saldo actual: " + saldo);
        }
        else{
            System.out.println("Saldo insuficiente para retirar el dinero");
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public void consultar(){
    }
}
class CuentaAhorros extends Cuenta{
    double tasainteres;
    double minsaldo;
    public CuentaAhorros(double tasainteres,double minsaldo,String nombre,double saldo,int numeroCuenta){
        super(nombre, saldo,numeroCuenta);
        this.tasainteres=tasainteres;
        this.minsaldo=minsaldo;
    }
    public void setInteres(double interes){
        tasainteres=interes;
    }
    @Override
    public void retirar(double monto) {
        super.retirar(monto);
        if (saldo < minsaldo){
            minsaldo = saldo;
        }
    }
    @Override
    public void consultar(){
        double interes = minsaldo * tasainteres / 100;
        depositar(interes);
        minsaldo = saldo;
    }
}
class CuentaCorriente extends Cuenta{
    int retiros;
    public CuentaCorriente(int retiros,String nombre,double saldo,int numeroCuenta){
        super(nombre, saldo,numeroCuenta);
        this.retiros=retiros;
    }
    @Override
    public void retirar(double monto) {
        double total = monto;
        if (retiros >= 3) {
            total = monto + 3;
        }
        if (total <= saldo) {
            retiros++;
            super.retirar(total);
        } 
        else {
            System.out.println("Saldo insuficiente para retirar el dinero");
        }
    }
    @Override
    public void consultar() {
        retiros = 0;
    }
}
public class act3 {
    public static void main(String[] args) {
        Scanner out=new Scanner(System.in);
        Cuenta[] cuentas = new Cuenta[10];
        cuentas[0] = new CuentaAhorros(3.5, 1000, "Juan", 1000, 101);
        cuentas[1] = new CuentaAhorros(4.0, 1500, "Maria", 1500, 102);
        cuentas[2] = new CuentaAhorros(2.5, 2000, "Pedro", 2000, 103);
        cuentas[3] = new CuentaAhorros(3.0, 2500, "Lucia", 2500, 104);
        cuentas[4] = new CuentaAhorros(4.5, 3000, "Carlos", 3000, 105);
        cuentas[5] = new CuentaCorriente(0, "Ana", 1000, 201);
        cuentas[6] = new CuentaCorriente(0, "Luis", 1500, 202);
        cuentas[7] = new CuentaCorriente(0, "Jose", 2000, 203);
        cuentas[8] = new CuentaCorriente(0, "Rosa", 2500, 204);
        cuentas[9] = new CuentaCorriente(0, "Diego", 3000, 205);
        while (true){
            boolean valor=false;
            System.out.println("Bienvenido al menu:");
            System.out.println("D) Depositar");
            System.out.println("R) Retirar");
            System.out.println("C) Consultar");
            System.out.println("S) Salir");
            System.out.print("Digite que hacer: ");
            String deci=out.next();
            if(deci.equals("D")){
                System.out.print("Digite el numero de cuenta: ");
                int num=out.nextInt();
                for(int i=0;i<cuentas.length;i++){
                    if(num==cuentas[i].numeroCuenta){
                        System.out.print("Digite el monto a depositar: ");
                        double monto=out.nextDouble();
                        cuentas[i].depositar(monto);
                        valor=true;
                        break;
                    }
                }
                if(valor==true){
                    valor=false;
                }
                else{
                    System.out.println("No se encontro la cuenta..");
                }
            }
            if(deci.equals("R")){
                System.out.print("Digite el numero de cuenta: ");
                int cc=out.nextInt();
                for(int i=0;i<cuentas.length;i++){
                    if(cc==cuentas[i].numeroCuenta){
                        System.out.print("Digite el monto a retirar: ");
                        double m=out.nextDouble();
                        cuentas[i].retirar(m);
                        valor=true;
                        break;
                    }
                }
                if(valor==true){
                    valor=false;
                }
                else{
                    System.out.print("No se encontro la cuenta..");
                }
            }
            if(deci.equals("C")){
                for(int i = 0; i < cuentas.length; i++){
                    cuentas[i].consultar();
                    System.out.println("Cuenta: " + cuentas[i].numeroCuenta);
                    System.out.println("Nombre: " + cuentas[i].nombre);
                    System.out.println("Saldo: " + cuentas[i].getSaldo());
                }
            }
            if(deci.equals("S")){
                break;
            }
        }
    }
}
