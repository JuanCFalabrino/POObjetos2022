
package Polimorfismo;

import java.util.Scanner;


public abstract class OperacionP {
    
    protected int valor1,valor2,resultado;
    Scanner leer = new Scanner(System.in);
    
    public void PedriDatos(){
        System.out.print("Dame el primer valor :");
        valor1 = leer.nextInt();
        
        System.out.print("Dame el segundo valor :");
        valor2 = leer.nextInt();
    }
    
    public abstract void operaciones ();
    
    public void Mostrarresultado(){
        System.out.print("El resultado es : " + resultado);
     }
    
}
