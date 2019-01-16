package hao;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    Mianban m=new Mianban();
    public Window(){
        this.add(m);
    }
   public void Show(){
       this.setSize(300,500);
       this.setTitle("便签");
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setVisible(true);
   }
}
