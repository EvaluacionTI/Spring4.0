package pe.tata.bfp.ibs.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import pe.tata.bfp.ibs.entidad.CEConexion;

public class CDConexionAS400 {
    private Connection moCxn;
    private String mDriver = "";
    private String mJDBC = "";
    private String mServidor = "";
    private String mUsuario = "";
    private String mClave = "";
    
    
    public CDConexionAS400(){
        String lstrDriver = "com.ibm.as400.access.AS400JDBCDriver";
        String lstrJDBC = "jdbc:as400://";
        String lstrBaseDatos = "LAMBDA";
        String lstrServidor = lstrJDBC + lstrBaseDatos;
        String lstrUsuario = "BFPALEDIA";
        String lstrClave = "VASQUEZ5";
        
        this.mDriver = lstrDriver;
        this.mJDBC = lstrJDBC;
        this.mServidor = lstrServidor;
        this.mUsuario = lstrUsuario;
        this.mClave = lstrClave;
    }

    @SuppressWarnings("finally")
	public Connection conexionAS400(){
        try{
            Class.forName(mDriver);
            moCxn = DriverManager.getConnection(mServidor, mUsuario, mClave);
            
            if (!moCxn.isValid(0)){
            	moCxn.close();
            }
            
        }catch(ClassNotFoundException exCNFE){
            System.out.println( exCNFE.getMessage());
        }finally{
            return moCxn;
        }
    }

    @SuppressWarnings("finally")
	public Connection conexionAS400(String psUsuario, String psClave){
        
    	
        try{
            Class.forName(mDriver);
            moCxn = DriverManager.getConnection(mServidor, psUsuario, psClave);
            if (!moCxn.isValid(0)){
            	moCxn.close();
            }
                        
        }catch(ClassNotFoundException exCNFE){
            System.out.println( exCNFE.getMessage());
        }catch(SQLException exSQL){
            if (exSQL.getSQLState().equals("08001")){
                System.out.println("Verificar Conexión a Base Datos; Error N°: " + exSQL.getSQLState());
            }if(exSQL.getSQLState().equals("08004")){
                System.out.println("Verificar Usuario o Clave; Error N�: " + exSQL.getSQLState());
            }
            System.exit(0);
        }finally{
            System.out.println( "Conexion Realizada .....!" + moCxn);
            return moCxn;
        }
    }

    @SuppressWarnings("finally")
	public Connection conexionAS400(CEConexion poCEConexion){
        this.mDriver = poCEConexion.getDriver();
        this.mJDBC = poCEConexion.getJdbc() + "://";
        this.mServidor = this.mJDBC + poCEConexion.getBaseDatos();
        
        try{
            Class.forName(mDriver);
            moCxn = DriverManager.getConnection(mServidor, poCEConexion.getUsuario(), poCEConexion.getClave());
            if (!moCxn.isValid(0)){
            	moCxn.close();
            }
                        
        }catch(ClassNotFoundException exCNFE){
            System.out.println( exCNFE.getMessage());
        }catch(SQLException exSQL){
            if (exSQL.getSQLState().equals("08001")){
                System.out.println("Verificar Conexión a Base Datos; Error N°: " + exSQL.getSQLState());
            }if(exSQL.getSQLState().equals("08004")){
                System.out.println("Verificar Usuario o Clave; Error N°: " + exSQL.getSQLState());
            }
            System.exit(0);
        }finally{
            System.out.println( "Conexion Realizada .....!" + moCxn);
            return moCxn;
        }
    }
}
