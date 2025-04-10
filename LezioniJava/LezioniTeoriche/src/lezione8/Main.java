package lezione8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//utilizzo la classe main per testare il punto, ovvero creare le istanze della classe punto
		
		Punto p = new Punto(); //richiamo il metodo costruttore del Punto
		
		//nel fare p.x con la notazione . richiamo le proprietà del mio oggetto
		System.out.println("La x1 del mio punto vale: "+ p.x);
		System.out.println("La y1 del mio punto vale: "+ p.y);
		
		Punto p2 = new Punto(3,2);
		System.out.println("La x2 del mio punto vale: "+ p2.x);
		System.out.println("La y2 del mio punto vale: "+ p2.y);
		
		Punto p3 = new Punto(2.4,5.7);
		System.out.println("La x3 del mio punto vale: "+ p3.x);
		System.out.println("La y3 del mio punto vale: "+ p3.y);
		
		Scanner s = new Scanner(System.in);
		System.out.println("metti 2 numeri, a ogni numero premi invio");
		int x = s.nextInt();
		int y = s.nextInt();
		Punto p4 = new Punto (x,y);
		System.out.println(p4.toString());
		
		Rettangolo r1 = new Rettangolo(5, 6);
		System.out.println(r1.toString());
		
		
		s.close();
	}

	
}
