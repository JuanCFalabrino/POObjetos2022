
package Polimorfismo;


public class ClasePrincipal {
    public static void main(String[] args){
        
        OperacionP suma = new Suma_H();
        suma.PedriDatos();
        suma.operaciones();
        suma.Mostrarresultado();
        
        OperacionP resta = new Resta_H();
        resta.PedriDatos();
        resta.operaciones();
        resta.Mostrarresultado();
    
    
    
    }
     
    
}
