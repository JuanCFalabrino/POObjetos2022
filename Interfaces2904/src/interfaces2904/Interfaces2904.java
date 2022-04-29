
package interfaces2904;

import javax.swing.*;
import java.awt.event.*;

public class Interfaces2904 extends JFrame implements ActionListener{

    private JTextField textField1;
    private JLabel label1;
    private JButton boton1;
    
    public Interfaces2904(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        label1 = new JLabel("Mensaje:");
        label1.setBounds(15, 10, 100, 30);
        add(label1);
        
        textField1 = new JTextField();
        textField1.setBounds(80, 16, 190, 20);
        add(textField1);
        
        boton1 = new JButton("Mostrar");
        boton1.setBounds(10, 60, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }
       @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            String cadena = textField1.getText();
            JOptionPane.showMessageDialog(null, cadena);
        }
    }
       
    
    
    
    public static void main(String[] args) {
      Interfaces2904 formulario = new Interfaces2904();
        formulario.setBounds(0,0,300,150);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setTitle("Interface con Swing");
    }
    
}
