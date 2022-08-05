package cn.tedu.submainre;

import javax.swing.*;


//图片资源加载类
//负责加载并初始化项目中所有需要用到的图片
public class ImageResources {
//    ImageIcon 类型 用来存储图片资源的类型
    public static ImageIcon battleship;//存储战舰图片的变量
    public static ImageIcon bomb;
    public static ImageIcon gameover;
    public static ImageIcon mine;
    public static ImageIcon minesubm;
    public static ImageIcon obsersubm;  //引用类型
    public static ImageIcon sea;
    public static ImageIcon start;
    public static ImageIcon torpedo;
    public static ImageIcon torpesubm;
    static {
        //静态代码块
        battleship =new ImageIcon("src/cn/tedu/submainre/img/battleship.png");
        bomb =new ImageIcon("src/cn/tedu/submainre/img/bomb.png");
        gameover=new ImageIcon("src/cn/tedu/submainre/img/gameover.png");
        mine=new ImageIcon("src/cn/tedu/submainre/img/mine.png");
        minesubm=new ImageIcon("src/cn/tedu/submainre/img/minesubm.png");
        obsersubm=new ImageIcon("src/cn/tedu/submainre/img/obsersubm.png");
        sea=new ImageIcon("src/cn/tedu/submainre/img/sea.png");
        start=new ImageIcon("src/cn/tedu/submainre/img/start.png");
        torpedo=new ImageIcon("src/cn/tedu/submainre/img/torpedo.png");
        torpesubm=new ImageIcon("src/cn/tedu/submainre/img/torpesubm.png");
    }

    public static void main(String[] args) {
        System.out.println(bomb.getImageLoadStatus());
        System.out.println(battleship.getImageLoadStatus());
        System.out.println(gameover.getImageLoadStatus());
        System.out.println(mine.getImageLoadStatus());
        System.out.println(minesubm.getImageLoadStatus());
        System.out.println(obsersubm.getImageLoadStatus());
        System.out.println(sea.getImageLoadStatus());
        System.out.println(start.getImageLoadStatus()); //测试图片是否引用成功
        System.out.println(torpedo.getImageLoadStatus());
        System.out.println(torpesubm.getImageLoadStatus());
    }
}
