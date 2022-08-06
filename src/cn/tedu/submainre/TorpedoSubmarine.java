package cn.tedu.submainre;

import javax.swing.*;

//鱼雷潜艇类
public class TorpedoSubmarine  extends SeaObject implements EnemyScore{


    //带参构造函数
    TorpedoSubmarine(){
        super(64,20);//调用父类 有参构造方法
//        明确调用父类有参构造函数

    }
    @Override
    public void step(){
//        子类共有方法 方法重写
        x+=speed;
    }
    protected boolean isOutBounds() {
        return this.x>=641;
    }
    @Override
    protected ImageIcon getImage() {
        if(isLive()){
            return ImageResources.torpesubm;//获取图片
        }
        return null;
    }

    @Override
    public int Score() {
        return 40; //接口的方法重写
    }
}
