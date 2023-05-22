package com.cursoceat.controller;




import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


import com.cursoceat.modell.Contacto;

public class Controller {

	public static void main(String[] args) {
		ArrayList<Contacto> contacto= new ArrayList<Contacto>();
Scanner lector = new Scanner(System.in);
boolean programacionActive = true;
do{
	System.out.println("Que operacion quieres hacer :");
	System.out.println("1. Insertar un contacto  :");
	System.out.println("2. Eliminar un contacto :");
	System.out.println("3. Modificar un contacto :");
	System.out.println("4. Consultar un contacto  :");
	System.out.println("5. Salir  :");
	
	int opcion = lector.nextInt();

	if (opcion == 1) {
		System.out.println("Introducce el nombre del contacto");
		String nombre = lector.next();
		System.out.println("Introduce el telefono ");
		int telefono= lector.nextInt();
		
	Contacto a = new Contacto();
		a.setNombre(nombre);
		a.setTelefono(telefono);
		contacto.add(a);
	
	}else if(opcion == 2) {
		System.out.println("Introduce el alumno que quieres elimar;");
		String nombre=lector.next();
		Iterator<Contacto> it= contacto.iterator();
		while(it.hasNext()) {
			Contacto a= it.next();
			if(a.getNombre().equals(nombre)) {
				it.remove();
			}
		}
		
		
	}else if(opcion == 3) {
		System.out.println("Introduce el nombre");
		String nombre= lector.next();
		System.out.println("Inytrduce el nuevo nommbre :");
		String nombre2 = lector.next();
		System.out.println("introduce el telefono :");
		int telefono2 = lector.nextInt();
		Iterator<Contacto> it= contacto.iterator();
		while(it.hasNext()) {
			Contacto a = it.next();
			if(a.getNombre().equals(nombre)) {
				a.setNombre(nombre2);
				a.setTelefono(telefono2);
			}
		}
		
		
	}else if (opcion == 4) {
		for(Contacto a: contacto) {
		System.out.println("Nombre : "+a.getNombre() +" Telefono :" + a.getTelefono());
		}
		
	}else if(opcion == 5) {
		programacionActive=false;
		
	}else {
		System.out.println("No has escrito correctamente");
		
	} 
	
		
}while(programacionActive);


	



	
}
	}
