
import java.util.Scanner;

public class Juego {
	int nextLevel = 0;
	private Scanner teclado;
	
	public void FinDelJuego(){
		System.out.println("Felicitaciones, eres el mejor. Terminaste el juego");
	}
	
	public void Historia_4(){
		String linea;
		System.out.println("Bienvenido a Historia_4  (presione enter para continuar)");
		linea = teclado.next();
		FinDelJuego();
	}

	public void Nivel_2(){
		int entero;
		System.out.println("Bienvenido al Nivel_2  (escriba un numero para continuar)");
		entero = teclado.nextInt();
		if(entero != nextLevel){
			Historia_4();
		}
		else{
			System.out.println("Game Over");
		}
	}
	
	public void Historia_3(){
		String linea;
		System.out.println("Bienvenido a Historia_3  (presione enter para continuar)");
		linea = teclado.next();
		Nivel_2();
	}
	
	public void Nivel_1(){
		int entero;
		System.out.println("Bienvenido al Nivel_1  (escriba un numero para continuar)");
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
		Nivel_1();
	}
	
	public void Tutorial(){
		int entero;
		System.out.println("Bienvenido al tutorial  (escriba un numero para continuar)");
		entero = teclado.nextInt();
		if(entero != nextLevel){
			Historia_2();
		}
		else{
			System.out.println("Game Over");
		}
	}
	
	public void Historia_1(){
		String linea;
		System.out.println("Bienvenido a Historia_1  (presione enter para continuar)");
		linea = teclado.next();
		Tutorial();
	}
	
	public void NuevoJuego(){
		String linea;
		System.out.println("Escriba su nombre: ");
		linea = teclado.next();
		Historia_1();
	}
	
	public void PantallaInicial(){
		
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
				NuevoJuego();
			}
			else if(opcion == 2){
				System.out.println("Seguro que quiere salir? ");
				System.out.println("1) Sí");
				System.out.println("2) No");
								
				salida = teclado.nextInt();
				
				if(salida == 1)
					break;
			}
		}
	}
	
	
	
	public static void main(String[] parametro) {
		Juego juego = new Juego();
		
		juego.PantallaInicial();
//		ClasePrueba cl = new ClasePrueba() ; 
//		cl.prueba();
		//PRUEBA DE MAPA
//		Mapa map = new Mapa();
//		map.GestorMapa(2);
//		map.ImprimirMapa();
//		Personaje p = new Personaje("Brayan", 10, 190, 0 , 3, 'A', true, false);
//		System.out.print(p.getEstadoActual());
		
    }
}


