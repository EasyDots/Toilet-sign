package hao;

import javax.swing.*;
import java.awt.*;

public class Mianban extends JPanel {
        private JTextArea j=new JTextArea();
        public Mianban(){
            this.setLayout(null);
            j.setBounds(30, 120, 200, 300);
            j.setBackground(Color.orange);
            this.add(j);
            j.setLineWrap(true);
        }
        public void paint(Graphics g){
            g.setFont(new Font("楷体",Font.BOLD,15));
            g.drawString("今天你要做：",30,100);
        }

}
