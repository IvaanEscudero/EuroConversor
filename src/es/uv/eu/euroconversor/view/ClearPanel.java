

package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author Iván Escudero y Pau Linares
 */
public class ClearPanel extends JPanel{
   
    private JButton b1;
    public ClearPanel(){
        this.setLayout(new GridLayout(1,1));
        b1 = new JButton("CLEAR");
        this.add(b1);
        this.setVisible(true);
        this.setSize(500,500);
        b1.setActionCommand("ItemClear");
    }
    public void setActionListener(ActionListener actionListener){
        b1.addActionListener(actionListener);
    }
}