
package ejercicio3.banco;

import java.util.Scanner;



public class CuentaBancaria {
   String nombre;
   String tipo_cuenta;
   double saldo = 1200;
   double retirar;
   
   public void extraer(){
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Ingrese el monto que desea retirar");
       retirar = entrada.nextDouble();
               
       if (retirar >0 ){
           if (retirar>=saldo){
            System.out.println("--Su cuenta no tiene saldo--");
           System.out.println("--Muchas Gracias --");
           }else
           System.out.println("--Quiere Imprimir el Ticket--");
           }
                   
            }
   
       
       
       
       }
       
       
   
   
   }
    
    
    
}
