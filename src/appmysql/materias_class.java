/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author junglacode
 */
public class materias_class {

    public void eliminarMateria(Integer clave) {
        Connection miConexion;
        miConexion = conexion.GetConnection();
        try {
            Statement comando = miConexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            comando.executeUpdate("delete from ingresos where codigo = "+clave);
            comando.close();
        } catch (SQLException e) {
            System.out.println("problemas en la consulta" + e);
        }
    }
}
