package com.ceatcurso.model;

public class CajaCarton extends Caja {
	static double cartonTotal=0;//Cartón utilizado (cm2) para construir todas las cajas
	protected double area;//area de la superficie de la caja de cartón, en cm2
	 //oculto el atributo etiqueta(que en la superclase es uba cadena)con un entero
	int etiqueta;//ahora la etiqueta de la caja es un numaro

	public CajaCarton(double ancho, double alto, double fondo) {
		super(ancho, alto, fondo,Unidad.CM);//reutilizamos constructor
		area=2*(ancho*alto+ancho*fondo+alto*fondo);//Calculamos el área
		cartonTotal+=area;//acumulamos el area total de carton utilizando en las construccion todas las cajas
		
	}

	public double getArea() {
		return area;//devolvemos el �rea
	}
	@Override// Sustituimos el metodo de la superclase
	public double getVolumen() {
		//Aunque el volumen de una caja de cartón coincida con el volumen de una caja, 
		//en la practica ,para evitar roturas,
		return volumen*0.8;
		
	}
	@Override
	public String toString() {
		String result="\nCarton Total "+cartonTotal+"cm2\n";
		result+="�rea: "+area+"cm2\n";
		result+=super.toString();
		
		return result;
	}
	
	

	
	

}
