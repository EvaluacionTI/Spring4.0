/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tata.bfp.db2.modelo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.activation.DataSource;

/**
 *
 * 
 */
public class CDDataSourceOracle {
    private Connection con;
        private static DataSource instancia;
        private String url, username, password;
        private CDDataSourceOracle() {
                
        try {

            Properties prop = new Properties();
            prop.load(new FileInputStream("datasource.properties"));

            Class.forName(prop.getProperty("driver"));

            String host = prop.getProperty("host");
            String port = prop.getProperty("port");
            String database = prop.getProperty("database");
            url = "jdbc:oracle:thin:@" + host + ":" + port + ":" + database;
            username = prop.getProperty("username");
            password = prop.getProperty("password");
                }
        catch (Exception e) {
            System.out.println("Parametros de conexion incorrectos.");
                }
        }
        public static synchronized DataSource getInstance() {
                if (instancia == null)
                        instancia = new DataSource() {
                    @Override
                    public InputStream getInputStream() throws IOException {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public OutputStream getOutputStream() throws IOException {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public String getContentType() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public String getName() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };
                return instancia;
        }
        public synchronized Connection getConnection() throws SQLException {            
                
                if (con == null || con.isClosed())
                        con = DriverManager.getConnection(url, username, password);
                return con;
        }
        public synchronized void close() throws SQLException {
                if (con != null && !con.isClosed())
                        con.close();
        }
        /* Esta es la clase DataSource que es la que te devuelve un objeto connection y luego dentro de proyecto te puedes hacer un fichero datasource.properties con los parametros que contenga algo asi 
host=127.0.0.1
port=1521
database=XE
username=NOMBRE_SCHEMA
password=PASSWORD_SCHEMA
driver=oracle.jdbc.driver.OracleDriver*/
}
