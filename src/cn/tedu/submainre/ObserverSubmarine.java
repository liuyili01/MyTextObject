package cn.tedu.submainre;

import javax.swing.*;

//侦查潜艇类
public class ObserverSubmarine extends SeaObject {

    ObserverSubmarine(){
        super(63,19);//调用父类构造函数

    }
    @Override
     public void step(){
//        子类共有方法

        x+=speed;

    }

    @Override
    protected ImageIcon getImage() {
        if(isLive()){
            return ImageResources.obsersubm;
        }
        return null;
    }
}


