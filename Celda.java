
public class Celda {
	private char caracter;
	private int posX;
	private int posY;
	
	public Celda (){
		caracter = ' ';
		posX = 0;
		posY = 0;
	}
	
	public Celda (char nuevoCaracter){
		caracter = nuevoCaracter;
		posX = 0;
		posY = 0;
	}
	
	public char getCaracter() {
		return caracter;
	}
	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
}
