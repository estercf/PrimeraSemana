	/*
	 * 9 _ Crea una clase nueva que se llame Videoconsola, y crea un objeto que se llame
	 * Videoconsola, dale como métodos encender, apagar y cargarjuego, los tres
	 * booleanos, y dale como atributos marca y color. El código de esta clase lo pegarás
	 * en el txt al final del todo, tras finalizar la clase PrimeraSemana.
	 */

public class VideoConsola {
	public boolean encender(){
		estaApagada = false;
		return estaApagada;
		}
	public boolean apagar() {
		estaApagada = true;
		return estaApagada;
	}
	public boolean cargarjuego() {
		juegoCargado = true;
		return juegoCargado;
	}
	
	String marca;
	String color;
	boolean estaApagada = true;
	boolean juegoCargado = false;
	
	public static void main(String[] args) {
		VideoConsola videoconsola = new VideoConsola();
	}
}
