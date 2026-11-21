package biblioteca.com.clases;

//Clase Usuario
public class Usuario {

	// Constructor de la clase Usuario, donde se definen los parametros con la información necesaria para que los Usuarios del aplicativo
	// interactuen con el sistema
	public Usuario(Integer id, String nombre, String tDocumento, String nDocumento, String alias, char[] contrasena,
			String rol) {
		
		// Se asignan los parametros a las propiedades de la Clase
		idUsuario = id;
		
		nombreUsuario = nombre;
		
		tDocumentoUsuario = tDocumento;
		
		nDocumentoUsuario = nDocumento;
		
		aliasUsuario = alias;
		
		contrasenaUsuario = contrasena;
		
		rolUsuario = rol;
		
	}
	
	// Traer la propiedad del ID
	public Integer idUsuario() {
		return idUsuario;
	}
	
	// Traer la propiedad del Nombre Completo
	public String nombreUsuario() {
		return nombreUsuario;
	}
	
	// Traer la propiedad del Tipo de Documento
	public String tDocumentoUsuario() {
		return tDocumentoUsuario;
	}
	
	// Traer la propiedad del Número de Documento
	public String nDocumentoUsuario() {
		return nDocumentoUsuario;
	}
	
	// Traer la propiedad del Usuario dentro del aplicativo
	public String aliasUsuario() {
		return aliasUsuario;
	}
	
	// Traer la propiedad de la contraseña para compararlas en el JFrame de Inicio
	public char[] contrasenaUsuario() {
		return contrasenaUsuario;
	}
	
	// Traer la propiedad del rol del Usuario dentro del aplicativo
	public String rolUsuario() {
		return rolUsuario;
	}
		
	// Se definen las propiedades de la Clase
	private Integer idUsuario;
	
	private String nombreUsuario;
	
	private String tDocumentoUsuario;
	
	private String nDocumentoUsuario;
	
	private String aliasUsuario;
	
	private char[] contrasenaUsuario;
	
	private String rolUsuario;

}
