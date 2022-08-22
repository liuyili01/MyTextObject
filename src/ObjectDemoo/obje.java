package ObjectDemoo;

public class obje {
    public static void main(String[] args) {
        Point p=new Point(1,2);
        p.toString();//访问父类的toString方法
        //直接打印的话会打印toString方法
        //toString方法
        System.out.println(p);//打印内容是全包名@对象地址 默认为p.toString
    }
}
