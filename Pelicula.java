
public class Pelicula {
	
	//declarar los atributos
	String titulo;
	private String director;
	private int anioEstreno;
	private String genero;
	private int duracion;
	
	// metodo constructor para inicializar valores
	public Pelicula(String titulo, String director, int estreno, String genero, int duracion) {
		this.titulo= titulo;
		this.director= director;
		anioEstreno= estreno;
		this.genero= genero;
		this.duracion= duracion;
	}
	
	// metodo getter
	public String getInformacion() {
		return "Titulo: "+titulo+"\n"+"Director: "+director+"\n"+"Año Estreno: "+anioEstreno+"\n"+"Genero: "+genero+"\n"+"Duracion: "+duracion+" minutos"+"\n";
	}
	
	// otros metodos
	public boolean esClasica() {
		int anio= 2025 - anioEstreno;
		
		if(anio>25) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "Titulo: "+titulo+"\n"+"Director: "+director+"\n"+"Año Estreno: "+anioEstreno+"\n"+"Genero: "+genero+"\n"+"Duracion: "+duracion+" minutos"+"\n";
	}
}
