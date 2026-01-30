/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.eu.euroconversor.view;
import javax.swing.JOptionPane;
/**
 *
 * @author Ivan Escudero y Pau Linares
 */
public class ChangeRate extends JOptionPane{
    private String mensaje = "Enter new exchange:\n(0 is not valid)";
    private float cambio;
    public ChangeRate(){
        do
        {
            cambio = Float.parseFloat(JOptionPane.showInputDialog(null,mensaje));
        }
        while(cambio == 0);
    }
    public float getCambio(){
        return cambio;
    }
}
