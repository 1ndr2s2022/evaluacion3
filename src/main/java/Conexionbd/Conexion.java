package Conexionbd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
//** se crea el atributo private para que sea mas reutilizable y final para que no cambie el valor//	
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/platinum_bd";
	private static final String USUARIO = "root";
	private static final String	CLAVE = "root";
	
//** se crea un bloque static para no esta cargando el controlador cada vez que llamemos el metodo conectar//
	static {
		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	} 
	
	public Connection conectar() {
		Connection conexion = null;
//** se crea los bloques try-catch por que cada gestor de base de datos proporciona su propia cadena,//

		try {
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conexion OK");
//** y si no se logra cargar correctamente los Drives en el bloque catch se va atrapar esta excepcion, se mostrara el mensaje//				
		} catch (SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
		
		return conexion;
	}		
}	
