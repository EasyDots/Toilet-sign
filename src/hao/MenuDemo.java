package hao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MenuDemo implements ActionListener {
    JLabel jlab;//创建一个标签对象
    MenuDemo(){
        JFrame jfrm=new JFrame("便签");//创建窗口名叫Menu Demo
        Mianban m=new Mianban();
        jfrm.setSize(300,500);//设置窗口大小
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置虚拟机的关闭
        jlab=new JLabel();//创建一个标签
        JMenuBar jmb=new JMenuBar();//创建顶级菜单（菜单的容器）
        JMenu jmFile=new JMenu("File");//创建一个菜单
        JMenuItem jmiOpen=new JMenuItem("Open");//创建菜单项叫Open
        JMenuItem jmiClose=new JMenuItem("Close");//创建菜单项叫Close
        JMenuItem jmiSave=new JMenuItem("Save");
        JMenuItem jmiExit=new JMenuItem("Exit");//创建菜单项叫Exit
        jmFile.add(jmiOpen);/*把选项添加进菜单里*/
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        jmb.add(jmFile);//把菜单添加进菜单容器里
        JMenu jmFile1=new JMenu("Options");

        jmiOpen.addActionListener(this);//添加动作监听
        jmiClose.addActionListener(this);//所有的选项都要添加监听
        jmiExit.addActionListener(this);
        jfrm.add(jlab);//给窗口添加标签
        jfrm.setJMenuBar(jmb);//菜单栏必须通过调用setJMenuBar()添加到框架中
        jfrm.add(m);
        jfrm.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String comStr=ae.getActionCommand();
        if(comStr.equals("Exit"))System.exit(0);
    }
}




