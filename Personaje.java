import java.util.ArrayList;

public class Personaje {
    // Clase de la cual se van a heredad todos los personajes com A, B enemigos , mosutros aledaños

	//Atributos  
	private static int vida ; 
	private  String nombre; 
	private  int ancho ; 
	private int alto ; 
	private int posX ; 
	private int posY ; 		
	private char letraAsociada ;
	private boolean visible ; 
	private boolean atravesable ;
	
	private Sprite matriz[][] ;
	private ArrayList<Integer> estados  ;  
	private int estadoActual  ; 
	
	public Personaje(String nombre , int ancho , int alto , int posX, int posY, char letra, boolean visible , boolean atravesable){
		setMainValues(nombre, ancho, alto, posX, posY, letra, visible , atravesable);
		estados = new ArrayList<Integer>(10);
		setVida(10) ;
		for(int i = 0 ; i<=10 ; i++) {  // Añados estados del 0 a. 9			
			estados.add((Integer)i) ; 
			}  
		
 	    // Considero 10 estados por 20 imagenes
		matriz  = new Sprite[10][20];
		
		estadoActual = estados.get(0) ; // estado inicial es el el valor del priver indice 		
		
	}
	
	// seteo de principales datos ; 
	public void setMainValues(String nombre , int ancho , int alto , int posX, int posY, char letra , boolean visible , boolean atravesable ){		
		setNombre(nombre);
		setAlto(alto);
		setAncho(ancho);		
		setPosX(posX);
		setPosY(posY);		
		setLetraAsociada(letra);
		setVisible(visible);
		setAtravesable(atravesable);
	}
	
	public void agregarSprites(ArrayList<Sprite> sprites, int estado ){
		for(int i = 0 ; i<sprites.size() ; i++){
		   matriz[estado][i] = new Sprite();
		   // Aqui se debe agregar la referencia a sprite que se carga
		   
		}
	}
		
	
	// SEts y GEts 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public char getLetraAsociada() {
		return letraAsociada;
	}
	public void setLetraAsociada(char letraAsociada) {
		this.letraAsociada = letraAsociada;
	}

	public int getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(int estadoActual) {
		this.estadoActual = estadoActual;
	}

	public ArrayList getEstados() {
		return estados;
	}

	public void setEstados(ArrayList estados) {
		this.estados = estados;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public boolean isAtravesable() {
		return atravesable;
	}

	public void setAtravesable(boolean atravesable) {
		this.atravesable = atravesable;
	}

	public static int getVida() {
		return vida;
	}

	public static void setVida(int vida) {
		Personaje.vida = vida;
	}

	
	
}
