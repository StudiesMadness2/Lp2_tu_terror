import java.io.Console;
import java.util.Scanner;

import sun.java2d.loops.ScaledBlit;

public class Rendenrizador {
	
	//Imprime las celdas y si alguno de los cuys está ubicado en la celda lo imprime
	public void ImprimirMapa(Mapa mapa, Personaje cuy1, Personaje cuy2){
		int flagDuo=0;
		
		//System.out.println(cuy1.getPosX() );
		//System.out.println(cuy1.getPosY() );
		//System.out.println(cuy2.getPosX() );
		//System.out.println(cuy2.getPosY() );
		//System.out.println("=================" );
		for(int i=0;i<12;i++){
			for(int j=0;j<16;j++){
				if ((cuy1.getPosX()==i && cuy1.getPosY()==j) ||(cuy2.getPosX()==i && cuy2.getPosY()==j)){ 
					if(cuy1.getPosX()==i && cuy1.getPosY()==j) {
						System.out.print('A');
						if (mapa.obtenerCaracter(i,j)=='D') flagDuo++;
					}					    
					if(cuy2.getPosX()==i && cuy2.getPosY()==j) {
						System.out.print('B');
						if (mapa.obtenerCaracter(i,j)=='D') flagDuo++;					
					}			
				}
				else System.out.print(mapa.obtenerCaracter(i,j));								
			
			}
			System.out.println();
		}
		//la verificacion del duo debe darse en el juego, ya que si la cadena es correcta debera
		//mandar a otro método de impresión
		if(flagDuo==2){
			System.out.println("AMBOS HERMANOS PUEDEN HACER UN DUO");
			if(mapa.getEstadoDuo() == 0){
				ImprimirDuo(mapa, cuy1, cuy2);
				if (cuy1.getVida() <= 0 ) return ;
				
			}else if (mapa.getEstadoDuo() == 1){
				
				if (mapa.getContador() == 0){
					ImprimirDuo2(mapa, cuy1, cuy2);
					mapa.setContador( mapa.getContador() + 1 );
					}
				else{ 
					ImprimirDuo3(mapa, cuy1, cuy2);
					}
				if (cuy1.getVida() <= 0 ) return ;
				
			}else if (mapa.getEstadoDuo() == 2){
				ImprimirDuo4(mapa, cuy1, cuy2);
				if (cuy1.getVida() <= 0 ) return ;
			}
			
		}
	}
	public void ImprimirDuo4(Mapa mapa, Personaje cuy1, Personaje  cuy2){
		///// FAlta 
		Scanner teclado = new Scanner(System.in);
		System.out.println("DEBE PRESIONAR WKKKSSSALISSSAAA");
		String duo1 = "WKKKSSSALISSSAAA" ;
		String entrada = teclado.nextLine() ;
		while ( !duo1.equals(entrada))  {
			System.out.println("DEBE PRESIONAR WKKKSSSALISSSAAA");
			cuy1.setVida(cuy1.getVida() -1) ;
			if (cuy1.getVida() <= 0 ) return ; 
			entrada = teclado.nextLine() ; 
		}
		//DUO - POSICION 1
		cuy1.setPosX(6);
		cuy1.setPosY(9);
		cuy2.setPosX(6); ///
		cuy2.setPosY(10);		
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 2
		cuy1.setPosX(5);
		cuy1.setPosY(12);
		cuy2.setPosX(6);
		cuy2.setPosY(12);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		
	}
	public void ImprimirDuo3(Mapa mapa, Personaje cuy1, Personaje  cuy2){
		///// FAlta 
		Scanner teclado = new Scanner(System.in);
		System.out.println("DEBE PRESIONAR WAKAJISA");
		String duo1 = "WAKAJISA" ;
		String entrada = teclado.nextLine() ;
		while ( !duo1.equals(entrada))  {
			System.out.println("DEBE PRESIONAR WAKAJISA");
			cuy1.setVida(cuy1.getVida() -1) ;
			if (cuy1.getVida() <= 0 ) return ; 
			entrada = teclado.nextLine() ; 
		}
		//DUO - POSICION 1
		cuy1.setPosX(9);
		cuy1.setPosY(10);
		cuy2.setPosX(9);
		cuy2.setPosY(11);		
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 2
		cuy1.setPosX(7);
		cuy1.setPosY(10);
		cuy2.setPosX(7);
		cuy2.setPosY(11);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 3
		cuy1.setPosX(5);
		cuy1.setPosY(11);		
		cuy2.setPosX(6);
		cuy2.setPosY(11);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		
		
		//DUO - POSICION 3
		cuy1.setPosX(2);
		cuy1.setPosY(12);		
		cuy2.setPosX(2);
		cuy2.setPosY(13);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		
		cuy1.setPosX(0);
		cuy1.setPosY(12);		
		cuy2.setPosX(4);
		cuy2.setPosY(12);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;

		
	}
	//La impresion del duo
	public void ImprimirDuo2(Mapa mapa, Personaje cuy1, Personaje  cuy2){
		Scanner teclado = new Scanner(System.in);
		System.out.println("DEBE PRESIONAR WAKAJISA");
		String duo1 = "WAKAJISA" ;
		String entrada = teclado.nextLine() ;
		while ( !duo1.equals(entrada))  {
			System.out.println("DEBE PRESIONAR WAKAJISA");
			cuy1.setVida(cuy1.getVida() -1) ;
			if (cuy1.getVida() <= 0 ) return ; 
			entrada = teclado.nextLine() ; 
		}
		//DUO - POSICION 1
		cuy1.setPosX(9);
		cuy1.setPosY(4);
		cuy2.setPosX(9);
		cuy2.setPosY(5);		
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 2
		cuy1.setPosX(9);
		cuy1.setPosY(7);
		cuy2.setPosX(9);
		cuy2.setPosY(8);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 3
		cuy1.setPosX(11);
		cuy1.setPosY(7);		
		cuy2.setPosX(7);
		cuy2.setPosY(7);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		
		//DUO - POSICION 3
		//cuy1.setPosX(9);
		//cuy1.setPosY(8);		
		//cuy2.setPosX(5);
		//cuy2.setPosY(8);
		//ImprimirMapa(mapa,cuy1,cuy2);
		//entrada = teclado.nextLine() ;

		
	}
	public void ImprimirDuo(Mapa mapa, Personaje cuy1, Personaje  cuy2){
		Scanner teclado = new Scanner(System.in);
		System.out.println("DEBE PRESIONAR WSIKDDLL");
		String duo1 = "WSIKDDLL" ;
		String entrada = teclado.nextLine() ;
		while ( !duo1.equals(entrada))  {
			System.out.println("DEBE PRESIONAR WSIKDDLL");
			cuy1.setVida(cuy1.getVida() -1) ;
			if (cuy1.getVida() <= 0 ) return ; 
			entrada = teclado.nextLine() ; 
		}
		//DUO - POSICION 1
		cuy1.setPosX(6);
		cuy1.setPosY(4);
		cuy2.setPosX(8);
		cuy2.setPosY(4);		
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 2
		cuy1.setPosX(7);
		cuy1.setPosY(4);
		cuy2.setPosX(7);
		cuy2.setPosY(5);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 3
		cuy1.setPosX(7);
		cuy1.setPosY(7);		
		cuy2.setPosX(7);
		cuy2.setPosY(8);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		
		//DUO - POSICION 4
		cuy1.setPosX(5);
		cuy1.setPosY(7);		
		cuy2.setPosX(9);
		cuy2.setPosY(7);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		
	}
}