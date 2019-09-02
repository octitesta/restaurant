
package forky;

public class Bebida extends Alimento {

    public Bebida(String nombre, int precio) {
        super(nombre, precio);
    }
    
    @Override
    public String toString() {
        return "Bebida: "+ super.toString()  ;
    }
    
}
