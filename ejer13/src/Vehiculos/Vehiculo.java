package Vehiculos;

public class Vehiculo {

	private int cilindrada;
	private int portas;
	private int velocidad_actual=0;
	private int velocidad_maxima;
	
	public static int acelerar(int velocidad){
		if(velocidad<120){
			velocidad+=10;	
		}
		return velocidad;
	}
	public static int desacelerar(int velocidad){
		if(velocidad>0){
			velocidad-=10;
		}
		return velocidad;
	} 
	
	
	
	
	
}
