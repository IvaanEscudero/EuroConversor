package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Iván Escudero y Pau Linares
 */
public class NumberPanel extends JPanel{
    private JButton[] buttonNumber = new JButton[12];
    private String[] buttonName={"0","1","2","3","4","5","6","7","8","9",".","C"};
    public NumberPanel(){
        setLayout(new GridLayout(3,4));
        
        for (int i=0;i<buttonName.length;i++){
            buttonNumber[i]=new JButton(buttonName[i]);
            this.add(buttonNumber[i]);
            
        }
       
        for (int i=0;i<buttonName.length-2;i++){
            buttonNumber[i].setActionCommand(String.valueOf(i));
        }
        buttonNumber[10].setActionCommand(".");
        buttonNumber[11].setActionCommand("C");
        this.setVisible(true);
        this.setSize(500,500);
    }
    
     public void setActionListener(ActionListener actionListener){
        for(int i = 0; i<buttonName.length;i++){
            buttonNumber[i].addActionListener(actionListener);
        }
     }
}
