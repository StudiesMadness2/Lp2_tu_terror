import java.io.Console;

public class Rendenrizador {
	
	//Imprime las celdas y si alguno de los cuys est� ubicado en la celda lo imprime
	public void ImprimirMapa(Celda[][] mapa, Personaje cuy1, PersonajeSecundario cuy2){
		int flagDuo=0;
		for(int i=0;i<12;i++){
			for(int j=0;j<16;j++){
				if(cuy1.getPosX()==i && cuy1.getPosY()==j) {
					System.out.print('A');
					if (mapa[i][j].getCaracter()=='D') flagDuo++;
				}
				else {
					if(cuy2.getPosX()==i && cuy2.getPosY()==j) {
						System.out.print('B');
						if (mapa[i][j].getCaracter()=='D') flagDuo++;
					}
					else System.out.print(mapa[i][j].getCaracter());
				}
			}
			System.out.println();
		}
		//la verificacion del duo debe darse en el juego, ya que si la cadena es correcta debera
		//mandar a otro m�todo de impresi�n
		if(flagDuo==2){
			System.out.println("AMBOS HERMANOS PUEDEN HACER UN DUO");
			System.out.println("DEBE PRESIONAR WSIKDDLL");
		}
	}
	//La impresion del duo
	public void ImprimirDuo(Celda[][]mapa, Personaje cuy1, PersonajeSecundario cuy2){
		//DUO - POSICION 2
		cuy1.setPosX(5);
		cuy1.setPosY(7);
		cuy2.setPosX(4);
		cuy2.setPosY(7);
		ImprimirMapa(mapa,cuy1,cuy2);
		System.console().readLine();
		//DUO - POSICION 3
		cuy1.setPosX(9);
		cuy1.setPosY(7);
		cuy2.setPosX(8);
		cuy2.setPosY(7);
		ImprimirMapa(mapa,cuy1,cuy2);
		System.console().readLine();
		//DUO - POSICION 4
		cuy1.setPosX(8);
		cuy1.setPosY(6);
		cuy2.setPosX(8);
		cuy2.setPosY(10);
		ImprimirMapa(mapa,cuy1,cuy2);
		System.console().readLine();
	}
}