package model;

/**
 * @author Juan David Angarita
 * @email juandaangarita@gmail.com
 */

public class Aviones {

    //Atributos

    private String avRegistro;
    private String avModelo;
    private int avCantidadMotores;
    private String avTipo;
    private String avCapacidad;
    private String avPropietario;
    
    //Constructor
    public Aviones(String avRegistro, String avModelo, int avCantidadMotores, String avTipo, String avCapacidad, String avPropietario) {
        this.avRegistro = avRegistro;
        this.avModelo = avModelo;
        this.avCantidadMotores = avCantidadMotores;
        this.avTipo = avTipo;
        this.avCapacidad = avCapacidad;
        this.avPropietario = avPropietario;
    }
    
    // Get para obtener los valores
    public String getAvRegistro() {
        return avRegistro;
    }

    public String getAvModelo() {
        return avModelo;
    }

    public int getAvCantidadMotores() {
        return avCantidadMotores;
    }

    public String getAvTipo() {
        return avTipo;
    }

    public String getAvCapacidad() {
        return avCapacidad;
    }
    
    public String getAvPropietario() {
        return avPropietario;
    }
    
    // Set para definir el valor

    public void setAvRegistro(String avRegistro) {
        this.avRegistro = avRegistro;
    }

    public void setAvModelo(String avModelo) {
        this.avModelo = avModelo;
    }

    public void setAvCantidadMotores(int avCantidadMotores) {
        this.avCantidadMotores = avCantidadMotores;
    }

    public void setAvTipo(String avTipo) {
        this.avTipo = avTipo;
    }

    public void setAvCapacidad(String avCapacidad) {
        this.avCapacidad = avCapacidad;
    }

    public void setAvPropietario(String avPropietario) {
        this.avPropietario = avPropietario;
    }      
    
    public Object[] toArray(){
        Object[] data = {avRegistro, avModelo, avCantidadMotores, avTipo, avCapacidad, avPropietario};
        return data;
    }
}
