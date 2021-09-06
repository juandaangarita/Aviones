package view;

import controller.ClickEvent;
import controller.InitialData;
import java.awt.GridLayout;
import model.Aviones;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * @author Juan David Angarita
 * @email juandaangarita@gmail.com
 */

public class ControlsPanel extends JPanel {

    private JTable tblResults;
    private JLabel labelAvRegistro;
    private JTextField inputAvRegistro;
    private JLabel labelAvModelo;
    private JTextField inputAvModelo;
    private JLabel labelAvCantidadMotores;
    private JTextField inputAvCantidadMotores;
    private JLabel labelAvTipo;
    private JComboBox inputAvTipo;
    private JLabel labelAvCapacidad;
    private JTextField inputAvCapacidad;
    private JLabel labelAvPropietario;
    private JTextField inputAvPropietario;
    private JButton btnInsertAvion;
    private JButton btnUpdateAvion;
    private JButton btnDeleteAvion;
    private JButton btnGetAllAvion;
    private JButton btnCountAviones;


    public void setTblResults(ArrayList<Aviones> aviones) {
        String[] headers = {"Registro", "Modelo", "Cantidad de Motores", "Tipo", "Capacidad", "Propietario"};
        this.tblResults.removeAll();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(headers);
        this.tblResults.setModel(tableModel);
        for (int i = 0; i < aviones.size(); i++) {
            tableModel.addRow(aviones.get(i).toArray());
        }
    }
    
    public ControlsPanel (ResultsPanel resultsPanel){
        this.tblResults = resultsPanel.getTblResults();
        initComponents();
    }
    
    private void initComponents(){
        setLayout(new GridLayout(8,2));
        InitialData initialData = new InitialData();
        
        // Complete Pacientes info
        this.setTblResults(initialData.getAviones());
        
        labelAvRegistro = new JLabel("Ingrese el registro del avión: ");
        add(labelAvRegistro);
        inputAvRegistro = new JTextField();
        add(inputAvRegistro);
        labelAvModelo = new JLabel("Ingrese el modelo del avión: ");
        add(labelAvModelo);
        inputAvModelo = new JTextField();
        add(inputAvModelo);
        labelAvCantidadMotores = new JLabel("Ingrese la cantidad de motores del avión: ");
        add(labelAvCantidadMotores);
        inputAvCantidadMotores = new JTextField();
        add(inputAvCantidadMotores);
        labelAvTipo = new JLabel("Ingrese el tipo de avión: ");
        add(labelAvTipo);
        inputAvTipo = new JComboBox();
        inputAvTipo.addItem("CARGA");
        inputAvTipo.addItem("PASAJEROS");
        add(inputAvTipo);
        labelAvCapacidad = new JLabel("Ingrese la capacidad del avión: ");
        add(labelAvCapacidad);
        inputAvCapacidad = new JTextField();
        add(inputAvCapacidad);
        labelAvPropietario = new JLabel("Ingrese el propietario del avión: ");
        add(labelAvPropietario);
        inputAvPropietario = new JTextField();
        add(inputAvPropietario);
        
        ClickEvent clickEvent = new ClickEvent(this);
        
        // Insert
        this.btnInsertAvion = new JButton("Insertar Avión");
        add(this.btnInsertAvion);
        this.btnInsertAvion.addActionListener(clickEvent);
        
        // Update
        this.btnUpdateAvion = new JButton("Actualizar Avion");
        add(this.btnUpdateAvion);
        this.btnUpdateAvion.addActionListener(clickEvent);
        
        // Delete
        this.btnDeleteAvion = new JButton("Eliminar Avion");
        add(this.btnDeleteAvion);
        this.btnDeleteAvion.addActionListener(clickEvent);
        
        this.btnCountAviones = new JButton("Cantidad de registros");
        add(this.btnCountAviones);
        this.btnCountAviones.addActionListener(clickEvent);
    }

    public JLabel getLabelAvRegistro() {
        return labelAvRegistro;
    }

