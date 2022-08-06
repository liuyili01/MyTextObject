package cn.tedu.submainre;

import javax.swing.*;
import java.awt.*;

//当前七个模板类的父类
public abstract class SeaObject { //抽象类

    protected int x;
    protected int y;
    protected int width;
    protected int height; //子类共有属性
    protected int speed;
    private boolean currentStaTe;
    public static final int LIVE=0;//生存状态
    public  static final int DEAD=1;//死亡状态
    public int currentState=LIVE;//默认生存状态
    protected abstract void step();
    protected boolean isOutBounds(){
        return  this.x>=GameWorld.WITDTH;//判断潜艇的x 是否越界
    }
    protected abstract ImageIcon getImage();//抽象方法 封装
    SeaObject(int width,int height){
        this.width=width;
        this.height=height;
        x=-width;
        y=(int)(Math.random()*(GameWorld.HEIGHR-height-150)+150);
        speed=(int)(Math.random()*(3-1)+1);//次构造函数是为三种潜艇提供的构造方法
    }
//    此构造方法是为战舰，深水炸弹，鱼类，水雷提供的 构造方法也是方法可以重构
    SeaObject(int x,int y,int width,int height,int speed ){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.speed=speed;
    };
    protected boolean isLive(){
        return this.currentState==LIVE;

    }
    protected boolean isDead(){
        return this.currentState==DEAD;
    }
    protected SeaObject shootSubmarin(){
        int x=this.x+this.width;//雷对象的x坐标
        int y=this.y-5;//雷的坐标
        if(this instanceof TorpedoSubmarine){//判断当前对象是鱼雷潜艇类型的话
            return new Torppedo(x,y);//

        }else if (this instanceof MinSubmarine){//如果当前对象是水雷潜艇类型的话
            return new Mine(x,y);//返回水雷对象

        }
        return null;
    }
    public void printImage(Graphics g){
        ImageIcon icon=this.getImage();
        if (icon!=null){
            icon.paintIcon(null,g,this.x,this.y);
        }
    }
}
