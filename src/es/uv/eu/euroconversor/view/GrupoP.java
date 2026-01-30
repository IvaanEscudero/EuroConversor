/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.eu.euroconversor.view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Iván Escudero y Pau Linares
 */
public class GrupoP extends JPanel {
    private NumberPanel np = new NumberPanel();
    private OperationPanel o = new OperationPanel();
    private DisplayPanel dp = new DisplayPanel();
    public GrupoP(){
        setLayout(new BorderLayout());

        this.add(dp, BorderLayout.NORTH);
        this.add(np, BorderLayout.CENTER);
        this.add(o, BorderLayout.EAST);
        this.setVisible(true);
        
    }
    
    public void ActualizarEtiq(String s){
        dp.ActualizarLabel(s);
    }
    public void setActionListener(ActionListener actionListener){
        np.setActionListener(actionListener);
        o.setActionListener(actionListener);
    }
    public boolean isSelected(){
       return o.ReturnSelection();
    }
}
