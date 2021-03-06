package sistema.devgo.Model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Erik
 * 
 * // referencia: http://www.mballem.com/post/utilizando-swing-com-banco-de-dados/
 * 
 */
 
public class ConexaoBD {
    
        private static final String SERVIDOR = "localhost";//caminho do servidor do BD
        private static final String BANCO ="dbcurso"; //nome do banco de dados
        private static final String URL = "jdbc:mysql://" + SERVIDOR + "/" + BANCO; //url de conexao
	private static final String DRIVER = "com.mysql.jdbc.Driver"; //drive mysql
	private static final String USUARIO = "root"; //nome do usuário do banco de dados
	private static final String SENHA = ""; //senha do usuário do banco de dados
        
  	
       public static Connection getConnection() {
           
    		Connection conn = null; 
                
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}
    
    
    
}
