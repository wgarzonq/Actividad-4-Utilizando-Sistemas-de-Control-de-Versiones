package biblioteca.com.clases;

// Clase Movimiento

/*
 * La Clase Movimiento es la base para poder procesar como bien su nombre lo dice
 * los movimientos del libro dentro de la biblioteca: como las solicitudes de prestamo,
 * los propios prestamos y las devoluciones
 */
public class Movimiento {

	// Contructor de la clase que requiere como parametros: el usuario solicitante y el libro a solicitar
	public Movimiento(Usuario usuario, Libro libro) {
		
		// Se asignan los parametros a las propiedades de la clase
		usuarioMovimiento = usuario;
		
		libroMovimiento = libro;
	}
	
	// Definición de las propiedades de la clase
	public Usuario usuarioMovimiento;
	
	public Libro libroMovimiento;

}
