package Conexionbd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TetsConexion {
	public static void main(String[] args) {
//** se crea una instancia de la clase conexion, creando un objeto de conexion//
		Conexion conexion = new Conexion();
		Connection cn = null;
//** se crea la sentencia Sql con el objeto Statement y luego se exporta esta clase//	
		Statement stm = null;
		ResultSet rs = null;
		
//** lugo se encierra en un bloque try-catch utilizando el SqlException//		
		try {
//** se llama el metodo conectar, que se llamara constantemente cada vez que utilcemos la base de datos //
			cn = conexion.conectar();
			stm = cn.createStatement();
//** se llama una sentecia sql y se crea la sentencia SELCt para llamar la tabla usuario, y este resultado es designado a una variable//			
			rs = stm.executeQuery("SELECT * FROM usuario");
			
			while (rs.next()) {
				int idusuario = rs.getInt (1);
				String username = rs.getString(2);
				String password = rs.getString(3);
								
				System.out.println(idusuario + " - " + username + " - " + password);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
