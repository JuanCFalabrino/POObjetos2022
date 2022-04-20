
package formulario2004;


public class Formulario2004 {

   
    public static void main(String[] args) {
       
        Formulario1 form = new Formulario1();
        //Definimos donde se va a posisionar y el tamaño que tiene el formulario
        form.setBounds(50,50,450,400);
        //hacer visible el formulario
        form.setVisible(true);
        //Centrar formulario 
        form.setLocationRelativeTo(null);
        //permitir la edición del tamaño
        form.setResizable(true);
        //definir el titulo del formulario
        form.setTitle("Formulario de Prueba");
        //Acceiones botones del formulario
        form.setDefaultCloseOperation(Formulario1.EXIT_ON_CLOSE);
        
        
        
    }
    
}
