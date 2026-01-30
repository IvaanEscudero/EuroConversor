package es.uv.eu.euroconversor.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Graphics;
import java.awt.BorderLayout;

/**
 *
 * @author Iván Escudero y Pau Linares
 */
public class DisplayPanel extends JPanel{
    
    private JLabel pantalla = new JLabel("0");
    public DisplayPanel(){
        this.setLayout(new BorderLayout());
        
        this.add(pantalla);
        pantalla.setHorizontalAlignment(JLabel.RIGHT);
        pantalla.setFont(new Font("Sans",Font.BOLD,40));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        this.setBackground(Color.pink);
        this.setSize(400,400);
        this.setVisible(true);
    }
    public void ActualizarLabel(String s){
        pantalla.setText(s);
    }
    
}