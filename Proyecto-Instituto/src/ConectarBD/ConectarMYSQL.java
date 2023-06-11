package ConectarBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConectarMYSQL {
	
	 String url="jdbc:mysql://localhost:3306/bdinstituto";
	 String usuario="root";
	 String password="";
	 Connection con;
	 
	 public Connection conexionbd(){
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			// aplicamos la clase para conectarnos con la base de datos
	
			con=DriverManager.getConnection(url,usuario,password);
			
			if(con!= null)JOptionPane.showMessageDialog(null,"Conexion Exitosa con la BD!!!",
			"MENSAJE",JOptionPane.INFORMATION_MESSAGE);
				
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return con;
	 }

}// FIN DE LA CLASE...
