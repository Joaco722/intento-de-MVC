/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author joaqu
 */
public class Controlador implements ActionListener{
    
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista vista ,Modelo modelo){
        this.view=vista;
        this.model=modelo;
        this.view.btnMultiplicar.addActionListener(this);
    }
    
    public void inciar(){
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo(null);

    }
    
    public void actionPerformed(ActionEvent e){
        model.setNumeroUno(Integer.parseInt(view.txtNumero1.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumero2.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
}
