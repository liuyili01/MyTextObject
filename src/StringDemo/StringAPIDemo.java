package StringDemo;
//StringAPI的使用演示类
public class StringAPIDemo {
    public static void main(String[] args) {
        String str="Thinking in Java 是一本好书";
        int a=str.length();//获取字符串长度的方法
        System.out.println(a);
        System.out.println(str.charAt(18));//按照字符串下标获取字符
        int cont=0;
        char z='i';
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==z){
                cont+=1;
            }
        }
        System.out.println(cont);
        int index=str.indexOf('i',3);//该方法从头到尾检测每个字符串是否等于i,下标从3开始
        System.out.println(index);
        index=str.indexOf("Java");//检测到则理解返回字符串首字符的下标
        System.out.println(index);//如果结果为-1表示没有检测出该字符 lastInexof从尾到头
        //字符串转换大小写
        str=str.toUpperCase();//转大写
        str=str.toLowerCase();//转小写
        String name=" Tom ";
        name=name.trim();//去除空格
        name.startsWith("T");//判断是否以T开头
        name.endsWith("m");//判断是否以m结尾
    }
}
