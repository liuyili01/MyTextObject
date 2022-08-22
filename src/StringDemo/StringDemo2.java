package StringDemo;

public class StringDemo2 {
    //截取字符串
    public static void main(String[] args) {
        String mail="260162691@qq.com";
//        mail= mail.substring(0,9);
        System.out.println(mail);//截取字符串
        int endIndex=mail.indexOf("@");
        mail=mail.substring(0,endIndex);
        System.out.println(mail);
//String 提供了一个静态的方法 valueof方法 可以将数值类型转换为String类型
        int a=123;
        String b=String.valueOf(a);
        System.out.println(b);

        System.out.println(456);//打印语句的数据都是被String.valueof转换了
        String c="";
        System.out.println(b.isEmpty());//判断是否为空字符串
        String d="abcdefg";
        char [] r1=d.toCharArray();//转换为char数组
        for (char value : r1) {
            System.out.print(value);
        }
    }


}
