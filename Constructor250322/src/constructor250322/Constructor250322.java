
package constructor250322;


public class Constructor250322 {


    public static void main(String[] args) {
        
        //Instancia a la clase que no tiene constructor
     SinConstructor mensajero = new SinConstructor();
       mensajero.PedirNombre();
       mensajero.Imprimir();
        
        //Instancia a la clase que tiene constructor
     ConConstructor mensajero2 = new ConConstructor();
       
    }
    
}
