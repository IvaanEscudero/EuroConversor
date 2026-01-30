/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.euroconversor.view;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Iván Escudero y Pau Linares
 */
public class EuroConversorMenu extends JMenuBar{
    private JMenu cambio;
    private JMenuItem item1;
    private JMenuItem item2;
    private ChangeRate cr;
    public EuroConversorMenu(){
        cambio = new JMenu("EuroConversor");
        item1 = new JMenuItem("Salir");
        item2 = new JMenuItem("Change rate");
        item1.setActionCommand("ItemSalir");
        item2.setActionCommand("ItemChange rate");
        this.cambio.add(item1);
        this.cambio.add(item2);
        this.add(cambio);
        this.setVisible(true);
        this.setSize(500,500);

    }
    public void setActionListener(ActionListener actionListener){
        item1.addActionListener(actionListener);
        item2.addActionListener(actionListener);
    }
}
