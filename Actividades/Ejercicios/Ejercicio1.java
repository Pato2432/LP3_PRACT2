class Par <F,S>{
    F par1;
    S par2;
    public Par(F par1, S par2){
        this.par1=par1;
        this.par2=par2;
    }
    public F getPrimero(){
        return par1;
    }
    public S getSegundo(){
        return par2;
    }
    public void setPrimero(F cambio){
        par1=cambio;
    }
    public void setSegundo(S cambio){
        par2=cambio;
    }
    public String toString() {
        return "(Primero: " + par1 + ", Segundo: " + par2 + ")";
    }
    public boolean esIgual(Par<F, S> otroPar) {
        if (par1.equals(otroPar.getPrimero()) && par2.equals(otroPar.getSegundo())) {
            return true;
        }
        else {
            return false;
        }
    }
}
public class Ejercicio1 {
    public static <F,S> void imprimirPar(Par<F,S> otro){
        System.out.println(otro);
    }
    public static void main(String[] args){
        Par<Integer,Integer> par1 = new Par<>(12, 5);
        Par<Integer,Integer> par2 = new Par<>(12, 5);
        System.out.println(par1.esIgual(par2));
        imprimirPar(par1);
        imprimirPar(par2);
    }
}