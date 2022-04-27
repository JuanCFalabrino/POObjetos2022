
package eje20.pkg2704;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Eje202704 extends JFrame implements ActionListener {

    private JTextField Texto1,Texto2;
    private JLabel Etiqueta1,Etiqueta2,Etiqueta3;
    private JButton Boton;
    
    public Eje202704(){
        setLayout(null);
        
        Etiqueta1 = new JLabel("Valor 1");
        Etiqueta1.setBounds(50, 5, 100, 30);
        add(Etiqueta1);
    
    
        Etiqueta2 = new JLabel("Valor 2");
        Etiqueta2.setBounds(50, 35, 100, 30);
        add(Etiqueta2);
    
    
        Etiqueta3 = new JLabel("Resultado");
        Etiqueta3.setBounds(120, 85, 100, 30);
        add(Etiqueta3);
    
        
        Texto1 = new JTextField();
        Texto1.setBounds(120, 10, 150, 20);
        add(Texto1);
        
        Texto2 = new JTextField();
        Texto2.setBounds(120, 40, 150, 20);
        add(Texto2);
        
        Boton = new JButton ("SUMAR");
        Boton.setBounds(10, 80, 100, 30);
        add(Boton);
        Boton.addActionListener(this);
            
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Boton){
            int valor1=0,valor2=0,resultado=0;
            
            valor1 = Integer.parseInt(Texto1.getText());
            valor2 = Integer.parseInt(Texto2.getText());
            
            resultado = valor1 + valor2;
            
            Etiqueta3.setText("Resultado : " + resultado);
            
                   
        }
    
    }
    
    
    

    public static void main(String[] args) {
       
        Eje202704 f = new Eje202704();
        f.setBounds(0,0,300,150);
        f.setVisible(true);
        f.setVisible(true);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        
        
        
        
        
    }
    
}
