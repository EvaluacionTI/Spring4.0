package tata.bfp.db2.vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CV01v01RevisarConexionDb2 {
	Connection moCxn = null;
    static String mRpta;
    
	public static void main(String[] args) {
		String lstrDriver = "com.ibm.as400.access.AS400JDBCDriver";
        String lstrJDBC = "jdbc:as400://";
        String lstrBaseDatos = "LAMBDA";
        String lstrServidor = lstrJDBC + lstrBaseDatos;
        String lstrUsuario = "BFPALEDIA";
        String lstrClave = "VASQUEZ4";
        
        try{
            Class.forName(lstrDriver);
            Connection moCxn = DriverManager.getConnection(lstrServidor, lstrUsuario, lstrClave);
            mRpta = moCxn.getCatalog();
            
        }catch(ClassNotFoundException exCNFE){
            System.out.println( "Verificar Driver de Clases : " + exCNFE.getMessage());
            System.exit(0);
        }catch(SQLException exSQL){
            if (exSQL.getSQLState().equals("08001")){
                System.out.println("Verificar Conexión a Base Datos; Error N°: " + exSQL.getSQLState());
            }if(exSQL.getSQLState().equals("08004")){
                System.out.println("Verificar Usuario o Clave; Error N°: " + exSQL.getSQLState());
            }
            System.exit(0);
        }finally{
            System.out.println( "Conexion Realizada .....!" + mRpta);
        }

	}

}
