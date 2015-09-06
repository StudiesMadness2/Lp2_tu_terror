
import java.util.Scanner;

public class Juego {
	private Scanner teclado;
	private int opcion;
	private String linea;
	
	public void PantallaInicial(){
		
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
				break;
			}
		}
	}
	
	public void NuevoJuego(){
		System.out.println("Escriba su nombre: ");
	}
	
	public void toma(){
		System.out.println("TOMA");
	}
	
	public static void main(String[] parametro) {
		Juego juego = new Juego();
		
	//	juego.PantallaInicial();
		ClasePrueba cl = new ClasePrueba() ; 
		cl.prueba();
		System.out.println("Prueba de Merge 1 ");
		System.out.println("Prueba de Merge 2 ");
		System.out.println("Prueba de Merge 3 ");
		System.out.println("Prueba de Merge 4 ");
		System.out.println("Prueba de Merge 5 ");
		System.out.println("Prueba de Merge 6 ");
		
		
    }
}


