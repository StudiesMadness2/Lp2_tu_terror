
public class Rendenrizador {
	
	public void ImprimirMapa(Celda[][] mapa, Personaje cuy1, PersonajeSecundario cuy2){
		for(int i=0;i<12;i++){
			for(int j=0;j<16;j++){
				if(cuy1.getPosX()==i && cuy1.getPosY()==j) System.out.print('A');
				else {
					if(cuy2.getPosX()==i && cuy2.getPosY()==j) System.out.print('B');
					else System.out.print(mapa[i][j].getCaracter());
				}
			}
			System.out.println();
		}
	}
}