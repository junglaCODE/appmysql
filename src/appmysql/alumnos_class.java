/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author junglacode
 */
public class alumnos_class {

    public void getTableAlumnos() {
        Connection miConexion;
        miConexion = conexion.GetConnection();
        if (miConexion != null) {
            ResultSet resultado;
            try {
                Statement sentencia = miConexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                resultado = sentencia.executeQuery("select * from alumno");//ejecucion de query
                while (resultado.next()) {
                    System.out.println(resultado.getString("nombre") + "---" + resultado.getInt("matricula")+"---"+resultado.getString("carrera"));
                }
            } catch (SQLException e) {
                System.out.println("problemas en la consulta" + e);
            }
        }
    }//fin del metodo

    public void ingresarAlumno(Integer matricula , String nombre) {
        Connection miConexion;
        miConexion = conexion.GetConnection();
        if (miConexion != null) {
            try {
                Statement comando = miConexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                comando.executeUpdate("insert into alumno (matricula,nombre) values ("+matricula+",'"+nombre+"')");
                comando.close();
            } catch (SQLException e) {
                System.out.println("problemas en la consulta" +e);
            }
        }
    }//fin del metodo
}
