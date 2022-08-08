package cn.tedu.submainre;
import javax.swing.*;
import java.util.TimerTask;//定时器任务模板
import java.util.Timer;//定时器模板
import java.util.Arrays;
import java.awt.event.KeyEvent;//键盘事件
import java.awt.event.KeyAdapter;//键盘侦听器




import java.awt.*;

/*
* 游戏窗口类
* 游戏运行类
* */
public class GameWorld extends JPanel {

    //继承底板类
    public static final int WITDTH=641;
    public static final int HEIGHR=479;//窗口宽高
    protected Battleship ship=new Battleship();  //  --成员变量（全局变量）
    protected Bomp[] bomp={};//创建一个深水炸弹类
    protected SeaObject[] submarines={};//所有潜艇的父类型数组
//    ObserverSubmarine[] observerSubmmarine;
//    MinSubmarine[] minSubmarine ; //三种潜艇对象
//    TorpedoSubmarine[] torpedoSubmarine ;
   protected SeaObject[] thunders={};//两张炸弹的父类型数组对象但是没有开辟空间
//    Mine[] mine;
//    Torppedo[] torppedo ;//=new Torppedo();//创建一个鱼雷对象，这样创建也生效,但是无法重复调用
public SeaObject CreateSubmarine(){
    int a=(int)(Math.rint( Math.random()*20));
    if(a<8){
        return new ObserverSubmarine();
    }else if(a<14){
        return new MinSubmarine();//随机生成潜艇对象
    }else {
        return new TorpedoSubmarine();
    }
}
    public int sumbarineEnterIndex=0;//潜艇对象生成速度的索引
    public int thunderEnterIndex=0;
//潜艇对象入场  放进run中自动执行
    public void SubmarinesEnterAction(){
        sumbarineEnterIndex++;//每10毫秒自增一次
        if(sumbarineEnterIndex%30==0) { //控制潜艇生成速度 做延迟
            SeaObject obj = CreateSubmarine();
            submarines = Arrays.copyOf(submarines, submarines.length + 1);//数组扩容
            submarines[submarines.length - 1] = obj;
        }
    }

//    雷入场的方法
    public void thunderEnterAction(){
        thunderEnterIndex++;
        if(thunderEnterIndex%100==0) {//延迟执行
            for (int i = 0; i < submarines.length; i++) {
                SeaObject obj = submarines[i].shootSubmarin();//接收雷对象
                if (obj != null) {
                    thunders = Arrays.copyOf(thunders, thunders.length + 1);
                    thunders[thunders.length - 1] = obj;
                }
            }
        }
    }
//移动执行方法,自动移动对象的方法
    public void stepAction(){
        for (int i = 0; i < submarines.length; i++) {
            submarines[i].step();  //遍历各个数组对象的对象中的step方法。
        }
        for (int i = 0; i < thunders.length; i++) {
            thunders[i].step();
        }
        for (int i = 0; i < bomp.length; i++) {
            bomp[i].step();
        }
//        for (int i = 0; i < bomp.length; i++) {
//            bomp[i].step();
//        }

    }
    public  void bompEnterAction(){
        Bomp b=ship.shootBomb();
        bomp=Arrays.copyOf(bomp,bomp.length+1);
        bomp[bomp.length-1]=b;
    }
//    删除越界元素
    public void outOfBounds(){
//       遍历数组
        for(int i=1;i<submarines.length;i++){//绘制潜艇图片
            if(submarines[i].isOutBounds()){
                submarines[i]= submarines[submarines.length-1];//将数组中的最后一个元素赋值给当前越界对象位置i
                submarines=Arrays.copyOf(submarines,submarines.length-1);//数组缩容
            }
        }
        for (int i = 0; i < thunders.length; i++) {
            if(thunders[i].isOutBounds()){
                thunders[i]=thunders[thunders.length-1];
                thunders =Arrays.copyOf(thunders,thunders.length-1);
            }
        }
//        for (int i = 0; i < bomp.length; i++) {
//            if (bomp[i].isOutBounds()) {
//
//                bomp[i] = bomp[bomp.length - 1];
//                bomp = Arrays.copyOf(bomp, bomp.length - 1);
//            }
//        }


    }
//    处理深水炸弹与潜艇碰撞的行为使用实现
    public void bompBangAction(){
//        碰撞判断
        for (int i = 0; i < bomp.length; i++) {
            Bomp b=bomp[i]; //用每个炸弹对象来判断是否碰撞上了所有的潜艇对象
            for (int j = 0; j < submarines.length; j++) {
                if(b.isHit(submarines[j])){
                    System.out.println("发生了碰撞");
                }
            }
        }


    }

