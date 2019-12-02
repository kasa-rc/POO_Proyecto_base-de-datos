package poo_base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con;
    public  Conexion(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/poo_bd_inventario","root","");
            JOptionPane.showMessageDialog(null, "Se ha conectado con la BD");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la BD" + e.getMessage());
        }
       
    }
    public Connection getConnection(){
        return con;
    }
    
}
