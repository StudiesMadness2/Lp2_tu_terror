
public class PersonajeSecundario extends Personaje {
	private int nivel;	
	
	public PersonajeSecundario(String nombre , int ancho , int alto , int posX, int posY, char letra , int nivel , boolean visible , boolean atravesable){		
		super( nombre , ancho , alto ,  posX,posY, letra, visible ,atravesable);
		this.setNivel(nivel) ; 		
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}
