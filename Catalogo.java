import java.util.ArrayList;

public class Catalogo {

	ArrayList<Pelicula> arrayPeliculas;
	
	//constructor vacio
	public Catalogo() {
		//lista vacia
		arrayPeliculas= new ArrayList();
	}
	
	//metodos
	public void agregarPelicula(Pelicula pelicula) {
		arrayPeliculas.add(pelicula);
	}
	
	public String getPeliculas() {
		String cadena= "";
		
		//for each
		for(Pelicula peli: arrayPeliculas) {
			cadena+= peli.getInformacion();
			cadena+="\n";
		}
		return cadena;
	}
	
	public void buscarPeliculaPorTitulo(String titulo) {
		
		//recorrer arreglo de peliculas
		for(Pelicula peli: arrayPeliculas) {
			
			//comparar cada una con la que se busca
			if(peli.titulo.equalsIgnoreCase(titulo)) {
				
				// mostrar su informacion si coincide
				System.out.println(peli.getInformacion());
			}
		}
		
	}
	
	public String toString() {
		String escrito= "";
		
		for(Pelicula peli: arrayPeliculas) {
			escrito+= peli.getInformacion();
		}
		
		return escrito;
	}
}
