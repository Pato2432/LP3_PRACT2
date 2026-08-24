package Modulos;

public class Inventario {
    private final Objeto[] inventario = new Objeto[20];

    public void agregarObjeto(Objeto obj){
        boolean agregado = false;
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) { 
                inventario[i] = obj; 
                agregado = true;
                System.out.println("Se anadio el objeto " + obj.getNombre()+" al inventario");
                break; 
            }
        }
        if (!agregado) {
            System.out.println("No se pudo añadir. El inventario está lleno.");
        }
    }

    public void eliminarObjeto(Objeto obj){
        if(existe(obj)){
            for (int i = 0; i < inventario.length; i++) {
                if(inventario[i]==obj){
                    inventario[i] = null;
                    System.out.println("Se elimino objeto correctamente del inventario");
                    break;
                }
            }
        }
        else{
            System.out.println("El objeto no existe en el inveltario");
        }
    }
    
    private boolean existe(Objeto obj){
        for(Objeto o : inventario){
            if(o == obj && o != null){
                return true;
            }
        }
        return false;
    }

    public void mostrarInventario(){
        System.out.println("INVENTARIO");
        boolean vacio = true;
        for (Objeto o : inventario) {
            if (o != null) {
                System.out.println("- " + o.getNombre());
                vacio = false;
            }
        }
        if(vacio) {
            System.out.println("(El inventario está vacío)");
        }
    }

    public void buscarObjeto(Objeto obj){
        if(existe(obj)){
            System.out.println("Se encontró el objeto en el inventario:");
            obj.mostrarInfo();
        }
        else{
            System.out.println("El objeto no existe en el inveltario");
        }
    }
}


