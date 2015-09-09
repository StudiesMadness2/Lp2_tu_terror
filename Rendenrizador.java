import java.io.Console;
import java.util.Scanner;

import sun.java2d.loops.ScaledBlit;

public class Rendenrizador {
	//Imprime las celdas y si alguno de los cuys está ubicado en la celda lo imprime
	public void ImprimirMapa(Mapa mapa, Personaje cuy1, Personaje cuy2){
		int flagDuo=0, flagAccA=0, flagAccB=0, flagNuevoEnemigo=0, esp=0;
		
		//System.out.println(cuy1.getPosX() );
		//System.out.println(cuy1.getPosY() );
		//System.out.println(cuy2.getPosX() );
		//System.out.println(cuy2.getPosY() );
		//System.out.println("=================" );
		for(int i=0;i<12;i++){
			for(int j=0;j<16;j++){
				if(mapa.obtenerCaracter(i,j)==' ') esp++;
				if ((cuy1.getPosX()==i && cuy1.getPosY()==j) ||(cuy2.getPosX()==i && cuy2.getPosY()==j)){ 
					if(cuy1.getPosX()==i && cuy1.getPosY()==j) {
						System.out.print('A');
						if (mapa.obtenerCaracter(i,j)=='D') flagDuo++;
						if (mapa.obtenerCaracter(i,j)=='C') flagAccA++;
						if(((cuy1.getPosX()==11 && cuy1.getPosY()==1)||(cuy1.getPosX()==10 && cuy1.getPosY()==0)) && esp>50){
							flagNuevoEnemigo++;
							mapa.establecerCaracter(i, j+1, '@');
							//Esto hace que el caracter del costado muestre al enemigo en la impresion
							
						}
						//if (mapa.obtenerCaracter(i,j)=='C') flagAccA++;
					}					    
					if(cuy2.getPosX()==i && cuy2.getPosY()==j) {
						System.out.print('B');
						if (mapa.obtenerCaracter(i,j)=='D') flagDuo++;	
						if (mapa.obtenerCaracter(i,j)=='C') flagAccB++;
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
		if(flagAccA>0){
			System.out.println("CRISTOBAL PUEDE HACER UNA ACCION");
			if(cuy1.getPosX()==9 && cuy1.getPosY()==11) AccionTutorial(mapa, cuy1, cuy2);
			else AccionNivel2A(mapa, cuy1, cuy2);
		}
		if(flagAccB>0){
			System.out.println("LA HERMANA PUEDE HACER UNA ACCION");
			AccionNivel2B(mapa, cuy1, cuy2);
		}
		if(flagNuevoEnemigo>0 && esp> 50){
			//ACA HAY UN NUEVO ENEMIGO ESO VALIDA QUE HAYA PISADO EL TRIGGER
			System.out.println("UN NUEVO ENEMIGO HA APARECIDO");
			cuy1.setPosY(3);
			ImprimirAccionNUEVA(mapa, cuy1, cuy2);
		}
	}
	public void AccionTutorial(Mapa mapa, Personaje cuy1, Personaje  cuy2){
		Scanner teclado = new Scanner(System.in);
		System.out.println("DEBE PRESIONAR WDEWW");
		String duo1 = "WDEWW" ;
		String entrada = teclado.nextLine() ;
		while ( !duo1.equals(entrada))  {
			System.out.println("DEBE PRESIONAR WDEWW");
			cuy1.setVida(cuy1.getVida() -1) ;
			if (cuy1.getVida() <= 0 ) return ; 
			entrada = teclado.nextLine() ; 
		}
		//ACCION - POSICION 1
		cuy1.setPosY(11); ///
		cuy1.setPosX(7);		
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//ACCION - POSICION 2
		cuy1.setPosY(13);
		cuy1.setPosX(5);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//ACCION - POSICION 3
		cuy1.setPosY(13);
		cuy1.setPosX(8);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		System.out.println("PUEDES MOVERTE Y CONTINUAR");

	}
	public void AccionNivel2A(Mapa mapa, Personaje cuy1, Personaje  cuy2){
		Scanner teclado = new Scanner(System.in);
		System.out.println("DEBE PRESIONAR WQED");
		String duo1 = "WQED" ;
		String entrada = teclado.nextLine() ;
		while ( !duo1.equals(entrada))  {
			System.out.println("DEBE PRESIONAR WQED");
			cuy1.setVida(cuy1.getVida() -1) ;
			if (cuy1.getVida() <= 0 ) return ; 
			entrada = teclado.nextLine() ; 
		}
		//ACCION - POSICION 1
		cuy1.setPosY(4); ///
		cuy1.setPosX(9);		
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//ACCION - POSICION 2
		cuy1.setPosY(5);
		cuy1.setPosX(9);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		System.out.println("PUEDES MOVERTE Y CONTINUAR");

	}
	public void AccionNivel2B(Mapa mapa, Personaje cuy1, Personaje  cuy2){
		Scanner teclado = new Scanner(System.in);
		System.out.println("DEBE PRESIONAR IUOL");
		String duo1 = "IUOL" ;
		String entrada = teclado.nextLine() ;
		while ( !duo1.equals(entrada))  {
			System.out.println("DEBE PRESIONAR IUOL");
			cuy1.setVida(cuy1.getVida() -1) ;
			if (cuy1.getVida() <= 0 ) return ; 
			entrada = teclado.nextLine() ; 
		}
		//ACCION - POSICION 1
		cuy2.setPosY(4); ///
		cuy2.setPosX(3);		
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//ACCION - POSICION 2
		cuy2.setPosY(5);
		cuy2.setPosX(3);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine();
		System.out.println("PUEDES MOVERTE Y CONTINUAR");

	}
	public void ImprimirAccionNUEVA(Mapa mapa, Personaje cuy1, Personaje  cuy2){
		Scanner teclado = new Scanner(System.in);
		int flag = validar(cuy1);
		String entrada;
		if(flag==1){
			//ACCION - POSICION 1
			cuy2.setPosY(4); ///
			cuy2.setPosX(8);		
			ImprimirMapa(mapa,cuy1,cuy2);
			entrada = teclado.nextLine() ;
			//ACCION - POSICION 2
			cuy2.setPosY(3);
			cuy2.setPosX(10);
			ImprimirMapa(mapa,cuy1,cuy2);
			entrada = teclado.nextLine() ;
			//ACCION - POSICION 3
			cuy2.setPosY(3);
			cuy2.setPosX(8);
			ImprimirMapa(mapa,cuy1,cuy2);
			System.out.println("HAZ SALVADO A TU HERMANO! :D");
			System.out.println("PUEDES MOVERTE Y CONTINUAR");
			entrada = teclado.nextLine() ;	
		}
	}
	public int validar( Personaje cuy1){
		Scanner teclado = new Scanner(System.in);
		System.out.println("DEBE PRESIONAR WWKSLS");
		String duo1 = "WWKSLS" ;
		String entrada = teclado.nextLine() ;
		while ( !duo1.equals(entrada))  {
			System.out.println("DEBE PRESIONAR WWKSLS");
			cuy1.setVida(cuy1.getVida() -1) ;
			if (cuy1.getVida() <= 0 ) {
				break ;
			}
			entrada = teclado.nextLine() ; 
		}
		if(duo1.equals(entrada)) return 1;
		else return 0;
	}
	public void ImprimirDuo4(Mapa mapa, Personaje cuy1, Personaje  cuy2){
		Scanner teclado = new Scanner(System.in);
		System.out.println("DEBE PRESIONAR LDOEQUOE");
		String duo1 = "LDOEQUOE" ;
		String entrada = teclado.nextLine() ;
		while ( !duo1.equals(entrada))  {
			System.out.println("DEBE PRESIONAR LDOEQUOE");
			cuy1.setVida(cuy1.getVida() -1) ;
			if (cuy1.getVida() <= 0 ) return ; 
			entrada = teclado.nextLine() ; 
		}
		//DUO - POSICION 1
		cuy1.setPosX(6);
		cuy1.setPosY(10);
		cuy2.setPosX(6);
		cuy2.setPosY(9);		
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 2
		cuy1.setPosX(6);
		cuy1.setPosY(13);
		cuy2.setPosX(5);
		cuy2.setPosY(13);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		System.out.println("PUEDES MOVERTE Y CONTINUAR");
		
	}
	public void ImprimirDuo3(Mapa mapa, Personaje cuy1, Personaje  cuy2){
		///// FAlta 
		Scanner teclado = new Scanner(System.in);
		System.out.println("DEBE PRESIONAR WUOQEI");
		String duo1 = "WUOQEI" ;
		String entrada = teclado.nextLine() ;
		while ( !duo1.equals(entrada))  {
			System.out.println("DEBE PRESIONAR WUOQEI");
			cuy1.setVida(cuy1.getVida() -1) ;
			if (cuy1.getVida() <= 0 ) return ; 
			entrada = teclado.nextLine() ; 
		}
		//DUO - POSICION 1
		cuy1.setPosX(9);
		cuy1.setPosY(11);
		cuy2.setPosX(9);
		cuy2.setPosY(10);		
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 2
		cuy1.setPosX(7);
		cuy1.setPosY(11);
		cuy2.setPosX(7);
		cuy2.setPosY(10);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 3
		cuy1.setPosX(5);
		cuy1.setPosY(11);		
		cuy2.setPosX(6);
		cuy2.setPosY(11);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 4
		cuy1.setPosX(2);
		cuy1.setPosY(12);		
		cuy2.setPosX(2);
		cuy2.setPosY(13);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 5
		cuy1.setPosX(0);
		cuy1.setPosY(12);		
		cuy2.setPosX(4);
		cuy2.setPosY(12);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;

		System.out.println("PUEDES MOVERTE Y CONTINUAR");
	}
	//La impresion del duo
	public void ImprimirDuo2(Mapa mapa, Personaje cuy1, Personaje  cuy2){
		Scanner teclado = new Scanner(System.in);
		System.out.println("DEBE PRESIONAR IWOELD");
		String duo1 = "IWOELD" ;
		String entrada = teclado.nextLine() ;
		while ( !duo1.equals(entrada))  {
			System.out.println("DEBE PRESIONAR IWOELD");
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

		System.out.println("PUEDES MOVERTE Y CONTINUAR");
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
		cuy2.setPosX(6);
		cuy2.setPosY(4);
		cuy1.setPosX(8);
		cuy1.setPosY(4);		
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 2
		cuy2.setPosX(7);
		cuy2.setPosY(4);
		cuy1.setPosX(7);
		cuy1.setPosY(5);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		//DUO - POSICION 3
		cuy2.setPosX(8);
		cuy2.setPosY(7);		
		cuy1.setPosX(8);
		cuy1.setPosY(8);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		
		//DUO - POSICION 4
		cuy1.setPosX(9);
		cuy1.setPosY(8);		
		cuy2.setPosX(5);
		cuy2.setPosY(8);
		ImprimirMapa(mapa,cuy1,cuy2);
		entrada = teclado.nextLine() ;
		System.out.println("PUEDES MOVERTE Y CONTINUAR");
	}
}