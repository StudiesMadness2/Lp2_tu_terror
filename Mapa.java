
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
	
	public void GestorMapa(int indice){
		switch (indice){
		case 0:
				for(int i=0;i<12;i++){
					for(int j=0;j<16;j++){
						if(i>2 && i<7) {
							mapa[i][j].setCaracter('N');
							if(j==0 && i==5) mapa[i][j].setCaracter('B');
							if(j==5 && i==5) mapa[i][j].setCaracter('D');
							if(j==12) mapa[i][j].setCaracter('T');
							else {
								if((j==13||j==14)&&(i==4||i==5)) mapa[i][j].setCaracter('E');
							}
						}
						if(i==7) mapa[i][j].setCaracter('p');
						if(i>7){
							mapa[i][j].setCaracter('S');
							if(i==10 && j==0) mapa[i][j].setCaracter('A');
							if(i==9 && j==5) mapa[i][j].setCaracter('D');
							if(i==9 && j==11) mapa[i][j].setCaracter('C');
						}
						if((j==6 || j==7) && i>0) mapa[i][j].setCaracter('v');
					}
				}
		        break;
		case 1: 
				for(int i=0;i<12;i++){
					for(int j=0;j<16;j++){
						if(j>11) {
							if(i<2) mapa[i][j].setCaracter('N');
							if(i==2) mapa[i][j].setCaracter('p');
							if(i>2 && i<5) mapa[i][j].setCaracter('S');
							if(i>4)  mapa[i][j].setCaracter('n');
						}
						else{
							if(i==7 || i==8)  mapa[i][j].setCaracter('N');
							if(i==9) mapa[i][j].setCaracter('p');
							if(i>9) mapa[i][j].setCaracter('S');
							if(j==6 && i>6)  mapa[i][j].setCaracter('g');
						}
						if(j==0 && i==7) mapa[i][j].setCaracter('B');
						if(j==0 && i==11) mapa[i][j].setCaracter('A');
						if((j==5 || j==10) && (i==8 || i==10)) mapa[i][j].setCaracter('D');
					}
				}
		        break;
		case 2:
				for(int i=0;i<12;i++){
					for(int j=0;j<16;j++){
						if(i>0 && i<6){
							mapa[i][j].setCaracter('N');
							if(i==5 && j==0) mapa[i][j].setCaracter('B');
							if(i==3 && j==3) mapa[i][j].setCaracter('C');
							if(j==9 && i==5) mapa[i][j].setCaracter('D');
							if(j==4) mapa[i][j].setCaracter('h');
							if(j==7 && i<4) mapa[i][j].setCaracter('H');
							if(j==9 && i<5) mapa[i][j].setCaracter('H');
							if(i>3 && j>11) mapa[i][j].setCaracter('E');
						}
						if(i==6) {
							mapa[i][j].setCaracter('p');
							if(j==4) mapa[i][j].setCaracter('h');
							if(j>11) mapa[i][j].setCaracter('E');
						}
						if(i>6){
							mapa[i][j].setCaracter('S');
							if(i==10 && j==0) mapa[i][j].setCaracter('A');
							if(i==9 && j==3) mapa[i][j].setCaracter('C');
							if(j==9 && i==7) mapa[i][j].setCaracter('D');
							if(j==4) mapa[i][j].setCaracter('h');
							if(j==7 && i>8) mapa[i][j].setCaracter('H');
							if(j==9 && i>7) mapa[i][j].setCaracter('H');
							if(i<9 && j>11) mapa[i][j].setCaracter('E');
						}
					}
				}
		        break;
		}
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
