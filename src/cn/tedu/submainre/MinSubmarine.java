package cn.tedu.submainre;

import javax.swing.*;

//水雷潜艇
public class MinSubmarine extends SeaObject implements EnemyLife{

    MinSubmarine(){
        super(63,19);//调用父类 有参构造方法

    }
    @Override
    public  void step(){
//        子类共有方法
        x+=speed;
    }

    @Override
    protected ImageIcon getImage() {
        if(isLive()){
         return ImageResources.minesubm;
        }
        return null;
    }

    @Override
    public int getLife() {
        return 1;
    }
}
