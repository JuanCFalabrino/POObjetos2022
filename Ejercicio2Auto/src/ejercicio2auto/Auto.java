
package ejercicio2auto;

import java.util.Scanner;


public class Auto {
  String marca,modelo;
  int kilometraje;
  
  public void estadodelauto(){
      Scanner entrada = new Scanner (System.in);
      System.out.print("Ingrese la Cantidad de KM:");
      kilometraje = entrada.nextInt();
        
        if (kilometraje >0 && kilometraje<10000){
              System.out.print("POCO USO");
  
        }else if (kilometraje >=10000 && kilometraje<100000){
              System.out.println("USADO");
        }else if (kilometraje >=100000 ){
              System.out.println("MUY USADO");
        }else{
             System.out.println("NUEVO");
        }
       
        }
    
    
}
