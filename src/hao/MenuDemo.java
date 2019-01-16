package hao;
import java.awt.*;
import javax.swing.*;

public class MenuDemo extends JFrame {
       MenuDemo(){
           JMenuBar m=new JMenuBar();
           setJMenuBar(m);
           Menu file=new Menu("File");
           MenuItem item1,item2,item3,item4,item5;
           file.add(item1=new MenuItem("new..."));
           file.add(item2=new MenuItem("Open..."));
           file.add(item3=new MenuItem("Close"));
           file.add(item4=new MenuItem("-"));
           file.add(item5=new MenuItem("Quit..."));
           m.add(file);
           Menu edit=new Menu("Edit");
           MenuItem item6,item7,item8,item9;
           file.add(item6=new MenuItem("cut"));
           file.add(item7=new MenuItem("copy"));
           file.add(item8=new MenuItem("Paste"));
           file.add(item9=new MenuItem("-"));
           m.add(edit);
           MyMenuHandler handler=new MyMenuHandler();
           item1.addActionListener(handler);
           item2.addActionListener(handler);
           item2.addActionListener(handler);
           item3.addActionListener(handler);
           item4.addActionListener(handler);
           item5.addActionListener(handler);
           item6.addActionListener(handler);
           item7.addActionListener(handler);
           item8.addActionListener(handler);
           item9.addActionListener(handler);

       }
}

