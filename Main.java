
public class Main {

	public static void main(String[] args) {
		
		Catalogo catalogo1= new Catalogo();
		
		// crear objetos pasando parametros
		Pelicula pelicula1= new Pelicula("El gato","Brian Grazer",2003,"Comedia",82);
		Pelicula pelicula2= new Pelicula("La llegada","Denis Villeneuve",2016,"Ciencia ficcion",116);
		Pelicula pelicula3= new Pelicula("Ghostland","Pascal Laugier",2018,"Terror",90);
		
		// agregarlas al objeto Catalogo
		catalogo1.agregarPelicula(pelicula1);
		catalogo1.agregarPelicula(pelicula2);
		catalogo1.agregarPelicula(pelicula3);
		
		// mostrar informacion de las peliculas
		System.out.println(catalogo1.getPeliculas());
		
		System.out.println();
		
		System.out.println("Por busqueda: ");
		// buscar pelicula mandando parametro de titulo
		catalogo1.buscarPeliculaPorTitulo("El gato");
		
	}

}
