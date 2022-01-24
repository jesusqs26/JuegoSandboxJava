/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author jesus
 */
public class KeyManager implements KeyListener{

    private boolean[] keys;
    public boolean up,down,left,right;
    
    
    public KeyManager(){
        keys=new boolean[256];
        
    }
    
    /**
     * Va actualiza la dirección en la que el jugador se estará 
     * moviendo cada "tick" 60 veces por segundo, utilizando
     * como patrones la tecla a w s d, pudiesen ser las flechas
     * por defecto del teclado.
     */
    public void tick(){
        up=keys[KeyEvent.VK_W];
          down=keys[KeyEvent.VK_S];
            left=keys[KeyEvent.VK_A];
              right=keys[KeyEvent.VK_D];
    }
    @Override
    public void keyTyped(KeyEvent e) {
      
    }
    
    /**
     * Declarara si algún botón del teclado esta siendo presionado.
     * @param e 
     */
    @Override
    public void keyPressed(KeyEvent e) {
        
        //Prueba si entra correctamente el parámetro de entrada.
      keys[e.getKeyCode()]= true;
//        System.out.println("Pressed");
      
      
    }

    /**
     * Declara que esa tecla se suelta.
     * @param e 
     */
    @Override
    public void keyReleased(KeyEvent e) {
      keys[e.getKeyCode()]= false;
    }
    
}
