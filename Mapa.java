	
public class Mapa {
	private AccionesEspeciales acciones;
	private Celda [][] mapa = new Celda[12][16];
	private int estadoDuo ; 
	private int contador ; 
	public Mapa(){		//Inicializa el mapa con caracteres en blanco
		for(int i=0;i<12;i++){
			for(int j=0;j<16;j++){
				mapa[i][j] = new Celda(' ', i, j);
			}
		}
	}
	
	public void establecerCaracter(int i, int j, char x){
		mapa[i][j].setCaracter(x);
	}
	
	public char obtenerCaracter(int i, int j){
		return mapa[i][j].getCaracter();
	}

	
	public void ImprimirMapa(){ //Imprime mapa para verificar que estaba bien cargado
		for(int i=0;i<12;i++){
			for(int j=0;j<16;j++){
				System.out.print(mapa[i][j].getCaracter());
			}
			System.out.println();
			}
	}

	public int getEstadoDuo() {
		return estadoDuo;
	}

	public void setEstadoDuo(int estadoDuo) {
		this.estadoDuo = estadoDuo;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}
