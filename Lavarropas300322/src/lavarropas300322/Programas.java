
package lavarropas300322;

public class Programas {
  private int tipoderopa = 0;
  
  public Programas(int prog){
  this.tipoderopa = prog;
  
  }
   
  private void lavado(){
      switch(tipoderopa)
      {
          case 1: System.out.println("Lavado Suave la lana");
          break;
          case 2: System.out.println("Lavado Furioso ropa muy sucia");
          break;
          case 3: System.out.println("Lavado Economico");
          break;
          case 4: System.out.println("Lavado ropa de BEBE");   
          break;
          default:System.out.println("No existe el programa seleccionado");
          break;
      
           
      }
      
    }
  public void display(){
  lavado();
  
  
  }
    
    
    
    
    
    
    
    
}
