
package combobox2704;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBox2704 extends JFrame implements ItemListener {

    private JComboBox Combo;
    private JLabel Etiqueta;
    
    public ComboBox2704(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Combo = new JComboBox();
        Combo.setBounds(10,10,80,20);
        add(Combo);
        
        Combo.addItem("Rojo");
        Combo.addItem("Verde");
        Combo.addItem("Azul");
        Combo.addItem("Amarillo");
        Combo.addItem("Negro");
        Combo.addItemListener(this);
                        
        Etiqueta = new JLabel();
        Etiqueta.setBounds(100,10,80,20);
        add(Etiqueta);
        
            
    }
    
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==Combo){
            String Seleccion = Combo.getSelectedItem().toString();
            Etiqueta.setText(Seleccion);
            setTitle(Seleccion);
            this.getContentPane().setBackground(Color.blue);
              
        }
    
    
    }
    
    
    public static void main(String[] args) {
        
           ComboBox2704 Combo = new ComboBox2704();
           Combo.setBounds(0,0,200,150);
           Combo.setVisible(true);
           Combo.setResizable(true);
           Combo.setLocationRelativeTo(null);
        
        
    }
    
}
