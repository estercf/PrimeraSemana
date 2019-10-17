import java.util.Scanner;

public class PrimeraSemana {
	

	public static int multiplicar(int parametro1, int parametro2) {
		return parametro1 * parametro2;
	}
	
	public static void suma(int parametro1, int parametro2) {
		System.out.println(parametro1 + parametro2);
	}
	
	/*
	 * 1 _ Escribe la función main. Crea cinco variables de tipo int con las cinco primeras
	 * letras del abecedario, y dales los valores 5, 10, 15, 20 y 25 respectivamente.
	 * Imprime por pantalla dichos valores, cada uno en su correspondiente línea, y así
	 * tendrá que ser durante el resto del ejercicio.
	 */


	public static void main(String[] args) {
		int a = 5, b = 10, c = 15, d = 20, e = 25;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	/* 
	 * 2 _ Crea dos variables booleanas, una que se llame verdadera y otra falsa, y asígnales
	 * el valor lógico a su nombre. Imprime por pantalla si estas variables son verdaderas
	 * o falsas usando un condicional como if.
	 */
		boolean jasp;
		if (jasp = true) {
			
			System.out.println("Verdadera");
		}
		else { 
			jasp=false;
			System.out.println("Falsa");
		}
	/*
	 * 3 _ Usando las variables del punto 1, imprímelas por pantalla de mayor a menor usando
	 *un condicional como if, o el que creas más conveniente.
	 */
		
		if (a < b) { a += b;  b = a - b;  a -= b; }
	    if (a < c) { a += c;  c = a - c;  a -= c; }
	    if (a < d) { a += d;  d = a - d;  a -= d; }
	    if (a < e) { a += e;  e = a - e;  a -= e; }

	    if (b < c) { b += c;  c = b - c;  b -= c; }
	    if (b < d) { b += d;  d = b - d;  b -= d; }
	    if (b < e) { b += e;  e = b - e;  b -= e; }

	    if (c < d) { c += d;  d = c - d;  c -= d; }
	    if (c < e) { c += e;  e = c - e;  c -= e; }

	    if (d < e) { d += e;  e = d - e;  d -= e; }
	    
	    System.out.printf("De mayor a menor: \n%d %d %d %d %d", a, b, c, d, e);
	    System.out.println(" ");
	    
	/*
	 * 4 _ Imprime por pantalla las variables del punto 1 usando un condicional switch, usando
	 * una para cada caso, por orden. Cuando la variable equivalga a 15, haz que pare con
	 * un break
	 */
	    /* Vuelvo a llamar a las variables del ejercicio 1, pero las renombro, 
	     * no se como hacer para cambiar el orden creado en el ejercicio 3, 
	     * sin hacer lo mismo a la inversa.
	     * A partir de ahora cuando se me pida que gaste las variables del ejercicio uno, gastare estas.
	     */
	    int a1 = 5, b1 = 10, c1 = 15, d1 = 20, e1 = 25;
	    for (int i = 0; i <= 15; i++) {
	    switch (i) {
		    case 5:
		    	System.out.println(a1);
		    case 10:
		    	System.out.println(b1);
		    case 15:
		    	System.out.println(c1);
			   	break;
		    case 20:
		    	System.out.println(d1);
		    case 25:
		    	System.out.println(e1);
	    }
	    }
	    
	/*
	 * 5 _Crea una variable de tipo int que se llame temporal, e inicialízala a cero. Imprime
	 * su valor por pantalla. Crea un bucle while, y incrementa el valor de temporal en +5
	 * en cada iteración. Cuando la variable llegue a valer 50 o más, detén la iteración.
	 */
	    
	    int temporal = 0;
	    System.out.println("El valor de la variable temporal es: " +temporal);
	    while (temporal < 50) {
	    	temporal += 5;
	    	System.out.println("El valor de la variable temporal ahora es: "+temporal);
	    }

	/*
	 * 6 _ Pide al usuario que escriba en la consola un número, e imprímelo por pantalla.
	 */
	    
	    Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("Ingrese un número: ");
		n = scan.nextInt();
		System.out.println("Su número ingresado es: " +n);

	/*
	 * 7_ Crea una función que multiplique dos números como parámetro, y devuelva el
	 * resultado. Envía como parámetros las variables a y temporal. Imprime por pantalla
	 * el resultado.
	 */
		
		System.out.println(multiplicar(a1, temporal));

	/*
	 * 8 _ Crea una función que sume dos números y los imprima directamente en pantalla.
	 * Llama a dicha función y envía como parámetros las variables b y c.
	 */
		suma (b1, c1);
		
	/*
	 * 10 _ Desde la clase principal, crea una instancia de Videoconsola, con los atributos que
	quieras, enciéndela y carga un juego. Imprime por pantalla marca, color, y si está
	encendida o apagada y si hay un juego cargado o no.
	 */
		
		VideoConsola v = new VideoConsola();
		v.marca = "Nintendo";
		v.color = "Naranja";
		v.encender();
		v.cargarjuego();
		System.out.println("Marca: " +v.marca);
		System.out.println("Color: " +v.color);
		System.out.println("¿Esta Apagada? " +v.estaApagada);
		System.out.println("¿Hay juego cargado?" +v.juegoCargado);
		
	}
}

	/*
	 * 9 _ Crea una clase nueva que se llame Videoconsola, y crea un objeto que se llame
	 * Videoconsola, dale como métodos encender, apagar y cargarjuego, los tres
	 * booleanos, y dale como atributos marca y color. El código de esta clase lo pegarás
	 * en el txt al final del todo, tras finalizar la clase PrimeraSemana.
	 */



