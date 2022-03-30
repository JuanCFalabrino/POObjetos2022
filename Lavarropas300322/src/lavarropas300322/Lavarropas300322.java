/*
Crear la clase Lavarropas con los atributos marca, modelo y kilos de lavado, elegir el tipo de dato adecuado para ellos. Además se debe crear el método TipodeRopa e imprimir el tipo seleccionado:
Tipos de Ropa:
1_Lana
2_Ropa Sucia
3_Economico
4_Ropa de Bebe
 */
package lavarropas300322;

import java.util.Scanner;


public class Lavarropas300322 {


    public static void main(String[] args) {
        
      Scanner programaleer = new Scanner(System.in);
              
      System.out.println("------ Seleccione el Programa -----");
      System.out.println("------(1) LANA                -----");
      System.out.println("------(2) ROPA MUY SUCIA      -----");  
      System.out.println("------(3) ECONOMICO           -----");  
      System.out.println("------(4) ROPA DE BEBE        -----"); 
      System.out.print(":");
      int prog = programaleer.nextInt();
      
      Programas MS = new Programas(prog);
      Lavarropas Tipo = new Lavarropas();
      Tipo.especificaciones();
      MS.display();
      
              
    }
    
}
