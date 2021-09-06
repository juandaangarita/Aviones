package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.ConnectionDB;

/**
 * @author Juan David Angarita
 * @email juandaangarita@gmail.com
 */
public class AvionesDAO {

    private Connection conn;

    // Method Insert, to insert one register in the table aviones
    public void insertAviones(Aviones aviones) {
        String sql = "INSERT INTO aviones (av_registro , av_modelo ,"
                + "av_cantidadMotores ,av_tipo,  av_capacidad, av_propietario )"
                + " VALUES (? ,? , ? , ?, ?, ? );";
        PreparedStatement statement = null;
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            statement = conn.prepareStatement(sql);
            statement.setString(1, aviones.getAvRegistro());
            statement.setString(2, aviones.getAvModelo());
            statement.setInt(3, aviones.getAvCantidadMotores());
            statement.setString(4, aviones.getAvTipo());
            statement.setString(5, aviones.getAvCapacidad());
            statement.setString(6, aviones.getAvPropietario());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Avión agregado exitosamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código: " + ex.getErrorCode()
                    + "\nError: " + ex.getMessage());
        }
    }

    // Method Update, used to update one register when a av_Register is given
    public void updateAviones(Aviones aviones) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "UPDATE aviones SET av_modelo = ?, av_cantidadMotores = ?,"
                    + "av_tipo = ?, av_capacidad = ?, av_propietario = ? "
                    + "WHERE av_registro=?;";
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, aviones.getAvModelo());
            statement.setInt(2, aviones.getAvCantidadMotores());
            statement.setString(3, aviones.getAvTipo());
            statement.setString(4, aviones.getAvCapacidad());
            statement.setString(5, aviones.getAvPropietario());
            statement.setString(6, aviones.getAvRegistro());

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Avión actualizado exitosamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código: " + ex.getErrorCode()
                    + "\nError: " + ex.getMessage());

        }
    }

    //Method Delete, used to delete one register when a register id is given
    public void deleteAviones(Aviones aviones) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "DELETE FROM aviones WHERE av_registro = ?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, aviones.getAvRegistro());
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Avión eliminado exitosamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código: " + ex.getErrorCode()
                    + "\nError: " + ex.getMessage());
        }
    }

    // Method to Select all
    public ArrayList<Aviones> getAllAviones() {
        ArrayList<Aviones> aviones = new ArrayList();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT av_registro , av_modelo ,"
                    + "av_cantidadMotores ,av_tipo, av_capacidad, av_propietario "
                    + " FROM aviones;";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Aviones avion = new Aviones(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(5), result.getString(6));
                aviones.add(avion);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código: " + ex.getErrorCode()
                    + "\nError: " + ex.getMessage());
        }
        return aviones;
    }

    public void countAviones() {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }
            String sql = "SELECT count(av_registro) AS cantidad_registros from aviones";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            result.next();
            String conteo = result.getString("cantidad_registros");
            JOptionPane.showMessageDialog(null, "La cantidad de aviones registrados son: " + conteo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código: " + ex.getErrorCode()
                    + "\nError: " + ex.getMessage());
        }
    }
}
