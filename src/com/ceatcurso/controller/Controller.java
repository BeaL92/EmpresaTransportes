package com.ceatcurso.controller;

import java.util.Scanner;

import com.ceatcurso.model.Caja;
import com.ceatcurso.model.Caja.Unidad;
import com.ceatcurso.model.CajaCarton;

public class Controller {
 public static void main(String[] args) {
	System.out.println("** Comencemos a crear la caja **");
	System.out.println("¿En que unidad de medida indicara los datos?\n 1.Cm \n 2.M");
	int opcion=new Scanner(System.in).nextInt();
	Unidad uni=null;
	uni=Unidad.values()[opcion-1];
	System.out.println("Indique el Alto de la Caja");
	double alto=new Scanner(System.in).nextDouble();
	System.out.println("Indique el Ancho de la Caja");
	double ancho=new Scanner(System.in).nextDouble();
	System.out.println("Indique el Fondo de la Caja");
	double fondo=new Scanner(System.in).nextDouble();
	Caja nuevaCaja=new Caja(ancho, alto, fondo, uni);
	System.out.println("Indique el texto de la Etiqueta (max 30 caracteres)");
	nuevaCaja.setEtiqueta(new Scanner(System.in).nextLine());
	System.out.println("La caja tiene los siguentes caracteres");
	System.out.println(nuevaCaja.toString());
	System.out.println("***Crear caja de Cartón 1");
	CajaCarton miPrimeraCajaCarton=new CajaCarton(50,50,45);
	miPrimeraCajaCarton.setEtiqueta("1");
	System.out.println(miPrimeraCajaCarton.toString());
	System.out.printf("El volumen es %.2f",miPrimeraCajaCarton.getVolumen());
	CajaCarton miSegundaCajaCarton=new CajaCarton(150,150,145);
	miSegundaCajaCarton.setEtiqueta("2");
	System.out.println(miSegundaCajaCarton.toString());
	System.out.printf("El volumen es %.2f",miSegundaCajaCarton.getVolumen());
}
	

}
