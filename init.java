
import javax.swing.*;
import java.awt.*;

class youtube
{  
  
  static JProgressBar bar_1;

  public static JLabel H1()
  {
    JLabel h;
    h=new JLabel("Welcome to MewBot");

    h.setBounds(200,0,300,100);
    h.setFont(new Font("Courier New", Font.BOLD, 20));
    h.setForeground(Color.BLUE);

    return h;
  }


  public static JTextArea A1()
  {  
    JTextArea a=new JTextArea("Enter Your URLs Here");  
    a.setBounds(130,230, 100 ,100);  
    return a;
  }

  public static void Bar_1()
  {
    bar_1= new JProgressBar();
    bar_1.setValue(0);
    bar_1.setStringPainted(true);
    
  }

  public static void fill()
  {
    int i=0;
    try
    {
      while(i<=100)
      {
        bar_1.setValue(i+10);
        Thread.sleep(1000);
        i+=20;
      }
    }

    catch(Exception e)
    {

    }
  }


  public static void main(String[] args)
  {  
    JFrame f=new JFrame("MewBot.exe"); //creating instance of JFrame

    JPanel panel_1=new JPanel();
    
    Bar_1();

    panel_1.add(bar_1);

    panel_1.setBounds(10,1000,400,50);
    

    JLabel h1=H1();
    JTextArea a1=A1();

      
    JButton b=new JButton("click me");//creating instance of JButton
    b.setBounds(130,100,100, 40);//x axis, y axis, width, height
    f.setVisible(true);          
    f.add(h1);

    f.add(b);//adding button in JFrame    
    f.add(a1);  
            

    f.add(panel_1);
    f.add(b);//adding button in JFrame           


    fill();

     


    f.setSize(1366,768);//600 width and 800 height  
    f.setLayout(null);//using no layout managers  
    f.setVisible(true);//making the frame visible  

  }  

  
}  
