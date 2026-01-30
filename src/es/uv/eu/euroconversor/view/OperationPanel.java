package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;

/**
 *
 * @author Iván Escudero y Pau Linares
 */
public class OperationPanel extends JPanel{
    private JRadioButton d_e;
    private JRadioButton e_d;
    private JButton conv;
    private ButtonGroup bg = new ButtonGroup();
    public OperationPanel(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        d_e = new JRadioButton("Dolar-Euro",true);
        e_d = new JRadioButton("Euro-Dolar");
        conv = new JButton("Convert");
        
        
        bg.add(d_e);
        bg.add(e_d);
        
        this.add(d_e);
        this.add(e_d);
        this.add(conv);
        
        d_e.setActionCommand("ItemD_E");
        e_d.setActionCommand("ItemE_D");
        conv.setActionCommand("ItemConvertir");
        
        this.setVisible(true);
        this.setSize(500,500);
    }
    public void setActionListener(ActionListener actionListener){
        bg.getSelection().addActionListener(actionListener);
        conv.addActionListener(actionListener);
    }
    public boolean ReturnSelection(){
        boolean b;
        b = "ItemD_E".equals(bg.getSelection().getActionCommand());
        return b;
    }
    
}