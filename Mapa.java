	
public class Mapa {
	
	private Celda [][] mapa = new Celda[12][16];
	
	public Mapa(){		
		for(int i=0;i<12;i++){
			for(int j=0;j<16;j++){
				mapa[i][j] = new Celda(' ', i, j);
			}
		}
	}
	
	public void establecerCaracter(int i, int j, char x){
		mapa[i][j].setCaracter(x);
	}
	

	
	public void ImprimirMapa(){
		for(int i=0;i<12;i++){
			for(int j=0;j<16;j++){
				System.out.print(mapa[i][j].getCaracter());
			}
			System.out.println();
			}
	}

}
