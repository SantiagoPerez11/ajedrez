/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author santy
 */
public class Caballo extends Pieza{
    
    final int valor = 3;
    
    public int getValor() {
        return valor;
    }

    public Caballo() {
        color = 'N';
    }

    public Caballo(char color) {
        super(color);
    }
    
    @Override
    public String toString(){
        return "[C]";
    }

    @Override
    public boolean puedeMover(Movimiento movimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}