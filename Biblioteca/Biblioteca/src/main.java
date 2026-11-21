import javax.swing.JFrame;

import biblioteca.com.funciones.LlamarGlobales;
import interfaz.Agregar;
import interfaz.Busqueda;
import interfaz.Inicio;
import interfaz.Panel;
import interfaz.Principal;

// Clase Principal
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Se llama la clase global LlamaGlobales enfocada en la Gestión de Movimientos
		LlamarGlobales.getInstancia().getGestionMovimientos();
		
		// Se llama la clase global LlamaGlobales enfocada en la Gestión de Libros
		LlamarGlobales.getInstancia().getGestionLibros();
		
		// Se llama la función cargar_libros que contiene la carga del LinkedList con la información de 30 objetos de la clase Libro, para rellenar la gráfica del aplicativo
		LlamarGlobales.getInstancia().getGestionLibros().cargar_libros();

		// Se crea una instancia de la Clase Inicio que va a hacer el primer JFrame que vera el usuario
		Inicio marcoInicio = new Inicio();

		// Configuración del frame de la clase Inicio
		marcoInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Propiedad para que la ventana no se expanda por los bordes
		marcoInicio.setResizable(false);

		marcoInicio.setVisible(true);
		
	}

}
