
package tabs2206;

import java.io.*;
import javax.swing.JOptionPane;



public class archivo {
    
    File archivo;
    
    Seguros s = new Seguros();
    
    
    
    public void crearArchivo(){
        try{
            //crear el archivo
            archivo = new File("SegurosCFP.txt");
            if (archivo.createNewFile()){
              JOptionPane.showMessageDialog(null,"El archivo fue creado con exito");
              }
        } catch (IOException e){
           System.out.println(e);
        }
    }
        
    
    public void escribirEnarchivo(Persona persona){
            Seguros s = new Seguros();
            
            
        
        try{
          
                    
            FileWriter escribir = new FileWriter(archivo,true);
            escribir.write( persona.getTseg() + ";" + persona.getCuilcli() + ";"+ persona.getNombrecli() + ";" + persona.getTelcli() + ";" + persona.getMailcli() + ";" + persona.getDominio() + ";" + persona.getMarca() + ";" + persona.getModelo() + ";" + persona.getConfra() + ";" + persona.getAna() + ";" + persona.getBox1() + ";" + persona.getBox2() + ";" + persona.getBox3() + ";" + persona.getBox4() + ";" + persona.getBox5() +"\r\n");
            escribir.close();
            
        }catch(IOException e){
           System.out.println(e);
        }
        
        
        
    }
}
        
    
    
    
    
    
    
    
    
    
    
    
    
}
