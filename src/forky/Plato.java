
package forky;

/**
 *
 * @author octa
 */
public class Plato extends Alimento {

    public Plato(String nombre, int precio) {
        super(nombre, precio);
    }
    
    @Override
    public String toString() {
        return "Alimento: "+ super.toString()  ;
    }
    
}
