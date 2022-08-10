package cn.tedu.submainre;

import javax.swing.*;

//战舰类
public class Battleship extends SeaObject {

    private int life;
    public int getLife(){
        return this.life;//对外返回生命的参数
    }
    public void setLife(int life){
        this.life+=life;//对外提供修改生命的值的方法
    }
    Battleship(){
        super(270,124,66,26,20);
//       调用父类带参构造函数
        life=5;//生命值
    }
    public void leftMove(){
        this.x-=speed;
    }
    public  void rightMove(){
        this.x+=speed;
    }
//    方法重写
@Override
    public void step(){
        System.out.println("海战舰类重写方法");
    }

//    @Override
//    protected boolean isOutBounds() {
//        return this.x<=0 || this.x>=641;
//    }

    @Override
    protected ImageIcon getImage() {//战舰比较特殊，有有血量，且战舰死亡游戏结束
        return ImageResources.battleship;
    }
//    发生深水炸弹的方法
    public Bomp shootBomb(){
        return new Bomp(this.x,this.y);//返回深水炸弹对象，生成的坐标取决于战舰的坐标
    }
}
