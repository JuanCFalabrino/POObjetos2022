
package textbox2204;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
    
    private JTextField Texto;
    private JLabel     Etiqueta;
    private JButton    Boton;
    
  
    public Formulario(){
        setLayout(null);
        Etiqueta = new JLabel("Usuario:");
        Etiqueta.setBounds(10,10,100,30);
        add(Etiqueta);
        
        
        Texto = new JTextField();
        Texto.setBounds(120,17,150,20);
        add(Texto);
        
        Boton = new JButton ("Aceptar");
        Boton.setBounds(10,80,100,30);
        add(Boton);
        Boton.addActionListener(this);
        
           
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Boton){
            String TextoCaja = Texto.getText();
            setTitle(TextoCaja);
        
        }
    
    
    }
    
    public static void main(String arg []){
        Formulario Form = new Formulario();
        Form.setBounds(0,0,300,150);
        Form.setVisible(true);
        Form.setResizable(false);
        Form.setLocationRelativeTo(null);
    
    
    }
      
}
