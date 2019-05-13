/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_dwarf;

/**
 *
 * @author Eduardo
 */
public class Dwarf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            ControladorFerramenta cm = new ControladorFerramenta();
            cm.executar();
            try {
                Thread.sleep(1000);
                         cm.PlayMusic("bgsound.wav",1);
            } catch(InterruptedException ex) {

            }
               
             
           
    }
    
}