    protected void action(){
        //实现侦听
        KeyAdapter adapter=new KeyAdapter() { //键盘侦听器
            @Override
            public void keyPressed(KeyEvent e) {//参数e代表用户按下的键e.getKeyCode
                if(e.getKeyCode()==KeyEvent.VK_SPACE){ //返回值是ASCII
//                    System.out.println(KeyEvent.VK_SPACE);
                    bompEnterAction();


                }
                if(e.getKeyCode()==KeyEvent.VK_LEFT){
                    ship.leftMove();
                }
                if (e.getKeyCode()==KeyEvent.VK_RIGHT){
                    ship.rightMove();
                }


            }
        };
        this.addKeyListener(adapter);//侦听的对象

        Timer timer=new Timer();//创建定时器对象
        TimerTask task=new TimerTask() {//定时器  匿名内部类
            @Override
            public void run() { //内部类

                SubmarinesEnterAction();//调用生成潜艇方法
                thunderEnterAction();//调用生成雷方法
                stepAction();//调用移动方法
                bompBangAction();//调用碰撞测试方法
                outOfBounds();
                repaint();//重新绘制
            }
        };
        timer.schedule(task,10,10);//对象，开始时间，间隔时间
        //带参对象函数，可以多次调用
//            submarines=new SeaObject[6];
//            submarines[1]=new TorpedoSubmarine();
//            submarines[2]=new MinSubmarine();
//            submarines[3]=new TorpedoSubmarine();
//            submarines[4]=new ObserverSubmarine();
//            submarines[5]=new MinSubmarine();


//对象-》继承》父类型=》父类型构造方法》子类型》向上造型
//            thunders=new SeaObject[4];
//            thunders[0]=new Mine(4,8);
//            thunders[1]=new Bomp(4,8);
//            thunders[2]=new Mine(5,8);
//            thunders[3]=new Torppedo(8,5);
//        for (int i = 0; i <thunders.length; i++) {
//            thunders[i].step();
//        }

//
//        bomp =new Bomp[1];//创建一个深水炸弹数组对象
//        bomp[0]=new Bomp(10,10);
//        bomp[1]=new Bomp(20,20);//为每个数组创建对象
//        observerSubmmarine =new ObserverSubmarine[5];//创建一个侦查潜艇数组对象
//        minSubmarine =new MinSubmarine[5];//创建一个水雷潜艇数组对象
//        torpedoSubmarine =new TorpedoSubmarine[5];//创建鱼雷潜艇对象
//
//        mine = new Mine[3];//创建水雷类                               可重复调用
//        torppedo=new Torppedo[3];//创建鱼雷类

    }
//绘制游戏窗口

    protected void printWprld(){
        JFrame frame=new JFrame();//创建具体的画框对象
        this.setFocusable(true);//设置当前是否可聚焦
        frame.add(this);//添加底板当前GameWorld类
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置默认关闭操作 点击关闭按钮释放程序
        frame.setSize(WITDTH+16,HEIGHR+39);//设置窗口大小
        frame.setLocationRelativeTo(null);//设置相对位置
        frame.setVisible(true);//设置是否可见
    }
//    绘制游戏图片对象
public void paint(Graphics g) { //系统提供绘制的方法
//        绘制背景板
    ImageResources.sea.paintIcon(null,g,0,0);
    //绘制战舰图片
    ship.printImage(g);
    for(int i=1;i<submarines.length;i++){//绘制潜艇图片
        submarines[i].printImage(g);
    }
    for (int i = 0; i < thunders.length; i++) {
        thunders[i].printImage(g);
    }
    for (int i = 0; i < bomp.length; i++) {
        bomp[i].printImage(g);
    }
}
    public static void main(String[] args) {

        GameWorld gw=new GameWorld();//新建GameWorld对象
        gw.action();
        gw.printWprld();//调用窗口
    }
}
