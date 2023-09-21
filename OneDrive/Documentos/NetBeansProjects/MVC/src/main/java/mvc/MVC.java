/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc;

import modelo.Modelo;
import controlador.Controlador;
import vista.Vista;

/**
 *
 * @author joaqu
 */
public class MVC {
    
    public static void main(String[] args){
        Modelo mod = new Modelo();
        Vista view = new Vista();
        
        Controlador ctrl =new Controlador(view,mod);
        ctrl.inciar();
        view.setVisible(true);
        

    }
    
}
