/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appmysql;
import appmysql.*;


/**
 *
 * @author junglacode
 */
public class AppMysql extends conexion{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //alumnos_class alumno = new alumnos_class();
        materias_class materia = new materias_class();
        if(conexion.GetConnection() != null){
           // System.out.println("se ha conectado ala base de datos");
          // alumno.ingresarAlumno(111124, "the clash");
          // alumno.getTableAlumnos();
            materia.eliminarMateria(1);
          }
    }
    
}
