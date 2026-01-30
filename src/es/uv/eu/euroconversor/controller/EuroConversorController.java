package es.uv.eu.euroconversor.controller;


import es.uv.eu.euroconversor.model.EuroConversorModel;
import es.uv.eu.euroconversor.view.EuroConversorView;
import es.uv.eu.euroconversor.view.ChangeRate;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Iván Escudero y Pau Linares
 */
public class EuroConversorController {

    private EuroConversorModel model;
    private EuroConversorView view;
    private String Num = "";
        public EuroConversorController(EuroConversorModel model,EuroConversorView view){
        this.model =model;
        this.view =view;
        view.setActionListener(new MenuControllerActionListener());
        
    }
    class MenuControllerActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            String command=ae.getActionCommand();
            switch(command){
                case "ItemSalir":
                    System.out.println("MenuController : Menu 'Salir'.");
                    System.exit(0);
                    break;
                case "ItemChange rate":
                    System.out.println("MenuController : Menu 'Change rate'.");
                    ChangeRate cr = new ChangeRate();
                    model.setExchangeRate(cr.getCambio());
                    System.out.println(model.getExchangeRate());
                    break;
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case ".":
                case "C":
                    Num = model.addDigit(command);
                    view.actualizarNumero(Num);
                    System.out.println("MenuController : "+command);
                    break;
                case "ItemConvertir":
                    if(view.isSelectedOp()){
                        Num = model.convertdiv();
                    }
                    else
                        Num = model.convertmult();
                    view.actualizarNumero(Num);
                    System.out.println("MenuController : "+command);
                    break;
                case "ItemClear":
                    model.reset();
                    view.actualizarNumero("0");
                    System.out.println("MenuController : "+command);
                    break;
            }
        }
    }
    public String getNum(){
        return Num;
    }
}