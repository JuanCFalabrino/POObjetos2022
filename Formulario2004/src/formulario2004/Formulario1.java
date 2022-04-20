
package formulario2004;

import javax.swing.*;
import java.awt.event.*;

public class Formulario1 extends JFrame{
    private JLabel Nombre,Apellido,Direccion;
    private JButton boton1,boton2,boton3;
    private ActionListener l;
    
   public Formulario1(){
       setLayout(null);
       Nombre = new JLabel("JUAN");
       Nombre.setBounds(60, 10, 100, 100);
       add(Nombre);
       Apellido = new JLabel("Perez");
       Apellido.setBounds(160,10, 100, 100);
       add(Apellido);
       Direccion = new JLabel("Irala 1311");
       Direccion.setBounds(260, 10, 100, 100);
       add(Direccion);
       boton1 = new JButton("1");
       boton1.setBounds(20,110,90,30);
       add(boton1);
       //boton1.addActionListener(this);
       boton2 = new JButton("2");
       boton2.setBounds(130,110,90,30);
       add(boton2);
      // boton2.addActionListener(this);
       boton3 = new JButton("3");
       boton3.setBounds(250,110,90,30);
       add(boton3);
       //boton3.addActionListener(this);
               
      }
   
   public void acctionPerformed(ActionEvent e){
        
       if (e.getSource() == boton1){
       
           Nombre.setText("Botón 1");
       
       }
       
       
       
   
   }
    
    
}
