/*
 Pedri datos y Mostrar resultados
 */
package herencia010422;

import java.util.Scanner;

public class ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);
    
    //Este método pide los valores al usuario
    public void PedirDatos(){
        System.out.print("Por favor deme el primer valor : ");
        valor1 = entrada.nextInt();
        System.out.print("Por favor deme el segundo valor : ");
        valor2 = entrada.nextInt();
    
    }
    //este método muestra el resultado
    public void VerResultado(){
        System.out.println("El resultado de la suma es  " + resultado);
            
    }
    
    
    
    
    
    
}
