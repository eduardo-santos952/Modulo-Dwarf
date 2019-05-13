/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_dwarf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ControladorFerramenta {
    private FerramentaJFrame ferramentaView;
    private ArrayList<Ferramenta> listaFerramenta;  
    private ControladorBANCO controladorBANCO;
    
    protected class InserirListaListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
          Ferramenta ex = ferramentaView.obterFerramenta();
          listaFerramenta.add(ex);
          ferramentaView.insereLista(ex);
          controladorBANCO.inserirFerramenta(ex);
          PlayMusic("comprou_item.wav",0);
        }
        
    }
    protected class InsereBancoListener  implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           //TODO fazer insercao no banco de dados
           Ferramenta ex = ferramentaView.obterFerramenta();
           controladorBANCO.inserirFerramenta(ex);
        }
        
    }
    protected class LimparListaListener  implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
          ferramentaView.limparLista();
          listaFerramenta.clear();
          PlayMusic("limpou_lista.wav",0);
        }
        
    }

    protected class CarregaListaListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            listaFerramenta.clear();
            controladorBANCO.recuperarFerramentas(listaFerramenta);
            ferramentaView.limparLista();
            Iterator<Ferramenta> it = listaFerramenta.iterator();
            while(it.hasNext()){
                Ferramenta ex = it.next();
               ferramentaView.insereLista(ex);
            }            
        }
        
    }
    
//passe qualquer valor != 0 para looping true
public void PlayMusic( String musicLocation, int loop) {
   try{
       File musicPath = new File(musicLocation);
       if (musicPath.exists()) {
           AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
           Clip clip = AudioSystem.getClip();
           clip.open(audioInput);
           clip.start();
           if (loop == 0) {
               clip.loop(loop);
           }else{
           clip.loop(Clip.LOOP_CONTINUOUSLY);
           }
       }
   }
   catch(IOException err)
   {
          System.out.println("file not found");
   }    catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(ControladorFerramenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(ControladorFerramenta.class.getName()).log(Level.SEVERE, null, ex);
        }
}





    public void executar() {
        ferramentaView = new FerramentaJFrame();
        listaFerramenta = new ArrayList<Ferramenta>();
        controladorBANCO = new ControladorBANCO();
        
        ferramentaView.addCarregaListaListener(new CarregaListaListener());
        ferramentaView.addInserirListaListener(new InserirListaListener());
        ferramentaView.addLimpaListaListener(new LimparListaListener());
        ferramentaView.addItemComboBox();
        ferramentaView.setVisible(true);
    }
    
}
