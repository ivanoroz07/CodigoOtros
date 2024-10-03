//Se resaltan los numeros seleccionados de acuerdo a la elección del usuario

import java.util.Scanner;

public class codigo6 {
	 public static void main(String[] args) {//se agrego main
	    int[] n = new int[20];//se corrige array

	    for (int i = 0; i < 20; i++) {//se agrego un +
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");//se agrego out
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");//se corrigion print
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    
	    Scanner sc = new Scanner(System.in);
	    int opcion = sc.nextInt();//se uso scanner
	    
	    int multiplo = (opcion == 1) ? 5 : 7;//se cambian operadores

	    for (int e : n) {//se cambia a for 
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      } else {//se coloca una llave para cerrar
	        System.out.print(e + " ");
	      }
	    } 
	    sc.close();//Se cierra el escanner
	  }
	}