package tata.bfp.db2.entidad;

public class CEConexion {
    private String driver;
    private String jdbc;
    private String servidor;
    private String puerto;
    private String instancia;    
    private String baseDatos;
    private String usuario;
    private String clave;

	public String getDriver() {
		return driver;
	}
	public String getJdbc() {
		return jdbc;
	}
	public String getServidor() {
		return servidor;
	}
	public String getPuerto() {
		return puerto;
	}
	public String getInstancia() {
		return instancia;
	}
	public String getBaseDatos() {
		return baseDatos;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setJdbc(String jdbc) {
		this.jdbc = jdbc;
	}
	public void setServidor(String servidor) {
		this.servidor = servidor;
	}
	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}
	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}
	public void setBaseDatos(String baseDatos) {
		this.baseDatos = baseDatos;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
    
    
}
