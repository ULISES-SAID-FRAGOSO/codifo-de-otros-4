

//el funcioamiento del codigo consiste en a traves de un scanner y realizando su import correspondiente
//logre que el usuario pueda escribir su respuesta en base a un mensaje de texto establecido
// se usar nextline para cada unos de los jugadores 
//y se usan un condicional if para realizar pruebas y enviar un mensaje de empate cuando se escriba lo mismo
//se ocupa un switch con diferentes casos para definir al ganador en base a sus respuestas
//por ultimo se hace un return y se cierra el scanner


package com.generation;

import java.util.Scanner; //se importa scanner

public class Codigo4 {
	
	public static void main(String[] args) { //se agrega metodo main
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();
		
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");//se cambia a jugador 2
		//Scanner s2 = new Scanner(); //se quita este sacnner
		String j2 = s.nextLine();
		
		if (j1 == j2) {//se quita parentesis demas
			System.out.println("Empate");
		} else {
			int g = 2;
			switch(j1) {
			case "piedra":
				if (j2 == "tijeras") {
					g = 1;
				}
				break; //se añade break
				
			case "papel":
				if (j2 == "piedra") {
					g = 1;
				}
					break;//se añade break
					
				case "tijera":
					if (j2.equals("papel")) {
						g = 1;
					}
					break;
				default:
					s.close();
					return;
				}
				System.out.println("Gana el jugador " + g);
			}
		s.close();
	}
  
  
}