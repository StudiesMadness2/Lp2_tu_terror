import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
	private int nextLevel ;
	private Scanner teclado;
	
	private Personaje personajeA ; // EL Cuyo  
	private Personaje personajeB ;  // La Cuya
	private ArrayList <PersonajeSecundario> listPersonajesSecundarios ; 
	private ArrayList <Objeto> listObjetos ; 
	private ArrayList <Mapa> listMapas ; 
	private GestorDeMapas gestorMapa ;
	private InterpreteComandos interpreteComando ; 
	private Rendenrizador renderizador ; 
	private Mapa  mapaActual ; 
	
	public Juego(int numeroMapas , int numerosDeObjetos , int numPersSecund){
		  
		 nextLevel =  0  ;
		 listObjetos  = new  ArrayList <Objeto>(numerosDeObjetos) ; 
		 listPersonajesSecundarios = new ArrayList <PersonajeSecundario>(numPersSecund) ;
		 listMapas = new ArrayList <Mapa>(numeroMapas) ;
		 interpreteComando = new InterpreteComandos() ;		 
		 renderizador = new Rendenrizador() ;
		 gestorMapa = new GestorDeMapas();		 		
		 for(int i = 0 ; i <3 ; i++ ){
			 listMapas.add(new Mapa());			 
		 }
		 int indice = 0 ;
		 for (Mapa miMapa : listMapas){
			 gestorMapa.crearMapa(miMapa, indice++);
		 }
		 mapaActual =  listMapas.get(0);  // puede ser no necesario 		 
	}
	
	public void iniciarPersonajes(Personaje a , Personaje b){
		personajeA = a  ; 
		personajeB = b ; 
		
	}
	public void iniciarPersonajesSecundarios(){
		// Falta ; 
		
	}
	public void iniciarObjetos(){
		// falta ; 
		
	}
	
	public void FinDelJuego(){
		System.out.println("Felicitaciones, eres el mejor. Terminaste el juego Mi estimado LOL by --BrayanRP");		
	}
	
	public void Historia_3(){
		String linea;
		System.out.println("Bienvenido a Historia_3  (presione enter para continuar)");
		linea = teclado.next();
		FinDelJuego();
	}

	public void Nivel_2(){
		int entero;
		System.out.println("Bienvenido al Nivel_2  (escriba un numero para continuar)");
		entero = teclado.nextInt();
		if(entero != nextLevel){
			Historia_3();
		}
		else{
			System.out.println("Game Over");			
		}
	}
	
	public void Historia_2(){
		String linea;
		System.out.println("Bienvenido a Historia_2  (presione enter para continuar)");
		linea = teclado.next();
		 Nivel_2();
	}
	
	public void Nivel_1(){
		int entero;
		System.out.println("Bienvenido al Nivel_1  (escriba un numero para continuar)");
		entero = teclado.nextInt();
		if(entero != nextLevel){
			 Historia_2();
		}
		else{
			System.out.println("Game Over");			
		}
	}
		
	public void Tutorial(){
		int entero;
		System.out.println("Bienvenido al tutorial  (escriba un numero para continuar)");
		entero = teclado.nextInt();
		if(entero != nextLevel){
			Nivel_1();
		}
		else{
			System.out.println("Game Over");			 
		}
	}
	
	public void Historia_1(){
		String linea;
		System.out.println("Bienvenido a Historia_1  (presione cualquier numero y enter para continuar)");		
		linea = teclado.next();		
		Tutorial();
	}
		
	public void NuevoJuego(Personaje perA, Personaje perB){
		String linea;
		System.out.println("Escriba su nombre: ");
		linea = teclado.next();		
		System.out.println("Wecome to my world my yangy friend " + linea);
		Historia_1();
	}
	
	public void PantallaInicial(Personaje perA, Personaje perB){
		
		int opcion;
		int salida = 0;
		
		while(true){
		
			teclado = new Scanner(System.in);
			
			System.out.println("Bienvenidos Todos! amiguitos! a este juego kawai!\n\n");
			System.out.println("1) Nuevo juego");
			System.out.println("2) Salir\n\n");
			System.out.println("Seleccione una de las dos opciones: ");
			
			opcion = teclado.nextInt();
			
			if(opcion == 1){
				NuevoJuego(perA , perB);	
			}
			else if(opcion == 2){
				System.out.println("Seguro que quiere salir? ");
				System.out.println("1) Sí");
				System.out.println("2) No");
								
				salida = teclado.nextInt();
				if(salida == 1)   // Si lo cambiamo este (una linea mas arriba regresa al menu princupal)
					break;
			}			
		}
		System.out.println("Espero que Regrese Pronto mi estimado LOL by Brayan XD");
	}
	
	
	
	public static void main(String[] parametro) {
		
		int i ; 
		Personaje brayan = new Personaje("Brayan", 10, 190, 11 , 0, 'A', true, false);
 	    System.out.print(brayan.getEstadoActual());
 	    
 	    Personaje brando = new Personaje("Brando", 10, 190, 6 	, 0, 'B', true, false);
 	    System.out.print(brando.getEstadoActual());
 	    
 	    Juego nuevoJuego = new Juego(10, 50,40) ; 
 	    nuevoJuego.iniciarPersonajes(brayan, brando);
 	    nuevoJuego.PantallaInicial( brayan , brando );
 	   
 	    
		
    }

	public Personaje getPersonajeA() {
		return personajeA;
	}

	public void setPersonajeA(Personaje personajeA) {
		this.personajeA = personajeA;
	}

	public Personaje getPersonajeB() {
		return personajeB;
	}

	public void setPersonajeB(Personaje personajeB) {
		this.personajeB = personajeB;
	}
}

