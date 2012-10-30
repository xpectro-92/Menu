/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Menu
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.print("Instituto Tecnologico Superior de Esecarcega\n\nAlumno:David Díaz Rodríguez\n\nElige opcion");
       
      int ayuda = 0;
      Scanner leer = new Scanner (System.in);
      ayuda = leer.nextInt();
      
      switch (ayuda){
          case 0:
              String Ayuda = "Este programa fue creado por david diaz rodriguez, fue hecho para poder aprender a leer un caracter en java, tambien para poder invertir los caracteres en java.\n\nPara utilizareste programa tienes q elegir primero una opcion que esta desde el 0 hasta el 4, la opcion 1 te muestra los caracteres invertidos, la opcion 2 te muestra cuantos caracteres tienes o hay, la opcion 3 te muetra el rango que hay de un numero inicial a un numero final y por ultimo la opcion 4 que te muestra la inversa de la opcion ";
              
         System.out.print(Ayuda);
          case 1:
              String david = leer.next();
              
              for(int i = david.length() -1;i>=0;i--){
                  char g = david.charAt(i);
                  System.out.print(g);
                  }
              break;
          case 2:
             String Cadena = leer.next();
             System.out.println("Tamaño de la cadena: " +   Cadena.length() + " caracteres");
                        
                    break;
              
          case 3:
              String morenito = leer.next();
              int a = leer.nextInt();
              int b = leer.nextInt();
              
              
              
      }
      
      
    }
}
