package hao;

import javax.swing.*;
<<<<<<< HEAD
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MenuDemo implements ActionListener {
    //JLabel jlab=new JLabel();;//创建一个标签对象
    MenuDemo(){
        JFrame jfrm=new JFrame("便便签");//创建窗口名叫Menu Demo
        jfrm.setBackground(Color.yellow);
        Mianban m=new Mianban();
        jfrm.setSize(300,500);//设置窗口大小
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置虚拟机的关闭
        JMenuBar jmb=new JMenuBar();//创建顶级菜单（菜单的容器）
        JMenu jmFile=new JMenu("文件");//创建一个菜单
//        JMenuItem jmiOpen=new JMenuItem("打开");//创建菜单项叫Open
//        JMenuItem jmiClose=new JMenuItem("Close");//创建菜单项叫Close
//        JMenuItem jmiSave=new JMenuItem("保存");
//        JMenuItem jmiExit=new JMenuItem("退出");//创建菜单项叫Exit
//        jmFile.add(jmiOpen);/*把选项添加进菜单里*/
//        jmFile.add(jmiClose);
//        jmFile.add(jmiSave);
//        jmFile.addSeparator();
//        jmFile.add(jmiExit);
        jmb.add(jmFile);//把菜单添加进菜单容器里
        jmFile.addActionListener(new ActionListener() {//响应事件
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame information=new JFrame("作者");
                JTextArea authorTextArea = new JTextArea("作者: BlueKing");

                authorTextArea.setPreferredSize(new Dimension(40, 80));
                information.add(authorTextArea);
                information.setVisible(true);
            }
        });
        jfrm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.exit(1);
            }
        });
//        jmiOpen.addActionListener(this);//添加动作监听
//        jmiClose.addActionListener(this);//所有的选项都要添加监听
//        jmiExit.addActionListener(this);
        JMenu jmFile1=new JMenu("编辑");
        JMenuItem jmiziti=new JMenuItem("字体");
        JMenuItem jmicolor=new JMenuItem("颜色");
        jmFile1.add(jmiziti);
        jmFile1.add(jmicolor);
        jmb.add(jmFile1);
        jmiziti.addActionListener(this);
        jmicolor.addActionListener(this);
        JMenu jmFile2=new JMenu("总结");
        JMenuItem jmiMonthly=new JMenuItem("月总结");
        JMenuItem jmiyear=new JMenuItem("年总结");
        jmFile2.add(jmiMonthly);
        jmFile2.add(jmiyear);
        jmb.add(jmFile2);
        jmiMonthly.addActionListener(this);
        jmiyear.addActionListener(this);
        JMenu jmFile3=new JMenu("皮肤");
        jmb.add(jmFile3);
        jmFile3.addActionListener(this);
        //jfrm.add(jlab);//给窗口添加标签
        jfrm.setJMenuBar(jmb);//菜单栏必须通过调用setJMenuBar()添加到框架中
        jfrm.add(m);
        jfrm.setVisible(true);

    }
//    public void actionWenjian (){
//
//
//
//    }
    public void actionPerformed(ActionEvent ae){
        String comStr=ae.getActionCommand();
        if(comStr.equals("退出"))System.exit(0);
=======
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
>>>>>>> 51ba2e537392c433d006c6bd6fa3b086087fb82b
    }
}




