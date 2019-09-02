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
public class Mesa {
    private int numerodemesa;

    public Mesa(int numerodemesa) {
        this.numerodemesa = numerodemesa;
    }

    public int getNumerodemesa() {
        return numerodemesa;
    }

    public void setNumerodemesa(int numerodemesa) {
        this.numerodemesa = numerodemesa;
    }

    @Override
    public String toString() {
        return "Mesa = " + numerodemesa;
    }
    
    
    
    
    
}
