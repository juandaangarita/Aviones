package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.AvionesDAO;
import model.Aviones;
import view.ControlsPanel;

/**
 * @author Juan David Angarita
 * @email juandaangarita@gmail.com
 */
public class ClickEvent implements ActionListener {

    private ControlsPanel controlsPanel;

    public ClickEvent(ControlsPanel controlsPanel) {
        this.controlsPanel = controlsPanel;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.controlsPanel.getBtnInsertAvion()) {
            AvionesDAO avionesDAO = new AvionesDAO();
            String avRegistro = (String) this.controlsPanel.getInputAvRegistro().getText();
            String avModelo = (String) this.controlsPanel.getInputAvModelo().getText();
            Integer avCantidadMotores = (new Integer(this.controlsPanel.getInputAvCantidadMotores().getText()));
            String avTipo = (String) this.controlsPanel.getInputAvTipo().getSelectedItem();
            String avCapacidad = (String) this.controlsPanel.getInputAvCapacidad().getText();
            String avPropietario = (String) this.controlsPanel.getInputAvPropietario().getText();
            Aviones aviones = new Aviones(avRegistro, avModelo, avCantidadMotores, avTipo, avCapacidad, avPropietario);
            avionesDAO.insertAviones(aviones);

            this.controlsPanel.setTblResults(avionesDAO.getAllAviones());

        } else if (actionEvent.getSource() == this.controlsPanel.getBtnUpdateAvion()) {
            AvionesDAO avionesDAO = new AvionesDAO();
            String avRegistro = (String) this.controlsPanel.getInputAvRegistro().getText();
            String avModelo = (String) this.controlsPanel.getInputAvModelo().getText();
            Integer avCantidadMotores = (new Integer(this.controlsPanel.getInputAvCantidadMotores().getText()));
            String avTipo = (String) this.controlsPanel.getInputAvTipo().getSelectedItem();
            String avCapacidad = (String) this.controlsPanel.getInputAvCapacidad().getText();
            String avPropietario = (String) this.controlsPanel.getInputAvPropietario().getText();
            Aviones aviones = new Aviones(avRegistro, avModelo, avCantidadMotores, avTipo, avCapacidad, avPropietario);
            avionesDAO.updateAviones(aviones);

        } else if (actionEvent.getSource() == this.controlsPanel.getBtnDeleteAvion()) {
            AvionesDAO avionesDAO = new AvionesDAO();
            String avRegistro = (String) this.controlsPanel.getInputAvRegistro().getText();
            Aviones aviones = new Aviones(avRegistro, null, 0, null, null, null);
            avionesDAO.deleteAviones(aviones);
            this.controlsPanel.setTblResults(avionesDAO.getAllAviones());

        } else if (actionEvent.getSource() == this.controlsPanel.getCountAviones()) {
            AvionesDAO avionesDAO = new AvionesDAO();
            avionesDAO.countAviones();

        }
    }
}
