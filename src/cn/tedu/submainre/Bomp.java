package cn.tedu.submainre;

import javax.swing.*;

//深水炸弹类
public class Bomp extends SeaObject {

    Bomp(int x,int y){
        super(x,y,9,12,3);
       //构造函数

    }
//    方法重写


    public void step(){
//        子类共有方法
        y+=speed;
    }

    @Override
    protected ImageIcon getImage() {//需要判断深水炸弹对象的生存状态
        if(this.isLive()){
            return ImageResources.bomb;

        }
        return null;
    }
}
