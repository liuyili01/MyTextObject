package regexdemo;
//正则表达式
public class regexdemo {
    public static void main(String[] args) {
        String mail="sdfsdfsdfasd@qq.com";
        String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";
        if (mail.matches(regex)) {
            System.out.println("是邮箱");
        } //判断正则式是否能匹配上

    }
}
