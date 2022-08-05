package cn.tedu.submainre;

import javax.swing.*;

//鱼雷类
public class Torppedo  extends SeaObject{

    Torppedo(int x,int y){
        super(x,y,5,8,2);
//        调用父类带参构造函数
    }
    @Override
      public void step(){

        //方法重写
//        子类共有方法
        y-=speed+3;

    }

    @Override
    protected ImageIcon getImage() {
        if(isLive()){
            return ImageResources.torpedo;
        }
        return null;
    }
}
