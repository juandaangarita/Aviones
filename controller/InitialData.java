package controller;

import java.util.ArrayList;
import model.AvionesDAO;
import model.Aviones;

/**
 * @author Juan David Angarita
 * @email juandaangarita@gmail.com
 */

public class InitialData {
    private ArrayList<Aviones>  aviones = null;

    public void setPacientes(ArrayList<Aviones> pacientes) {
        this.aviones = pacientes;
    }

    public ArrayList<Aviones> getAviones() {
        return aviones;
    }
    
     public InitialData(){
        AvionesDAO avionesDAO = new AvionesDAO();
        this.aviones = avionesDAO.getAllAviones();
        
     }
    
}
