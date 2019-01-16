package hao;

import javax.swing.*;
import java.awt.*;

public class Mianban extends JPanel {
        private JTextArea j=new JTextArea();
        private MenuDemo appwin=new MenuDemo();
        public Mianban(){
            this.setLayout(null);
            j.setBounds(30, 120, 200, 320);
            j.setBackground(Color.orange);
            this.add(j);
            j.setLineWrap(true);
            appwin.setSize(new Dimension(250,300));
        }
        public void paint(Graphics g){
            g.setFont(new Font("楷体",Font.BOLD,15));
            g.drawString("今天你要做：",30,100);
        }

}
