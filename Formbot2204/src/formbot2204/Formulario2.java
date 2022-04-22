
package formbot2204;
  import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
  import java.awt.event.ActionListener;
  import javax.swing.JButton;
  import javax.swing.JFrame;
  import javax.swing.JLabel;
  
  

public class Formulario2  extends JFrame implements ActionListener {
    private JButton bot1,bot2,bot3,bot4;
    private JLabel etiqueta;
    
    //Constructor
    public Formulario2(){
      setLayout(null);
      
      //crear botones
      bot1 = new JButton("1");
      bot1.setBounds(10,100,90,30);
      add(bot1);
      bot1.addActionListener(this);
      
      bot2 = new JButton("2");
      bot2.setBounds(110,100,90,30);
      add(bot2);
      bot2.addActionListener(this);
      
       bot3 = new JButton("3");
      bot3.setBounds(210,100,90,30);
      add(bot3);
      bot3.addActionListener(this);
      
      bot4 = new JButton("SALIR");
      bot4.setBounds(210,200,90,30);
      add(bot4);
      bot4.addActionListener(this);
      
      //crear etiqueta
      etiqueta = new JLabel("Cliequeá un botón.....");
      etiqueta.setBounds(10,10,300,30);
      add(etiqueta);
      
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == bot1){
            etiqueta.setText("Has Presionado el botón 1");
         }
        if (e.getSource() == bot2){
            etiqueta.setText("Has Presionado el botón 2");
         }
        if (e.getSource() == bot3){
            etiqueta.setText("Has Presionado el botón 3");
         }
        if (e.getSource() == bot4){
            System.exit(0);
        }
    
    }

    
    
    
    
    }
    




