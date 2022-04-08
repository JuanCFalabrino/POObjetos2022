
package Paquete1;


public class Encapsulamiento080422 {

  
    public static void main(String[] args) {
      
        AtributosMetodos clase =  new AtributosMetodos();
       
        System.out.println(clase.get_valorpr());
        
        int valor1 = clase.get_valorpr();
        
        int resultado = valor1 * 60;
        
        System.out.println("resultado" +   resultado);
                
        clase.set_valorpr(resultado);
        
        System.out.println("ValorPR " + clase.get_valorpr());
        
        
    }
    
}
