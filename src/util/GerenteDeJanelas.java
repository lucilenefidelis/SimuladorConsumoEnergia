/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Luh Joyce
 */
public class GerenteDeJanelas {
   private static JDesktopPane jdpPrincipal;

    public GerenteDeJanelas(JDesktopPane jdPrincipal) {
        GerenteDeJanelas.jdpPrincipal = jdPrincipal;
    }
    
    public void abrirJanelas(JInternalFrame jInternalFrame){
       
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.getFocusOwner();
            try {
                jInternalFrame.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(GerenteDeJanelas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            jdpPrincipal.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }

    } 
}
