package cn.tedu.submainre;

import javax.swing.*;

//水雷
public class Mine extends SeaObject {

    Mine(int x,int y){
        super(x,y,11,11,2);
//        this.x=x;
//        this.y=y;
//        width=11;
//        height=11;
//        speed=2;
        //构造函数


    }
    @Override
    public void step(){
//        子类共有方法
        y-=speed;
    }

    @Override
    protected boolean isOutBounds() {
        return this.y<=150-this.height;//如果水雷对象的y小于或者等于150-自身的高，说明到水面上了
    }

    @Override
    protected ImageIcon getImage() {
        if(isLive()){
            return ImageResources.mine;
        }
        return null;
    }
}