    public JTextField getInputAvRegistro() {
        return inputAvRegistro;
    }

    public JLabel getLabelAvModelo() {
        return labelAvModelo;
    }

    public JTextField getInputAvModelo() {
        return inputAvModelo;
    }

    public JLabel getLabelAvCantidadMotores() {
        return labelAvCantidadMotores;
    }

    public JTextField getInputAvCantidadMotores() {
        return inputAvCantidadMotores;
    }

    public JLabel getLabelAvTipo() {
        return labelAvTipo;
    }

    public JComboBox getInputAvTipo() {
        return inputAvTipo;
    }

    public JLabel getLabelAvCapacidad() {
        return labelAvCapacidad;
    }

    public JTextField getInputAvCapacidad() {
        return inputAvCapacidad;
    }

    public JLabel getLabelAvPropietario() {
        return labelAvPropietario;
    }

    public JTextField getInputAvPropietario() {
        return inputAvPropietario;
    }

    public JTable getTblResults() {
        return tblResults;
    }

    public JButton getBtnInsertAvion() {
        return btnInsertAvion;
    }

    public JButton getBtnUpdateAvion() {
        return btnUpdateAvion;
    }

    public JButton getBtnDeleteAvion() {
        return btnDeleteAvion;
    }
    
    public JButton getBtnAllAvion() {
        return btnGetAllAvion;
    }
    
    public JButton getCountAviones() {
        return btnCountAviones;
    }


    public void setTblResults(JTable tblResults) {
        this.tblResults = tblResults;
    }

    public void setLabelAvRegistro(JLabel labelAvRegistro) {
        this.labelAvRegistro = labelAvRegistro;
    }

    public void setInputAvRegistro(JTextField inputAvRegistro) {
        this.inputAvRegistro = inputAvRegistro;
    }

    public void setLabelAvModelo(JLabel labelAvModelo) {
        this.labelAvModelo = labelAvModelo;
    }

    public void setInputAvModelo(JTextField inputAvModelo) {
        this.inputAvModelo = inputAvModelo;
    }

    public void setLabelAvCantidadMotores(JLabel labelAvCantidadMotores) {
        this.labelAvCantidadMotores = labelAvCantidadMotores;
    }

    public void setInputAvCantidadMotores(JTextField inputAvCantidadMotores) {
        this.inputAvCantidadMotores = inputAvCantidadMotores;
    }

    public void setLabelAvTipo(JLabel labelAvTipo) {
        this.labelAvTipo = labelAvTipo;
    }

    public void setInputAvTipo(JComboBox inputAvTipo) {
        this.inputAvTipo = inputAvTipo;
    }

    public void setLabelAvCapacidad(JLabel labelAvCapacidad) {
        this.labelAvCapacidad = labelAvCapacidad;
    }

    public void setInputAvCapacidad(JTextField inputAvCapacidad) {
        this.inputAvCapacidad = inputAvCapacidad;
    }

    public void setLabelAvPropietario(JLabel labelAvPropietario) {
        this.labelAvPropietario = labelAvPropietario;
    }

    public void setInputAvPropietario(JTextField inputAvPropietario) {
        this.inputAvPropietario = inputAvPropietario;
    }

    public void setBtnInsertAvion(JButton btnInsertAvion) {
        this.btnInsertAvion = btnInsertAvion;
    }

    public void setBtnUpdateAvion(JButton btnUpdateAvion) {
        this.btnUpdateAvion = btnUpdateAvion;
    }

    public void setBtnDeleteAvion(JButton btnDeleteAvion) {
        this.btnDeleteAvion = btnDeleteAvion;
    }
    
    public void setBtnGetAllAvion(JButton btnGetAllAvion) {
        this.btnGetAllAvion = btnGetAllAvion;
    }

    public void setBtnCountAviones(JButton btnCountAviones) {
        this.btnCountAviones = btnCountAviones;
    }


}
