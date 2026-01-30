package es.uv.eu.euroconversor.view;


import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
*
* @author Iván Escudero y Pau Linares
*/
public class EuroConversorView extends JFrame{
    public ClearPanel j;
    public EuroConversorMenu m; 
    public GrupoP gp;
    public EuroConversorView(){
        super("Calculadora");
        this.setLayout(new BorderLayout());
        
        j= new ClearPanel();
        m= new EuroConversorMenu();
        gp = new GrupoP();
         
        this.setJMenuBar(m);
        this.add(gp, BorderLayout.CENTER);
        this.add(j, BorderLayout.SOUTH);
        
        this.setVisible(true);
        this.setSize(500,500);
    }
    
    public void actualizarNumero(String s){
       gp.ActualizarEtiq(s);
    }
    
    public void setActionListener(ActionListener al)
    {
        m.setActionListener(al);
        gp.setActionListener(al);
        j.setActionListener(al);
    }
    public boolean isSelectedOp(){
        return gp.isSelected();
    }
}


    
    

