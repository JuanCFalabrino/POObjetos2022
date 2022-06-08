
package Gestor;

import java.io.*;
import javax.swing.JOptionPane;

public class archivo {
    
    File archivo;
    
    public void crearArchivo(){
        try{
            //crear el archivo
            archivo = new File("Delivery.txt");
            if (archivo.createNewFile()){
              JOptionPane.showMessageDialog(null,"El archivo fue creado con exito");
              }
        } catch (IOException e){
           System.out.println(e);
        }
    }
    
    public void escribirEnarchivo(Persona persona){
        try{
            //escribir en el archivo
           FileWriter escritura = new FileWriter(archivo, true);
           escritura.write(persona.getDnom() + "%" + persona.getDtele() + "%" + persona.getDdirec() + "%"  + persona.getDloca()+ "%" + persona.getDentre() +"%" + persona.getDtele() +"%" + persona.getDcoment() + "\r\n");
           escritura.close();
        }catch (IOException e ) {
            System.out.println(e);
        
        }
        
            
    }
        
    
    
    }
    
    
    
    
    
    
    
    
    
}
