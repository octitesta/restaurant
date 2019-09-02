/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forky;

/**
 *
 * @author octa
 */
public class Postre extends Alimento {

    public Postre(String nombre, int precio) {
        super(nombre, precio);
    }
    
    @Override
    public String toString() {
        return "Postre: "+ super.toString()  ;
    }
}
